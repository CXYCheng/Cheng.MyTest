package Seh.jingling;

import Seh.logic.HarmCalculation;
import Seh.logic.JingLing;
import Seh.logic.TotalData;
import Seh.logic.skill;

public class MoYanXingXing extends JingLing implements skill {


	public MoYanXingXing() {
		super("魔焰猩猩","火系",444,356,196,234,196,264,20,20);
	}

	@Override
	public void skill1(JingLing AI2) {
		
		/*
		 * 	觉醒：自身攻击 特攻增强百分之20
		 */
		
		System.out.println("\t\t  "+getName()+"：觉醒！");
		
		int temp = (int) (getWG() * 1.2) - getWG();			// temp 存储着增幅的值
		int up = getWGup() + temp;						// GJuo 存储着原增幅属性+本次增幅属性
		
		if (up > getWG()*0.6) {
			setWGup((int) (getWG() * 0.6f));
		} else {
			setWGup(up);
		}		
		System.out.print("\t\t  "+getName()+"：攻击+20%");
		
		temp = (int) (getTG() * 1.2) - getTG();				// temp 存储着增幅的值
		up = getTGup() + temp;							// GJuo 存储着原增幅属性+本次增幅属性
		
		if (up > getTG()*0.6) {
			setTGup((int) (getTG() * 0.6f));
		} else {
			setTGup(up);
		}	
		System.out.println("\t特攻+20%");
	}

	@Override
	public void skill2(JingLing AI2) {
		
		/*
		 * 	绝命火焰：造成100点特殊伤害，并且有百分之5几率秒杀对手
		 */
		System.out.println("\t\t  "+getName()+"：绝命火焰！");
		
		int[] harmIsMiss = new int[2];	// 伤害和是否MISS
		harmIsMiss = TotalData.getTotalTgHarm(this,AI2,1.0f); 	//	返回伤害
		harmIsMiss[0] = Math.abs(harmIsMiss[0]);
		// 特殊效果
		if (harmIsMiss[1] == 1) {
			if (TotalData.isBJ(20)) {
				System.out.println("\t\t  触发攻击特效：秒杀！");
				System.out.println("\t\t  " + AI2.getName() + "：体力-" + AI2.getTL());
				AI2.setTL(0);
				return;
			}
		}
		
		harmIsMiss[0] *= HarmCalculation.fireG(AI2.getType());	// 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]);		// 减血
		System.out.println("\t\t  "+AI2.getName()+"：体力-"+harmIsMiss[0]);
		
	}

	@Override
	public void skill3(JingLing AI2) {
		
		/*
		 * 	不灭之火：造成150点特殊伤害，并使敌方持续五回合，每回合掉血30
		 */
		System.out.println("\t\t  "+getName()+"：不灭之火！");
		
		int[] harmIsMiss = new int[2];	// 伤害和是否MISS
		harmIsMiss = TotalData.getTotalTgHarm(this,AI2,1.5f); 	//	返回伤害
		
		// 特殊效果
		if (harmIsMiss[1] == 1) {
			AI2.setEffect(5 - 1, 5); // 第一个参数代表持续伤害，第二个参数代表持续5回合
		}
		
		harmIsMiss[0] *= HarmCalculation.fireG(AI2.getType());	// 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]);		// 减血
		System.out.println("\t\t  "+AI2.getName()+"：体力-"+harmIsMiss[0]);
	}

	@Override
	public void skill4(JingLing AI2) {
		
		/*
		 * 	魔焰裂空击：造成150点物理伤害，并5回合内增强自身16/1的暴击几率
		 */
		
		System.out.println("\t\t  " + getName() + "：魔焰裂空击！");

		int[] harmIsMiss = new int[2]; // 伤害和是否MISS
		harmIsMiss = TotalData.getTotalWgHarm(this, AI2, 1.5f);	 // 返回伤害

		
		// 特殊效果
		if (harmIsMiss[1] == 1) {
			this.setEffect(1, 5);		// 12表示增强效果，34表示削弱效果
		}

		harmIsMiss[0] *= HarmCalculation.fireG(AI2.getType());	// 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // 减血
		System.out.println("\t\t  " + AI2.getName() + "：体力-" + harmIsMiss[0]);

	}

}
