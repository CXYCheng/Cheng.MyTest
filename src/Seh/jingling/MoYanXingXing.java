package Seh.jingling;

import Seh.logic.HarmCalculation;
import Seh.logic.JingLing;
import Seh.logic.TotalData;
import Seh.logic.skill;

public class MoYanXingXing extends JingLing implements skill {


	public MoYanXingXing() {
		super("ħ������","��ϵ",444,356,196,234,196,264,20,20);
	}

	@Override
	public void skill1(JingLing AI2) {
		
		/*
		 * 	���ѣ������� �ع���ǿ�ٷ�֮20
		 */
		
		System.out.println("\t\t  "+getName()+"�����ѣ�");
		
		int temp = (int) (getWG() * 1.2) - getWG();			// temp �洢��������ֵ
		int up = getWGup() + temp;						// GJuo �洢��ԭ��������+������������
		
		if (up > getWG()*0.6) {
			setWGup((int) (getWG() * 0.6f));
		} else {
			setWGup(up);
		}		
		System.out.print("\t\t  "+getName()+"������+20%");
		
		temp = (int) (getTG() * 1.2) - getTG();				// temp �洢��������ֵ
		up = getTGup() + temp;							// GJuo �洢��ԭ��������+������������
		
		if (up > getTG()*0.6) {
			setTGup((int) (getTG() * 0.6f));
		} else {
			setTGup(up);
		}	
		System.out.println("\t�ع�+20%");
	}

	@Override
	public void skill2(JingLing AI2) {
		
		/*
		 * 	�������棺���100�������˺��������аٷ�֮5������ɱ����
		 */
		System.out.println("\t\t  "+getName()+"���������棡");
		
		int[] harmIsMiss = new int[2];	// �˺����Ƿ�MISS
		harmIsMiss = TotalData.getTotalTgHarm(this,AI2,1.0f); 	//	�����˺�
		harmIsMiss[0] = Math.abs(harmIsMiss[0]);
		// ����Ч��
		if (harmIsMiss[1] == 1) {
			if (TotalData.isBJ(20)) {
				System.out.println("\t\t  ����������Ч����ɱ��");
				System.out.println("\t\t  " + AI2.getName() + "������-" + AI2.getTL());
				AI2.setTL(0);
				return;
			}
		}
		
		harmIsMiss[0] *= HarmCalculation.fireG(AI2.getType());	// ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]);		// ��Ѫ
		System.out.println("\t\t  "+AI2.getName()+"������-"+harmIsMiss[0]);
		
	}

	@Override
	public void skill3(JingLing AI2) {
		
		/*
		 * 	����֮�����150�������˺�����ʹ�з�������غϣ�ÿ�غϵ�Ѫ30
		 */
		System.out.println("\t\t  "+getName()+"������֮��");
		
		int[] harmIsMiss = new int[2];	// �˺����Ƿ�MISS
		harmIsMiss = TotalData.getTotalTgHarm(this,AI2,1.5f); 	//	�����˺�
		
		// ����Ч��
		if (harmIsMiss[1] == 1) {
			AI2.setEffect(5 - 1, 5); // ��һ��������������˺����ڶ��������������5�غ�
		}
		
		harmIsMiss[0] *= HarmCalculation.fireG(AI2.getType());	// ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]);		// ��Ѫ
		System.out.println("\t\t  "+AI2.getName()+"������-"+harmIsMiss[0]);
	}

	@Override
	public void skill4(JingLing AI2) {
		
		/*
		 * 	ħ���ѿջ������150�������˺�����5�غ�����ǿ����16/1�ı�������
		 */
		
		System.out.println("\t\t  " + getName() + "��ħ���ѿջ���");

		int[] harmIsMiss = new int[2]; // �˺����Ƿ�MISS
		harmIsMiss = TotalData.getTotalWgHarm(this, AI2, 1.5f);	 // �����˺�

		
		// ����Ч��
		if (harmIsMiss[1] == 1) {
			this.setEffect(1, 5);		// 12��ʾ��ǿЧ����34��ʾ����Ч��
		}

		harmIsMiss[0] *= HarmCalculation.fireG(AI2.getType());	// ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // ��Ѫ
		System.out.println("\t\t  " + AI2.getName() + "������-" + harmIsMiss[0]);

	}

}
