package Seh.jingling;

import Seh.logic.HarmCalculation;
import Seh.logic.JingLing;
import Seh.logic.TotalData;
import Seh.logic.skill;

public class LiShaBuBu extends JingLing implements skill {

	public LiShaBuBu() {
		super("丽莎布布", "草系", 464, 178, 248, 349, 260, 188, 20, 20);
	}
	
	@Override
	public void skill1(JingLing AI2) {
		
		/*
		 * 	叶绿光束	特殊攻击	100	令对方所有增强效果消失
		 */
		
		System.out.println("\t\t  " + getName() + "：叶绿光束！");
		int[] harmIsMiss = new int[2];
		harmIsMiss = TotalData.getTotalTgHarm(this, AI2, 1.0f);
		
		// 清除增强效果
		if(harmIsMiss[1] == 1) {
			
			System.out.println("\t\t  " + AI2.getName() + "：增幅效果消失 ↓");
			AI2.setBJup(0);
			AI2.setSBup(0);
			AI2.setWGup(0);
			AI2.setTGup(0);
			AI2.setWFup(0);
			AI2.setTFup(0);
			AI2.setSDup(0);
		}
		
		harmIsMiss[0] *= HarmCalculation.grassG(AI2.getType()); // 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // 减血
		System.out.println("\t\t  " + AI2.getName() + "：体力-" + harmIsMiss[0]);
	}

	@Override
	public void skill2(JingLing AI2) {
		
		/*
		 * 	花草能量 100%改变自身特攻等级2
		 */
		
		System.out.println("\t\t  " + getName() + "：花草能量！");
		
		int temp = (int) (getTG() * 1.2) - getTG(); // temp 存储着增幅的值
		int up = getTGup() + temp; // GJuo 存储着原增幅属性+本次增幅属性

		if (up > getTG() * 0.6) {
			setTGup((int) (getTG() * 0.6f));
		} else {
			setTGup(up);
		}
		System.out.print("\t\t  " + getName() + "：特攻+20%");
		
		
		
	}

	@Override
	public void skill3(JingLing AI2) {
		
		/*
		 * 	究极吸取	特殊攻击	80	给予对方损伤的一半会恢复自己的体力
		 */
		
		System.out.println("\t\t  " + getName() + "：究极吸取！");
		int[] harmIsMiss = new int[2];
		harmIsMiss = TotalData.getTotalTgHarm(this, AI2, 0.8f);
		
		// 给予对方损伤的一半会恢复自己的体力
		if(harmIsMiss[1] == 1) {
			System.out.println("\t\t  " + getName() + "：体力+"+harmIsMiss[0]/2);
			setTL(getTL()+harmIsMiss[0]/2);
		}
		
		harmIsMiss[0] *= HarmCalculation.grassG(AI2.getType()); // 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // 减血
		System.out.println("\t\t  " + AI2.getName() + "：体力-" + harmIsMiss[0]);
		
	}

	@Override
	public void skill4(JingLing AI2) {
		
		/*
		 * 	金光绿叶	特殊攻击	150 三回合内每回合恢复自身体力1/10
		 */
		
		System.out.println("\t\t  " + getName() + "：金光绿叶！");
		int[] harmIsMiss = new int[2];
		harmIsMiss = TotalData.getTotalTgHarm(this, AI2, 1.5f);
		
		// 
		if(harmIsMiss[1] == 1) {
			
			setEffect(1,3);
		}
		
		harmIsMiss[0] *= HarmCalculation.grassG(AI2.getType()); // 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // 减血
		System.out.println("\t\t  " + AI2.getName() + "：体力-" + harmIsMiss[0]);
		
	}

	
}
