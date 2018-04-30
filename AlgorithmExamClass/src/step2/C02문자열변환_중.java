package step2;

import java.util.Scanner;

public class C02문자열변환_중 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();		// 수정해야 하는 정보의 수
		
		char []old_char =new char[N];		// 수정해야 하는 문자
		char []new_char =new char[N];		// 수정할 문자
		for(int i=0; i<N; i++)
		{
			old_char[i] = sc.next().toCharArray()[0];		
			new_char[i]= sc.next().toCharArray()[0];
		}

	
		int M= sc.nextInt();			// 오타가 포함된 문자 갯수를 입력 받음
		char [] s = new char[M];
		for(int i=0; i<M; i++)
		{
			s[i] = sc.next().toCharArray()[0];  // 해당 문자를 입력받아 저장
		}
		
		
		/**
		 *  1. 변환해야 문자를 발견하면 그 인덱스를 얻어서 해당 인덱스에 변환할 문자로 지정
		 */
	
		
		
		
		
		
		
		// 결과 출력
		for(int i=0; i<M; i++)
				System.out.print(s[i]);

	}
}
