package step2;

import java.util.Arrays;
import java.util.Scanner;

public class B01회문인숫자_하 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 입력할 수
		int num[] = new int[N];
		int result[] = new int[N];

		for (int i = 0; i < N; i++) // 입력하는 수를 저장
			num[i] = sc.nextInt();

		for (int i = 0; i < N; i++) // 회문인지 확인하고 1인지 0인지 result에 저장
			if (isBack(num[i]) == true)
				result[i] = 1;
			else
				result[i] = 0;

		for (int i = 0; i < N; i++) // 결과 출력
			System.out.println(result[i]);

	}

	public static boolean isBack(int value) {
		int[] temp = new int[100];
		boolean notmatch = false;
		boolean flag = true;

		for (int i = 2; i <= 64; i++) // 2진수에서 64진수까지 확인
		{
			temp = new int[100];
			/**
			 * 해당 진수(2~64진수)의 수로 저장 회문인지 확인
			 */
			int su = value;
			int k = 0;// 순서
			flag = true;
			while (flag) {
				if (su == 0) {
					flag = false;
					break;
				}
				temp[k] = su % i;
				su = su / i;
				k++;
				//System.out.println(i+">>");
			}

			for (int j = 0; j < k; j++) {
				//System.out.println(k+">>>");
				if (temp[j] == temp[k - j-1]) {
					notmatch = true;
					//System.out.println(notmatch+">>");

				} else {
					notmatch = false;
					//System.out.println(notmatch+">");
					break;
				}

			}
			
			if(notmatch){
				return notmatch;
			}

			//System.out.println(Arrays.toString(temp));

		}
		
		

		return notmatch;
	}
}
