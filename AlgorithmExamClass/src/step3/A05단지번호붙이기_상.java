package step3;

import java.util.Scanner;
import java.util.Stack;

class DATA
{
	int x;
	int y;
	int cnt;
	public DATA(int x, int y, int cnt)
	{
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class A05단지번호붙이기_상 {

	static int N;				// 단지수
	static char a[][];			// 단지의 정보
	static int visited[][];		// 각단지의 방문정보
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();  	  // 단지수 입력받기

		a = new char[N][N];		
		for(int i=0; i<N; i++) // 단지의 정보를 입력받아 배열에 저장
			a[i] = sc.next().toCharArray();			

		initVisit(N);			// 방문기록 초기화

		int count=0;
		int result[]=new int[100];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				if(a[i][j]=='1' )  //아직 방문안했다면
				{
					result[count] = fill(i, j);
					count++;
				}
			}
		}
		print(count, result);		// 화면에 결과 출력
		sc.close();
	}
	
	static int fill(int y, int x)
	{

		int dx[]=new int[]{0,1,0,-1};			// 이웃을 하는 상하좌우 좌표를 찾기 위해
		int dy[]=new int[]{-1,0,1,0};
		int cnt=1;
		Stack stack=new Stack();		

		/**
		 * 
		 */

		return cnt;
	}
	
	static void initVisit(int N)
	{
		visited = new int[N][N];
		//방문기록 초기화 
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
				visited[i][j]=0;
		}
	}
	
	static void print(int count, int[] result) {
		// 결과들을 오름차순으로 정렬
		for(int i=0; i<count-1; i++)
		{
			for(int j=i+1; j<count; j++)
			{
				if( result[i] > result[j])
				{
					int temp = result[i];
					result[i]=result[j];
					result[j]=temp;    				        				  
				}
			}
		}

		System.out.println(count);
		for(int i=0; i<count; i++)
			System.out.println(result[i]);

	}
}




