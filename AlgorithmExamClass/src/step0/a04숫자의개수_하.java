package step0;

import java.util.Scanner;

public class a04숫자의개수_하 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] cnt = new int[10]; // 0부터 9까지의 숫자 갯수를 저장할 배열

		int A = sc.nextInt(); // 100보다 크고 1000보다 작은 자연수 3개 입력받기
		int B = sc.nextInt();
		int C = sc.nextInt();

		// 1. 세 숫자의 곱을 변수에 저장한다
		int multi = A * B * C;
		String multiStr = multi+"";

		// 2. 그 변수의 숫자 하나씩을 cnt 배열의 해당하는 인덱스에 저장
		// [힌트] 그 숫자를 10으로 나눴을 때의 나머지값으로 하나의 숫자를 확인할 수 있다.
		//
		// [예] 100000001
		// c[0] : 7 c[i] 2

		int size = multiStr.length();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < cnt.length; j++) {
				if (Integer.parseInt(multiStr.substring(i, i + 1)) == j) {
					cnt[j]++;
				}

			}

		}

		for (int i = 0; i < 10; i++)
			System.out.println(cnt[i]);

	}
}
