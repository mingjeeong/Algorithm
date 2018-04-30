package step3;

import java.util.Scanner;

public class A01비밀편지_하 {
	public static void main(String[] args) {
		String[]pwd={"000000",  //A
				     "001111",  //B
				     "010011",  //C
				     "011100",  //D
				     "100110",  //E
				     "101001",  //F
				     "110101",  //G
				     "111010"}; //H
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();						// 입력할 문자 수
		char []data = new char[6*N];			// 한 문자당 6자리
		data = sc.next().toCharArray();

		/**
		 * 
		 */
		
		
		
		
		

	}
}

/*
입력예
3
001111000000011100

출력예
BAD


 입력예
5
011111000000111111000000111111

 출력예
3

*/