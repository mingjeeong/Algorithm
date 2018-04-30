package alist.circula;
import java.util.NoSuchElementException;
public class CList <E> {
	private Node last; // 리스트의 마지막 노드(항목)을 가리킨다. 
	private int  size; // 리스트의 항목(노드) 수
	
	public CList() {  // 리스트 생성자
		last = null;
		size = 0;
	}
	
	public int size() { return size;}
	public boolean isEmpty() { return size == 0;}
	
	/** last가 가리키는 노드의 다음에 새노드 삽입 */
	public void insert(E newItem) {   
		Node newNode = new Node(newItem, null);  // 새 노드 생성
		if  (last == null) {      
			//  1. 리스트가 empty일때
			//(1)새노드를 last에 지정
			//(2)새노드의 next를 last에 지정
			newNode.setNext(newNode);
			last = newNode;
		}
		else {		
			// 2. 리스트가 empty 아닐때
			//(1)새노드의 next에 last의 next를 지정
			//(2)last의 next에 새노드를 지정
			newNode.setNext(last.getNext());
			last.getNext().setNext(newNode.getNext());
			last.setNext(newNode.getNext());
			
			
		}
		size++;
	}
	
	/** last가 가리키는 노드의 다음 노드를 제거 */
	public Node delete() {  
		if (isEmpty()) throw new NoSuchElementException();
		Node x = last.getNext();     // x가 리스트의 첫 노드를 가리킴
		//------------------------------------
		
		
		
		//------------------------------------
		return x;
	}

	public void print(){  // 연결 리스트 노드들의 항목들을 차례로 출력
		if (size > 0){
			int i = 0;
			for (Node p = last.getNext(); i<size ; p = p.getNext(), i++) 
					System.out.print(p.getItem()+"\t ");
		}
		else
			System.out.println("리스트 비어있음.");
	}
}
