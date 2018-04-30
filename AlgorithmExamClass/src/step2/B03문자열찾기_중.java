package step2;

import java.util.Scanner;

public class B03문자열찾기_중 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String s1 = "KOI";
		String s2="IOI";
		int cnt1=0, cnt2=0;

		// 1.  "KOI" 문자열 찾기
		for(int i=0; i<=str.length()-s1.length(); i++) 
		{

		}
		
		// 2. "IOI" 문자열 찾기
		for(int i=0; i<=str.length()-s2.length(); i++)	
		{

		}
		
		// 각각의 결과 출력
		System.out.println(cnt1);
		System.out.println(cnt2);
		
	}
}
