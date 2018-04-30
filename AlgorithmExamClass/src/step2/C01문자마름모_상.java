package step2;

import java.util.Scanner;

public class C01문자마름모_상 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();	// 사각형 한 면의 문자 수
		char [][]a = new char[2*N][2*N];
		
		int i, j, m, n;
		char  k='A';		//시작점을 'A"로 하는 알파벳
		
		// 전체 배열에 공백으로 초기화
		for(i=1; i<2*N; i++)
		{
			for(j=1; j<2*N; j++) {
				a[i][j]=' ';
			}
		}
		
 
		//---------------------------------------------------
		// 1. 가운데서 오른쪽 방향으로
	
		// 2. 왼쪽에서 아래 방향으로
	
		// 3. 아래에서 오른쪽 위로
			
		// 4. 오른쪽에서 위쪽 중앙으로

	
		
		// 화면에 출력
		for(i=1; i<=N*2-1; i++)
		{
			for(j=1; j<=N*2-1; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}  
