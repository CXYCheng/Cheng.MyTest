package Seh.logic;

import java.util.Random;

/*
 * 	返回总属性类
 */

public class TotalData {

	// 返回全部物理攻击
	public static int getTotalWG(JingLing p) {
		return p.getWG() + p.getWGup();
	}

	// 返回全部物理防御
	public static int getTotalWF(JingLing p) {
		return p.getWF() + p.getWFup();
	}

	// 返回全部特殊攻击
	public static int getTotalTG(JingLing p) {
		return p.getTG() + p.getTGup();
	}

	// 返回全部特殊防御
	public static int getTotalTF(JingLing p) {
		return p.getTF() + p.getTFup();
	}

	// 返回全部速度
	public static int getTotalSD(JingLing p) {
		return p.getSD() + p.getSDup();
	}

	// 返回全部暴击
	public static int getTotalBJ(JingLing p) {
		return p.getBJ() + p.getBJup();
	}

	// 返回全部闪避
	public static int getTotalSB(JingLing p) {
		return p.getSB() + p.getSBup();
	}

	// 判断暴击
	public static boolean isBJ(int TotalBJ) {

		Random ra = new Random();

		if (ra.nextInt(TotalBJ) % TotalBJ == 0) {
			return true;
		} else
			return false;
	}

	// 判断闪避
	public static boolean isSB(int TotalSB) {

		Random ra = new Random();

		if (ra.nextInt(TotalSB) % TotalSB == 0) {
			return true;
		} else
			return false;
	}

	// 物攻伤害总和
	public static int[] getTotalWgHarm(JingLing AI1,JingLing AI2,float UP) {
		
		int hram;	// 伤害
		int[] hramIsMiss = new int[]{0,1};		// 0表示伤害，1表示是否闪避
		
		hram = (int) (TotalData.getTotalWG(AI1) * UP);			// 基本伤害
		hram = hram - TotalData.getTotalWF(AI2);				// AI2的物理防御抵消AI1的物理攻击

		// 判断AI1是否触发暴击
		if(TotalData.isBJ(TotalData.getTotalBJ(AI1))) {
			System.out.println("\t\t  致命一击！");
			hram *= 2;		// 暴击双倍伤害
			AI2.setWFup(0);	// 暴击破防
		// 若不暴击，判断AI2是否能闪避
		} else if (TotalData.isSB(TotalData.getTotalSB(AI2))) {
			System.out.println("\t\t  MISS！");
			
			hramIsMiss[0] = 0;
			hramIsMiss[0] = 1;
			
			return hramIsMiss;
		}
		
		hramIsMiss[0] = getRandomHarm(hram);
		
		return hramIsMiss;
	}

	// 特攻伤害总和
	public static int[] getTotalTgHarm(JingLing AI1,JingLing AI2,float UP) {
		
		int hram;	// 伤害
		int[] hramIsMiss = new int[]{0,1};		// 0表示伤害，1表示是否闪避
		
		hram = (int) (TotalData.getTotalTG(AI1) * UP);			// 基本伤害
		hram = hram - TotalData.getTotalTF(AI2);				// AI2的物理防御抵消AI1的物理攻击

		// 判断AI1是否触发暴击
		if(TotalData.isBJ(TotalData.getTotalBJ(AI1))) {
			System.out.println("\t\t  致命一击！");
			hram *= 2;		// 暴击双倍伤害
			AI2.setWFup(0);	// 暴击破防
		// 若不暴击，判断AI2是否能闪避
		} else if (TotalData.isSB(TotalData.getTotalSB(AI2))) {
			System.out.println("\t\t  MISS！");
			
			hramIsMiss[0] = 0;
			hramIsMiss[0] = 1;
			
			return hramIsMiss;
		}
		
		hramIsMiss[0] = getRandomHarm(hram);
		
		return hramIsMiss;
	}
	
	// 获得随机伤害(上下浮动15)
	public static int getRandomHarm(int harm) {
	
		Random ra = new Random();
		int random = ra.nextInt(30);
		return harm+random-15;
		
	}
	
}
