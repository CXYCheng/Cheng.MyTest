package Seh.logic;

/*
 * 	�˺�������
 */

public class HarmCalculation {

	// ���ػ�ϵ������ϵ���˺�����
	public static float fireG(String type) {

		if (type == "��ϵ") {
			return (float) 2.0;
		} else if (type == "��еϵ") {
			return (float) 2.0;
		} else if (type == "��ϵ") {
			return (float) 2.0;
		} else if (type == "ˮϵ") {
			return (float) 0.5;
		} else if (type == "ʥ��ϵ") {
			return (float) 0.5;
		} else if (type == "��ϵ") {
			return (float) 0.5;
		} else if (type == "��Ȼϵ") {
			return (float) 0.5;
		} else
			return (float) 1.0;
	}

	// ����ˮϵ������ϵ���˺�����
	public static float waterG(String type) {

		if (type == "����ϵ") {
			return (float) 2.0;
		} else if (type == "��ϵ") {
			return (float) 2.0;
		} else if (type == "ˮϵ") {
			return (float) 0.5;
		} else if (type == "��ϵ") {
			return (float) 0.5;
		} else if (type == "��Ȼϵ") {
			return (float) 0.5;
		} else if (type == "ʥ��ϵ") {
			return (float) 0.5;
		} else
			return (float) 1.0;
	}

	// ���ز�ϵ������ϵ���˺�����
	public static float grassG(String type) {

		if (type == "����ϵ") {
			return (float) 2.0;
		} else if (type == "ˮϵ") {
			return (float) 2.0;
		} else if (type == "��ϵ") {
			return (float) 2.0;
		} else if (type == "ʥ��ϵ") {
			return (float) 0.5;
		} else if (type == "��еϵ") {
			return (float) 0.5;
		} else if(type == "��ϵ") {
			return (float) 0.5;
		} else if(type == "Զ��ϵ") {
			return (float) 0.5;
		} else if(type == "����ϵ") {
			return (float) 0.5;
		} else if(type == "��ϵ") {
			return (float) 0.5;
		} else
			return (float) 1.0;
	}

	
}
