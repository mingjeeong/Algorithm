package alist.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static int N = 10;
	static char[] s = new char[N];
	static int size = 0;

	public static void main(String[] args) {
		/*
		 * 1. 알파벳 대문자 A ~ Z 문자중 무작위로 10개의 알파벳이 입력될 경우 ( 단, P는 입력필수 ) 배열에 순서대로
		 * 정렬하여 저장하여 이 중에 P를 탐색하는 프로그램을 작성하자. 이 때 최소한의 비교는 몇 번인가?
		 */

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < N; i++) {
			char temp = sc.nextLine().charAt(0);
			insert(temp);
			System.out.println(Arrays.toString(s));
		}
		System.out.println(">>>>");
		sc.close();

		// P를 찾는 함수를 구현하고 호출
		System.out.println(">>"+findP(s));
	}

	public static int findP(char[] s) {
		int first = 0;
		int end = 9;
		int mid = (int) ((first + end) / 2);
		boolean flag = false;
		int cnt = 1;
		while (!flag) {
			if (s[mid] > 'p') {
				end = mid;
				mid = (int)((first+end)/2);
				if ('p' == s[mid]) {
					flag = true;
				}

			} else {
				first = mid;
				mid =  (int)((first+end)/2);
				if ('p' == s[mid]) {
					flag = true;
				}
			}
			cnt++;
		}
		System.out.println(cnt+">>>?>");
		return cnt;
	}

	public static void insert(char newItem) {

		// 배열의 각각의 요소와 비교하여 입력받은 newItem 요소보다 큰 것을 발견하면
		// 그 요소부터 끝의 요소까지 한 칸 씩 뒤로 이동하고
		// 그 자리에 입력받은 newItem을 저장한다.
		// 배열의 크기 (size)를 하나 증가한다

		if (size == 0) {

			s[0] = newItem;
			size++;
			return;
		}

		int k = 0;
		for (int j = 0; j < size; j++) {
			if (s[j] > newItem) {
				for (int i = size; i >= j; i--) {
					if (i < size)
						s[i + 1] = s[i];
				}
				k = j;
				break;

			} else {
				k = j + 1;
			}
		}
		s[k] = newItem;
		size++;

	}

}
