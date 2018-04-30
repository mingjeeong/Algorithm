package step1;

import java.util.Scanner;

public class A04주사위게임_저 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result[]=new int[N+1];
		
		for(int i=1; i<=N; i++)		// 첫번째 입력한 숫자만큼 입력을 받음
		{
			int A = sc.nextInt();			// 총 주사위 수는 3개으므로 3번 입력 받음
			int B = sc.nextInt();
			int C = sc.nextInt();
	
			/**
			 1 . 세 주사위 수가 동일할 경우
			 2.  세 주사위 중 2개가 동일할 경우	
			 	(1) A와 B가 같다면
			 	(2) B와 C가 같다면
			 	(3) A와 C가 같다면
			 3. 세 주사위 중 동일한 수가 없을 때
			 	(1) A가 B보다 클 때
			 	(2) B가 C보다 클 때
			 */
			
			
		}
		
		for( int i=1; i < result.length; i++)
		{
			System.out.println(result[i]);
		}

	}
}


