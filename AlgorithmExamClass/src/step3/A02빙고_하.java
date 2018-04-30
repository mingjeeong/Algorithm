package step3;

import java.util.Scanner;

public class A02빙고_하 {

    static int [][]a;				// 사용자 숫자 저장 배열
    static int [][]bingo;		// 빙고 저장 배열
    
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          a=new int[5+1][5+1];						// 사용자 숫자 저장배열
          bingo = new int[5+1][5+1];				// 빙고를 저장하는 배열
          	
          	int N=5;
          	
          	// 사용자의 빙고판 입력 받아 a 배열에 저장
          	for(int i=1; i<=N; i++)
          	{
          		for(int j=1; j<=N; j++)
          		{
          			a[i][j] = sc.nextInt();          			
          		}	
          	}
          	
          	int count=0;
          	for(int i=1; i<=N; i++)
          	{
          		for(int j=1; j<=N; j++)
          		{
          			int value = sc.nextInt();
          			checkBingo(value);			// 사회자가 부른 숫자를 사용자 빙고판에서 위치를 확인
          			count++;						// 사회자가 숫자를 부른 횟수를 지정
          			
          			if( isBingo()>=3)
          			{
          				System.out.println(count);
          				return;          				
          			}
          		}
          	}
          sc.close();
    }
    
     
    /** 사회자가 부를 번호와 같은 번호의 빙고배열 위치에 1을 저장 */
    static void checkBingo(int value)
    {
 
    	
    	
    }
    
    /**
     *  가로/세로/대각선 왼쪽에서 오른쪽/ 대각선 오른쪽에서 왼쪽으로
     *  4줄로 빙고인지 확인
     */
    static int isBingo()
    {
  	  int bingoCnt=0;				// 전체 빙고줄 수
  	  


  	  return bingoCnt;
    }
}

/**
11 12 2 24 10
16 1 13 3 25
6 20 5 21 17
19 4 8 14 9
22 15 7 23 18

5 10 7 16 2
4 22 8 17 13
3 18 1 6 25
12 19 23 14 21
11 24 9 20 15

15
**/