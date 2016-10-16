package Seh.jingling;

import Seh.logic.HarmCalculation;
import Seh.logic.JingLing;
import Seh.logic.TotalData;
import Seh.logic.skill;

public class LiShaBuBu extends JingLing implements skill {

	public LiShaBuBu() {
		super("��ɯ����", "��ϵ", 464, 178, 248, 349, 260, 188, 20, 20);
	}
	
	@Override
	public void skill1(JingLing AI2) {
		
		/*
		 * 	Ҷ�̹���	���⹥��	100	��Է�������ǿЧ����ʧ
		 */
		
		System.out.println("\t\t  " + getName() + "��Ҷ�̹�����");
		int[] harmIsMiss = new int[2];
		harmIsMiss = TotalData.getTotalTgHarm(this, AI2, 1.0f);
		
		// �����ǿЧ��
		if(harmIsMiss[1] == 1) {
			
			System.out.println("\t\t  " + AI2.getName() + "������Ч����ʧ ��");
			AI2.setBJup(0);
			AI2.setSBup(0);
			AI2.setWGup(0);
			AI2.setTGup(0);
			AI2.setWFup(0);
			AI2.setTFup(0);
			AI2.setSDup(0);
		}
		
		harmIsMiss[0] *= HarmCalculation.grassG(AI2.getType()); // ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // ��Ѫ
		System.out.println("\t\t  " + AI2.getName() + "������-" + harmIsMiss[0]);
	}

	@Override
	public void skill2(JingLing AI2) {
		
		/*
		 * 	�������� 100%�ı������ع��ȼ�2
		 */
		
		System.out.println("\t\t  " + getName() + "������������");
		
		int temp = (int) (getTG() * 1.2) - getTG(); // temp �洢��������ֵ
		int up = getTGup() + temp; // GJuo �洢��ԭ��������+������������

		if (up > getTG() * 0.6) {
			setTGup((int) (getTG() * 0.6f));
		} else {
			setTGup(up);
		}
		System.out.print("\t\t  " + getName() + "���ع�+20%");
		
		
		
	}

	@Override
	public void skill3(JingLing AI2) {
		
		/*
		 * 	������ȡ	���⹥��	80	����Է����˵�һ���ָ��Լ�������
		 */
		
		System.out.println("\t\t  " + getName() + "��������ȡ��");
		int[] harmIsMiss = new int[2];
		harmIsMiss = TotalData.getTotalTgHarm(this, AI2, 0.8f);
		
		// ����Է����˵�һ���ָ��Լ�������
		if(harmIsMiss[1] == 1) {
			System.out.println("\t\t  " + getName() + "������+"+harmIsMiss[0]/2);
			setTL(getTL()+harmIsMiss[0]/2);
		}
		
		harmIsMiss[0] *= HarmCalculation.grassG(AI2.getType()); // ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // ��Ѫ
		System.out.println("\t\t  " + AI2.getName() + "������-" + harmIsMiss[0]);
		
	}

	@Override
	public void skill4(JingLing AI2) {
		
		/*
		 * 	�����Ҷ	���⹥��	150 ���غ���ÿ�غϻָ���������1/10
		 */
		
		System.out.println("\t\t  " + getName() + "�������Ҷ��");
		int[] harmIsMiss = new int[2];
		harmIsMiss = TotalData.getTotalTgHarm(this, AI2, 1.5f);
		
		// 
		if(harmIsMiss[1] == 1) {
			
			setEffect(1,3);
		}
		
		harmIsMiss[0] *= HarmCalculation.grassG(AI2.getType()); // ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // ��Ѫ
		System.out.println("\t\t  " + AI2.getName() + "������-" + harmIsMiss[0]);
		
	}

	
}
