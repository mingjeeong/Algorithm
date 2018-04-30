package abasic.recursive;

public class p42 {
	
	public static void main(String[] args) {
		//f(4);
		//g(4);
		//h(4);
		//hh(4);
		
		//abc(78);
		System.out.println(test("110100111",4));
		
		
	}

	public static void f ( int N ) {
		System.out.println(N);
		if( N > 0 ) f ( N-1);
	}
	public static void g ( int N) {
		if( N > 0 ) g( N-1);
		System.out.println(N);
	}
	
	public static void h ( int N ) {
		System.out.println(N);
		if( N > 0 ) h ( N -2 );
		System.out.println(N);
	}
	
	public static void hh ( int N ) {
		if( N > 0 ) {
			hh ( N-1);
			System.out.println(N);
		}
	}
	
	public static void abc( int N) {
		int r = N % 2;
		System.out.println("*");
		if( N >= 2 ) abc ( N/2);
		System.out.printf("%d", r);
		return;
	}
	
	public static  int test( String s, int last ) {
		if( last < 0 ) return 0;
		if( s.charAt(last) == '0') return 2 * test ( s, last -1 );
		return 1 + 2 * test ( s, last - 1);
	}
}
