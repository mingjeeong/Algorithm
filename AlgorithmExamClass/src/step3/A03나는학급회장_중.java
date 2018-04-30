package step3;

import java.util.Scanner;

public class A03나는학급회장_중 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();					// 투표할 인원 수
		int [][]vote = new int[N][3];		// 한 명당 3명에게 투표함
												 
		
		for(int i=0;i<N; i++)					// 입력값을 받아서 저장
		{
			for(int j=0; j<3; j++)
			{
				vote[i][j]=sc.nextInt();
			}
		}

		// 총 점수와 각각 3의 개수 2의 개수 1의 개수를 구한다 
		int total [] = new int[3];				// 세 명의 총 점수를 저장
		int scoreCnt[][] = new int[3][3];		// 3개, 2개, 1개의 갯수를 각각 저장
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<3; j++)
			{
				total[j]+=vote[i][j];		// 총 점수를 구함 
				if( vote[i][j]==1)			// 1점일 경우는
					scoreCnt[j][0]++;
				else if( vote[i][j]==2)	// 2점일 경우는
					scoreCnt[j][1]++;
				else if( vote[i][j]==3)	// 3점일 경우는
					scoreCnt[j][2]++;
			}		
		}

		
		/**
		 *  
		 */
		
		
	}
}
