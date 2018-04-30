package step2;

import java.util.Scanner;

public class B00해킹_하 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();				// 입력할 단어 수
		String s[] = new String[N];		// 입력한 수 만큼 문자열 배열을 생성
		for(int i=0; i<N; i++)			// 입력한 수 만큼 문자열을 입력 받음
		{
			s[i] = sc.next();					
		}

		
		boolean flag= false;
		String pwd="";
		int len1=0;			// 비교할 첫번째 문자열의 길이를 저장할 변수
		int len2=0;			// 비교할 두번째 문자열의 길이를 저장할 변수
		
		/**
		 * 1. 문자열을 첫번째부터 다음문자열들과 하나씩 비교
		 *     (1) 두 문자열의 길이가 같아야하고 글자 수가 홀수라면
		 *         1- 하나의 문자열과 뒤집어서 같은 문자열이라면 암호를 찾음
		 */
		
		
		
		
		
		

		if(flag) {	// 암호의 가운데 글자를 출력
			System.out.println(len1 + " " + pwd + "에서의 가운데 글자 : "+ pwd.charAt(len1/2));
		}else {
			System.out.println("암호가 없음");
		}
		
		sc.close();
	}
	/**
	 *  두 문자열을 받아서 첫번째 문자는 0번째부터 두번째 문자는 맨 뒤에부터 같은지 비교
	 *  두 문자열 비교가 동일하면 true 반환
	 *  한번이라도 비교값이 다르면 false 반환
	 */
	static boolean isCheck(String s1, String s2)
	{
		for(int i=0; i<s1.length(); i++)
		{
			if( s1.charAt(i) != s2.charAt(s2.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}


}
