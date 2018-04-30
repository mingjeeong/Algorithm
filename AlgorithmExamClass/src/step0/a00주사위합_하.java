package step0;

import java.util.Scanner;

public class a00주사위합_하 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 주사위 2개의 숫자의 합을 입력받음
		
		if(N <= 12){
			System.out.println("입력은 12이하의 자연수만 됨");
			return ;
		}

		// 주사위 한 개는 숫는 1-6까지임으로
		// 2개의 주사위 숫자의 경우의 수를 확인하기 위해 2개의 반복문을 구동한다.
		int sum =0;
		for(int i=1; i<7;i++){
			for(int j=1;j<7;j++){
				sum =i+j;
				if(sum ==N){
					System.out.println(i+" "+j);
				}
			}
		}
		// 반복문 안에서 두 수의 합이 입력받은 수와 같다면 출력한다.

	}
}
