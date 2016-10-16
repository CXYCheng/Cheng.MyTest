package Seh.app;

import java.util.Random;
import java.util.Scanner;

import Seh.jingling.LiShaBuBu;
import Seh.jingling.MoYanXingXing;
import Seh.logic.JingLing;

public class Seh {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MoYanXingXing p1 = new MoYanXingXing();
		LiShaBuBu p2 = new LiShaBuBu();
		Random ra = new Random();

		boolean isSD;

		if (p1.getSD() > p2.getSD()) {
			isSD = true; // �棬1��ʾ
		} else {
			isSD = false; // �٣�2����
		}

		int[] option = new int[] { 0, 0 };

		while (true) {

			if (isSD) {

				System.out.print("\t\t  ��ѡ���ܣ�");
				option[0] = input.nextInt();

				switch (option[0]) {
					case 1:
						p1.skill1(p2);
						isSD = false;
						break;
					case 2:
						p1.skill2(p2);
						isSD = false;
						break;
					case 3:
						p1.skill3(p2);
						isSD = false;
						break;
					case 4:
						p1.skill4(p2);
						isSD = false;
						break;
				}
			}
			if (isSD) {

				switch (ra.nextInt(4)) {
					case 1:
						p2.skill1(p1);
						isSD = true;
						break;
					case 2:
						p2.skill2(p1);
						isSD = true;
						break;
					case 3:
						p2.skill3(p1);
						isSD = true;
						break;
					case 4:
						p2.skill4(p1);
						isSD = true;
						break;
				}

			}
			option[0 + 1] = option[0];
			p1.print();
			p2.print();

			if (p1.getTL() <= 0 || p2.getTL() <= 0) {
				break;
			}
		}
	}
}
