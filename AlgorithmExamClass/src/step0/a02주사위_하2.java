package step0;

import java.util.Scanner;

public class a02주사위_하2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC = 3;
		for (int tcase = 0; tcase < TC; tcase++) {
			// 3개의 N면체의 주사위 N을 입력받음
			int N1, N2, N3;
			N1 = sc.nextInt();
			N2 = sc.nextInt();
			N3 = sc.nextInt();

			 if( (N1<2 || N1>20) && (N2<2 || N2>20) && (N3<2 || N3>40) )
			 break;

			// 각 주사위의 합은 1부터 시작하기에 각각의 합의 값과 인덱스를 맞추기 위해 1을 추가
			int[] sum = new int[N1 + N2 + N3 + 1];

			/**
			 * 1. 각각의 합을 담을 배열에 각각의 합과 같은 인덱스 배열에 하나씩 증가
			 */
			int total = 0;
			for (int i = 1; i <= N1; i++) {
				for (int j = 1; j <= N2; j++) {
					for (int k = 1; k <= N3; k++) {
						total = i + j + k;
						for (int a = 3; a < sum.length; a++) {
							if (a == total) {
								sum[a]++;
							}
						}

					}
				}
			}

			// 각각의 카운트를 확인
			 for(int i=0; i<sum.length; i++)
			 System.out.print(sum[i] + " ");
			 System.out.println();

			int max = sum[1]; // 각 합에는 0이 존재 하지 않기에 1부터 시작
			int pos = 1;
			/**
			 * 2. 가장 큰 값을 찾음
			 */
			
			for (int i = pos; i < sum.length; i++) {
				if (max < sum[i]) {
					System.out.println(i+" "+pos);
					max = sum[i];
					pos = i;
				}
			}

			System.out.println(pos);

		}
		sc.close();
	}
}
