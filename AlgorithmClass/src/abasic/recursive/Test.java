package abasic.recursive;

public class Test {

	public static void main(String[] args) {

		System.out.println(exp(3,4));
	}

	
	// x의 m제곱하는 함수
	static int exp(int x, int m){
		if(m==1) return x;
		
		return x*exp(x,m-1);
	}

}
