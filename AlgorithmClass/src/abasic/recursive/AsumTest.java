package abasic.recursive;

public class AsumTest {

	public static void main(String[] args) {

		// 1부터 10까지 합을 구해서 출력
		int sum = sumFun(3);
		System.out.println(sum);
	}

	static int sumFun(int i) {
		if (i == 1)
			return 1;

		return i + sumFun(i - 1);

	}

}
