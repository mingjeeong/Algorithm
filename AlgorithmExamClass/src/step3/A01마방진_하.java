package step3;

import java.util.Scanner;

public class A01마방진_하 {

	static int TC;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();			// 마방진의 한 면의 갯수
		int a[][]=new int[N+1][N+1];
		int row = 0, col=0;
		
		for(int i=1; i<=N*N; i++)
		{

			/**
			   1. 첫 번째 숫자인 1을 넣는 위치는 첫 번째 행 가운데이다.
               2. 숫자가 N의 배수보다 1 큰 수이면 바로 아래의 행으로 이동하여 다음의 수를 넣고
               3. 그렇지 않으면 왼쪽 위로 이동하여 다음의 숫자를 넣는다.
                      만약 행이 첫 번째를 벗어나면 마지막 행으로 이동하고, 
                      열이 첫 번째를 벗어나면 마지막 열로 이동한다.
			 */
	
			
			
			
		}
		
		
		// 출력
		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=N; j++)
				System.out.printf("%3d", a[i][j]);
			System.out.println();
		}

		sc.close();
	}
}

