package Seh.jingling;

import java.util.Random;

import Seh.logic.HarmCalculation;
import Seh.logic.JingLing;
import Seh.logic.TotalData;
import Seh.logic.skill;

public class LuSiWang extends JingLing implements skill {

	public LuSiWang() {
		super("鲁斯王", "水系", 452, 373, 222, 203, 220, 208, 20, 20);
	}

	@Override
	public void skill1(JingLing AI2) {

		/*
		 * 剑舞：增强自身百分之20的攻击
		 */

		System.out.println("\t\t  " + getName() + "：剑舞！");

		int temp = (int) (getWG() * 1.2) - getWG(); // temp 存储着增幅的值
		int up = getWGup() + temp; // GJuo 存储着原增幅属性+本次增幅属性

		if (up > getWG() * 0.6) {
			setWGup((int) (getWG() * 0.6f));
		} else {
			setWGup(up);
		}
		System.out.print("\t\t  " + getName() + "：攻击+20%");

	}

	@Override
	public void skill2(JingLing AI2) {

		/*
		 * 浪打千里：造成20点物理攻击，一回合作5-8次攻击
		 */

		Random ra = new Random();
		float X = (ra.nextInt(3)+5)*2;
		X /= 10;
		System.out.println("\t\t  " + getName() + "：浪打千里！");

		int[] harmIsMiss = new int[2]; // 伤害和是否MISS
		harmIsMiss = TotalData.getTotalWgHarm(this, AI2, X); // 返回伤害
		
		harmIsMiss[0] *= HarmCalculation.waterG(AI2.getType()); // 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // 减血
		System.out.println("\t\t  " + AI2.getName() + "：体力-" + harmIsMiss[0]);

	}

	@Override
	public void skill3(JingLing AI2) {

		/*
		 * 水天一色：接下来的两回合水系伤害翻倍
		 */

		System.out.println("\t\t  " + getName() + "：水天一色！");

		// 特殊效果
		setEffect(1, 2);

	}

	@Override
	public void skill4(JingLing AI2) {

		/*
		 * 湍流龙击打：造成150点物理攻击，连续使用每次威力增加20，最高威力190
		 */

		System.out.println("\t\t  " + getName() + "：湍流龙击打！");

		int[] harmIsMiss = new int[2]; // 伤害和是否MISS
		harmIsMiss = TotalData.getTotalWgHarm(this, AI2, 1.5f); // 返回伤害

		// 特殊效果
		if (harmIsMiss[1] == 1) {

			setEffect(2, 2);

		}

		harmIsMiss[0] *= HarmCalculation.waterG(AI2.getType()); // 属性克制伤害
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // 减血
		System.out.println("\t\t  " + AI2.getName() + "：体力-" + harmIsMiss[0]);

	}

}
