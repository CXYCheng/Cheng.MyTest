import java.util.Arrays;
import java.util.Scanner;

/*
*
* ��Ŀ����
* ���������ַ��������ظ����󣬰����ַ���ASCII���С�����˳������������ַ�������
*��һ������һ����N,��ʾ��N��������ݡ������N������������ݣ�ÿ���������ݶ���ռһ�У��������ַ���ɣ�֮���޿ո�
*���
*����ÿ���������ݣ����һ�У��ַ��м���һ���ո�ֿ���
*
*/

class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int temp;
		char[][] char1 = new char[N][3];
		
		// ����
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				temp = input.nextInt();
				char1[i][j] = (char)temp;
			}
		}

		// ����
		for (int i = 0; i < N; i++) {
			Arrays.sort(char1[i]);
		}

		// ���
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(char1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println();

	}
}