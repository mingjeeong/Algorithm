package abasic.recursive;

public class FibonacciTest {

	public static void main(String[] args) {
		/*
		 * //피보나치수열 int su1 = 1; int su2 = 0; int result =0;
		 * 
		 * for(int i=1; i<5; i++){ result = su1 + su2;
		 * System.out.println(result+"="+su1+"+"+su2); 
		 * su2 = su1; 
		 * su1 = result;
		 * }
		 * 
		 * System.out.println("결과: "+result);
		 */
		
		//재귀함수
		int result = 0;
		for(int i=1; i<5;i++){
			result +=fibo(i);
			
		}
		System.out.println("결과: "+result);

	}

	static int fibo(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		return fibo(n - 1) + fibo(n - 2);
	}

}
