package alist.array;

/*
 * E -element(데이터형):콜렉션 요소
 * T - type(데이터형)
 * K - key
 * V - value
 * 
 */

import java.util.NoSuchElementException;
public class ArrList <E> {
	private  E a[];     // 리스트의 항목들을 저장할 배열
    private  int size;  // 리스트의 항목 수
   
    public  ArrList() { // 생성자
        a = (E[]) new Object[1];  // 최초로 1개의 원소를 가진 배열 생성
        size = 0;                     // 항목 수를 0으로 초기화
    }
    public boolean isEmpty() {return size == 0;} // 리스트가 empty이면 true 리턴
    
    public void insertLast(E newItem) {	// 가장 뒤에 새 항목 삽입              
        if (size == a.length)   	// 배열에 빈 공간이 없으면
        	resize(2*a.length);  	// 배열 크기 2배로 확장
         a[size++] = newItem;    	// 새 항목 삽입
    }
    
    /***********************************************
     *   새 항목을 k-1번쨰 항목 다음에 삽입 **/    
    public void insert(E newItem, int k) { 
    	/*
    	 1. 배열에 빈 공간이 없으면 배열 크기 2배로 확장
    	 2. 해당 번째 뒤로 한 칸씩 이동
    	 3. 새 항목 삽입하고 크기를 하나 증가   
    	*/ 	
		if (size == a.length) {
			resize(2 * a.length);
		}
		for (int i = size; i >= k; i--) {
			if(i <size)
			a[i + 1] = a[i];

		}
		a[k] = newItem;
		size++;
	}

    /***********************************************
     *    k번째 항목 삭제                            **/ 
    public E delete(int k) {  
		if (isEmpty()) throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
		E item = a[k];
		/*
		 1. 한 칸씩 앞으로 이동
		 2. 배열에 항목들이 1/4만 차지한다면 배열을 1/2 크기로 축소
		*/	
		for (int i = k; i < a.length; i++) {
			if (i < size && i < a.length - 1) {
				a[i] = a[i + 1];
			}
		}
		a[size - 1] = null;
		size--;

//		if(size < a.length*0.25){
		
//			resize((int)(a.length * 0.5));
//		}
		
		
		return item;
    }
    
    
    public E peek(int k) {  // k번째 항목을 리턴, 단순히 읽기만 한다.
  		if (isEmpty()) throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
  		return a[k];
      }
    
    private void resize(int newSize) {		// 배열 크기 조절
		Object[] t = new Object[newSize];   // newSize 크기의 새로운 배열 t 생성
		for (int i = 0; i < size; i++)
			t[i] = a[i];                    // 배열 s를 배열 t로 복사 
		a = (E[]) t;                        // 배열 t를 배열 s로 
	}
    
	public void print() { // 배열의 항목들을 출력
		if (isEmpty()) 
			System.out.print("배열이 비어있음.");      
		else
			for(int i = 0; i < a.length; i++)	System.out.print(a[i]+"\t ");
		System.out.println();
	}
}
