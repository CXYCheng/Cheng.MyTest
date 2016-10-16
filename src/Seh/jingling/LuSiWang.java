package Seh.jingling;

import java.util.Random;

import Seh.logic.HarmCalculation;
import Seh.logic.JingLing;
import Seh.logic.TotalData;
import Seh.logic.skill;

public class LuSiWang extends JingLing implements skill {

	public LuSiWang() {
		super("³˹��", "ˮϵ", 452, 373, 222, 203, 220, 208, 20, 20);
	}

	@Override
	public void skill1(JingLing AI2) {

		/*
		 * ���裺��ǿ����ٷ�֮20�Ĺ���
		 */

		System.out.println("\t\t  " + getName() + "�����裡");

		int temp = (int) (getWG() * 1.2) - getWG(); // temp �洢��������ֵ
		int up = getWGup() + temp; // GJuo �洢��ԭ��������+������������

		if (up > getWG() * 0.6) {
			setWGup((int) (getWG() * 0.6f));
		} else {
			setWGup(up);
		}
		System.out.print("\t\t  " + getName() + "������+20%");

	}

	@Override
	public void skill2(JingLing AI2) {

		/*
		 * �˴�ǧ����20����������һ�غ���5-8�ι���
		 */

		Random ra = new Random();
		float X = (ra.nextInt(3)+5)*2;
		X /= 10;
		System.out.println("\t\t  " + getName() + "���˴�ǧ�");

		int[] harmIsMiss = new int[2]; // �˺����Ƿ�MISS
		harmIsMiss = TotalData.getTotalWgHarm(this, AI2, X); // �����˺�
		
		harmIsMiss[0] *= HarmCalculation.waterG(AI2.getType()); // ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // ��Ѫ
		System.out.println("\t\t  " + AI2.getName() + "������-" + harmIsMiss[0]);

	}

	@Override
	public void skill3(JingLing AI2) {

		/*
		 * ˮ��һɫ�������������غ�ˮϵ�˺�����
		 */

		System.out.println("\t\t  " + getName() + "��ˮ��һɫ��");

		// ����Ч��
		setEffect(1, 2);

	}

	@Override
	public void skill4(JingLing AI2) {

		/*
		 * �������������150��������������ʹ��ÿ����������20���������190
		 */

		System.out.println("\t\t  " + getName() + "������������");

		int[] harmIsMiss = new int[2]; // �˺����Ƿ�MISS
		harmIsMiss = TotalData.getTotalWgHarm(this, AI2, 1.5f); // �����˺�

		// ����Ч��
		if (harmIsMiss[1] == 1) {

			setEffect(2, 2);

		}

		harmIsMiss[0] *= HarmCalculation.waterG(AI2.getType()); // ���Կ����˺�
		AI2.setTL(AI2.getTL() - harmIsMiss[0]); // ��Ѫ
		System.out.println("\t\t  " + AI2.getName() + "������-" + harmIsMiss[0]);

	}

}
