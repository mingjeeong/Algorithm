package abasic.recursive;

public class BMulTest {

	public static void main(String[] args) {
	/*	
		//5부터 1까지 곱을 구해서 출력
		//5*4*3*2*1 = 5!
		int mul = 1;
		for(int i =5 ; i>0 ;i--){
			mul=mul*i;
		}
		
		System.out.println(mul);
	*/
		
		//재귀호출 이용
		int mul = mulFun(5);
		System.out.println(mul);
	}
	
	static int mulFun(int i){
		if(i==1) return 1;
		
		return i*mulFun(i-1);
	}
		
}
