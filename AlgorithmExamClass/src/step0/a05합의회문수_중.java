package step0;

import java.util.Scanner;

public class a05합의회문수_중 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt(); // 전체 몇 개 입력할지

		for (int tcase = 0; tcase < TC; tcase++) {

			int su = sc.nextInt();

			String suStr = String.valueOf(su);

			int sum = 0;
			for (int i = 0; i < suStr.length(); i++) {
				sum += Integer.parseInt(suStr.substring(i, i + 1));
			}

			String sumStr = String.valueOf(sum);

			int size = sumStr.length();

			for (int i = 0; i < size; i++) {
				if (sumStr.substring(i, i + 1).equals(sumStr.substring(size - i - 1, size - i))) {
					if (i == size - 1) {
						System.out.println("YES");

					}

				} else {
					System.out.println("NO");
					break;
				}
			}

		}

		sc.close();
	}
}
