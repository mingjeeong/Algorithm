package bstack.list;

public class Test {

	public static void main(String[] args) {

		Student a = new Student("홍길동", null);
		Student b = new Student("홍길자", null);
		
		if(a.compareTo(b) >0){
			System.out.println("크다");
		}else if(a.compareTo(b)<0){
			System.out.println("작다");
		}else {
			System.out.println("같다");
		}
		
		
	}

}
