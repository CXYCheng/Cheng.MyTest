import java.util.Arrays;
import java.util.Scanner;

/*
*
* 题目描述
* 输入三个字符（可以重复）后，按各字符的ASCII码从小到大的顺序输出这三个字符。输入
*第一行输入一个数N,表示有N组测试数据。后面的N行输入多组数据，每组输入数据都是占一行，有三个字符组成，之间无空格。
*输出
*对于每组输入数据，输出一行，字符中间用一个空格分开。
*
*/

class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int temp;
		char[][] char1 = new char[N][3];
		
		// 输入
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				temp = input.nextInt();
				char1[i][j] = (char)temp;
			}
		}

		// 排序
		for (int i = 0; i < N; i++) {
			Arrays.sort(char1[i]);
		}

		// 输出
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(char1[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println();

	}
}