package alist.array;

public class MainTest {
	public static void main(String[] args) {
		ArrList<String> s = new ArrList<String>();
		ArrList<Integer> i = new ArrList<Integer>();
		i.insertLast(2); i.print();
		i.insertLast(1); i.print();
		i.insertLast(3); i.print();
		i.insertLast(7); i.print();
		i.insertLast(9); i.print();
		i.insertLast(6); i.print();
		//i.insertLast(0); i.print();
		i.insert(5, 1); i.print();
		i.insert(4, 1); i.print();
		i.delete(1); i.print();
		
		// 1] 배열 끝에 요소 추가
//		s.insertLast("apple");	s.print(); 	s.insertLast("orange"); s.print();
//		s.insertLast("cherry");	s.print(); 	s.insertLast("pear");   s.print();
//		s.insertLast("mango");   s.print();

		// 2] 지정한 번째의 요소를 읽기
//		System.out.println("1번째 항목은 "+s.peek(1)+"이다."); System.out.println();

		// 3] 배열 중간에 요소 삽입
//		s.insert("grape",1); 	s.print();	s.insert("lemon",4); 	s.print();
//		s.insertLast("kiwi"); 	s.print();		
		
		// 4] 지정한 번째의 요소를 삭제
//		s.delete(4); s.print();	s.delete(0); s.print();
//		s.delete(0); s.print();	s.delete(3); s.print();
//		s.delete(0); s.print();
		
		
	}
}
