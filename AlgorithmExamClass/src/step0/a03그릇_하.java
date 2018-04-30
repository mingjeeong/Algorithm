package step0;

import java.util.Scanner;

public class a03그릇_하 {

	static int TC;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int sum = 10; // 맨 처음 그릇은 10점부터 시작하기에

		for (int i = 1; i < s.length(); i++) // 갯수를 2번째 그릇부터 센다
		{

			if (s.substring(i - 1, i).equals("(")) {

				if (s.substring(i, i + 1).equals(")")) {
					sum += 10;
				} else {
					sum += 5;
				}
			} else {
				if (s.substring(i, i + 1).equals(")")) {
					sum += 5;
				} else {
					sum += 10;
				}
			}

			// 1. 그릇이 '(' 바로 놓인 경우라면
			// (1) 이전 그릇이 반대로 ')' 이면 10점을 추가
			// (2) 그렇지 않으면 5점 추가

			// 2. 그릇이 '(' 바로 놓인 경우가 아니라면
			// (1) 이전 그릇이 반대로 '(' 이면 10점을 추가
			// (2) 그렇지 않으면 5점 추가

			System.out.println(sum);
		}

		sc.close();
	}
}