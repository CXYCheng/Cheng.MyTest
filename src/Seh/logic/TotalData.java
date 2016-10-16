package Seh.logic;

import java.util.Random;

/*
 * 	������������
 */

public class TotalData {

	// ����ȫ��������
	public static int getTotalWG(JingLing p) {
		return p.getWG() + p.getWGup();
	}

	// ����ȫ���������
	public static int getTotalWF(JingLing p) {
		return p.getWF() + p.getWFup();
	}

	// ����ȫ�����⹥��
	public static int getTotalTG(JingLing p) {
		return p.getTG() + p.getTGup();
	}

	// ����ȫ���������
	public static int getTotalTF(JingLing p) {
		return p.getTF() + p.getTFup();
	}

	// ����ȫ���ٶ�
	public static int getTotalSD(JingLing p) {
		return p.getSD() + p.getSDup();
	}

	// ����ȫ������
	public static int getTotalBJ(JingLing p) {
		return p.getBJ() + p.getBJup();
	}

	// ����ȫ������
	public static int getTotalSB(JingLing p) {
		return p.getSB() + p.getSBup();
	}

	// �жϱ���
	public static boolean isBJ(int TotalBJ) {

		Random ra = new Random();

		if (ra.nextInt(TotalBJ) % TotalBJ == 0) {
			return true;
		} else
			return false;
	}

	// �ж�����
	public static boolean isSB(int TotalSB) {

		Random ra = new Random();

		if (ra.nextInt(TotalSB) % TotalSB == 0) {
			return true;
		} else
			return false;
	}

	// �﹥�˺��ܺ�
	public static int[] getTotalWgHarm(JingLing AI1,JingLing AI2,float UP) {
		
		int hram;	// �˺�
		int[] hramIsMiss = new int[]{0,1};		// 0��ʾ�˺���1��ʾ�Ƿ�����
		
		hram = (int) (TotalData.getTotalWG(AI1) * UP);			// �����˺�
		hram = hram - TotalData.getTotalWF(AI2);				// AI2�������������AI1��������

		// �ж�AI1�Ƿ񴥷�����
		if(TotalData.isBJ(TotalData.getTotalBJ(AI1))) {
			System.out.println("\t\t  ����һ����");
			hram *= 2;		// ����˫���˺�
			AI2.setWFup(0);	// �����Ʒ�
		// �����������ж�AI2�Ƿ�������
		} else if (TotalData.isSB(TotalData.getTotalSB(AI2))) {
			System.out.println("\t\t  MISS��");
			
			hramIsMiss[0] = 0;
			hramIsMiss[0] = 1;
			
			return hramIsMiss;
		}
		
		hramIsMiss[0] = getRandomHarm(hram);
		
		return hramIsMiss;
	}

	// �ع��˺��ܺ�
	public static int[] getTotalTgHarm(JingLing AI1,JingLing AI2,float UP) {
		
		int hram;	// �˺�
		int[] hramIsMiss = new int[]{0,1};		// 0��ʾ�˺���1��ʾ�Ƿ�����
		
		hram = (int) (TotalData.getTotalTG(AI1) * UP);			// �����˺�
		hram = hram - TotalData.getTotalTF(AI2);				// AI2�������������AI1��������

		// �ж�AI1�Ƿ񴥷�����
		if(TotalData.isBJ(TotalData.getTotalBJ(AI1))) {
			System.out.println("\t\t  ����һ����");
			hram *= 2;		// ����˫���˺�
			AI2.setWFup(0);	// �����Ʒ�
		// �����������ж�AI2�Ƿ�������
		} else if (TotalData.isSB(TotalData.getTotalSB(AI2))) {
			System.out.println("\t\t  MISS��");
			
			hramIsMiss[0] = 0;
			hramIsMiss[0] = 1;
			
			return hramIsMiss;
		}
		
		hramIsMiss[0] = getRandomHarm(hram);
		
		return hramIsMiss;
	}
	
	// �������˺�(���¸���15)
	public static int getRandomHarm(int harm) {
	
		Random ra = new Random();
		int random = ra.nextInt(30);
		return harm+random-15;
		
	}
	
}
