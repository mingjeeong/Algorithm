package alist.asingle;
public class MainTest {
	public static void main(String[] args) {

		SList<String> s = new SList<String>();  // 연결 리스트 객체 s 생성
        s.insertFront("orange"); s.insertFront("apple");		s.insertFront("pear"); 			
		s.print();
		s.insertAfter("cherry",s.head.getNext());	// 사과 다음에 추가 s.head는 배 s.head.next는 사과
		s.print();
				
		//사과를 찾아서 그 뒤에 망고를 추가 한다면?
		s.insertAfter("mango", s.searchItem("apple")); s.print();
		
		
		
//		System.out.println(": s의 길이 = "+s.size()+"\n"); 
//		System.out.println("체리가 \t"+s.search("cherry")+"번째에 있다.");
//		System.out.println("키위가 \t"+s.search("kiwi")+"번째에 있다.\n");
		
		
//		s.deleteFront();
//		s.print(); 
//		System.out.println(": s의 길이 = "+s.size());System.out.println();

//		
		s.deleteAfter(s.searchItem("mango"));
		s.print(); 
		System.out.println(": s의 길이 = "+s.size());System.out.println();

		
	}
}