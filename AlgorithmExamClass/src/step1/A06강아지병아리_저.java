package step1;

import java.util.Scanner;

public class A06강아지병아리_저 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int body, legs, y=0, x=0;	// x: 병아리 수  y: 강아지 수
		do
		{
			body = sc.nextInt();
			legs = sc.nextInt();
			
			if(body<0 || body>1000 || legs<0 || legs>4000)		// 입력값 범위 설정
			{
				System.out.println("INPUT ERROR!");
			}
			else
			{
				boolean bSuccess=false;
				
				/**
				body - 병아리수(x) + 강아지수 (y)
				legs - 병아리 다리수(2*x) + 강아지다리수(y*4)
				
				계산에 맞는 병아리수(x) + 강아지수 (y)를 찾는다면
				bSuccess를 true 지정
				*/

				
				if( bSuccess)			// 몸통수와 다리수가 맞으면 출력 그렇지 않으면 0 출력
					System.out.println(y + " " + x);
				else
					System.out.println(0);
				
			}
		}while( body!=0  && legs!=0 );
	}

}

