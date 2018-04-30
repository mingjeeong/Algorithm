package cqueue.array;

import java.util.NoSuchElementException;
public class ArrayQueue <E>{
	private E[] q;    // 큐을 위한 배열
	private int front, rear, size; 
	
    public ArrayQueue() {        // 큐 생성자
    	q = (E[]) new Object[2]; // 초기에 크기가 2인 배열 생성
    	front = rear = size = 0;
   }
    public int     size()    { return size;}        // 큐에 있는 항목의 수를 리턴
    public boolean isEmpty() { return (size == 0);} // 큐가 empty이면 true를 리턴
    
    /**   큐 삽입 연산  */
    public void add(E newItem) {   
    	//rear++;
    	
    	if((rear+1)%q.length == front){
    		resize(q.length*2);
    	}
    	rear =(rear+1)%q.length; //순환이 되나요?
    	q[rear] = newItem;
    	size++;
    	
    	
    	
    	
    }
    
    /**   큐 삭제 연산  */
	public E remove() { 
		if (isEmpty()) throw new NoSuchElementException(); // underflow 경우에 프로그램 정지
		
		front = (front+1)%q.length;
		E item = q[front];
		q[front] = null;
		size--;
		//배열의 크기가 1/4이 되면 배열의 크기를 1/2로 축소
		if(size() == q.length/4){
			resize(q.length/2);
		}
		
		return item;
	}  
	
	
    private void resize(int newSize) {    // 큐의 배열 크기 조절
    	Object[] t = new Object[newSize]; // newSize 크기의 새로운 배열 t 생성
    	for(int i = 1, j=front+1; i <size+1; i ++, j++){
    		t[i] = q[j%q.length];         // 배열q의 항목들을 배열 t[1]로부터 복사
    	}
    	front = 0;
    	rear  = size;
    	q = (E[]) t;      // 배열 t를 배열 q로
    }
    
    
	public void print() { // 큐의 항목들을 출력
		if (isEmpty()) 
			System.out.print("큐가 비어있음.");      
		else {
			for (int i=0; i<q.length; i++)	System.out.print(q[i]+"\t ");
			System.out.println();
		}
	}
}
