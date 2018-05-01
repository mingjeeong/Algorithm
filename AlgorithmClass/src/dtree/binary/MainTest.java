package dtree.binary;

public class MainTest {

	public static void main(String[] args) {
		
		// [ 추가 ] 아래와 같이 출력되도록 
		// 중위 순회:  컴퓨터공학과 공과대학 정보통신 정보통신학과 정보보안 우리한국대학교 경영학과 사회대학 경제학과 경제정보 
		// 후위 순회:  컴퓨터공학과 정보통신 정보보안 정보통신학과 공과대학 경영학과 경제정보 경제학과 사회대학 우리한국대학교 

	/*	Node n1 = new Node(100,null,null); 	Node n2 = new Node(200,null,null);
		Node n3 = new Node(300,null,null);	Node n4 = new Node(400,null,null);	
		Node n5 = new Node(500,null,null);	Node n6 = new Node(600,null,null);
		Node n7 = new Node(700,null,null);	Node n8 = new Node(800,null,null);

		n1.setLeft(n2); n1.setRight(n3);  // n1의 왼쪽 자식-> n2, n1의 오른쪽 자식-> n3
		n2.setLeft(n4);	n2.setRight(n5);  // n2의 왼쪽 자식-> n4, n2의 오른쪽 자식-> n5
		n3.setLeft(n6);	n3.setRight(n7);  // n3의 왼쪽 자식-> n6, n3의 오른쪽 자식-> n7
		n4.setLeft(n8); */				  // n4의 왼쪽 자식-> n8
		
		//바이너리트리-1
		Node n1 = new Node("우리한국대학교",null,null);  Node n2 = new Node("공과대학",null,null);
		Node n3 = new Node("사회대학",null,null);  Node n4 = new Node("컴퓨터공학과",null,null); 
		Node n5 = new Node("정보통신학과",null,null); Node n6 = new Node("정보통신",null,null);
		Node n7 = new Node("정보보안",null,null);  Node n8 = new Node("경영학과",null,null);
		Node n9 = new Node("경제학과",null,null);  Node n10 = new Node("경제정보",null,null);
		  
		  n1.setLeft(n2); n1.setRight(n3);  // n1의 왼쪽 자식-> n2, n1의 오른쪽 자식-> n3
		  n2.setLeft(n4); n2.setRight(n5);  // n2의 왼쪽 자식-> n4, n2의 오른쪽 자식-> n5
		  n5.setLeft(n6); n5.setRight(n7);  // n5의 왼쪽 자식-> n6, n5의 오른쪽 자식-> n7
		  n3.setLeft(n8); n3.setRight(n9);  // n3의 왼쪽 자식-> n8, n3의 오른쪽 자식-> n9
		  n9.setRight(n10);       // n9의 왼쪽 자식-> n10  
		  BinaryTree t1 = new BinaryTree();  // 이진 트리 객체 t 생성 
		  t1.setRoot(n1);        // t의 루트 노드를 n1으로
		
		  //바이너리트리-2
		Node m1 = new Node("우리한국대학교",null,null); 	Node m2 = new Node("공과대학",null,null);
		Node m3 = new Node("사회대학",null,null);		Node m4 = new Node("컴퓨터공학과",null,null);	
		Node m5 = new Node("정보통신학과",null,null);	Node m6 = new Node("정보통신",null,null);
		Node m7 = new Node("정보보안",null,null);		Node m8 = new Node("경영학과",null,null);
		Node m9 = new Node("경제학과",null,null);		Node m10 = new Node("경제정보",null,null);
		
		m1.setLeft(m2); m1.setRight(m3);  // n1의 왼쪽 자식-> n2, n1의 오른쪽 자식-> n3
		m2.setLeft(m4);	m2.setRight(m5);  // n2의 왼쪽 자식-> n4, n2의 오른쪽 자식-> n5
		m5.setLeft(m6);	m5.setRight(m7);  // n5의 왼쪽 자식-> n6, n5의 오른쪽 자식-> n7
		m3.setLeft(m8);	m3.setRight(m9);  // n3의 왼쪽 자식-> n8, n3의 오른쪽 자식-> n9
		m9.setRight(m10); 				  // n9의 왼쪽 자식-> n10		
		BinaryTree t2 = new BinaryTree();  // 이진 트리 객체 t 생성 
		t2.setRoot(m1); // t의 루트 노드를 n1으로
		
		
		
		
/*		System.out.print("트리 노드 수  = "+ t.size(t.getRoot())+"\n트리 높이      = "+ t.height(t.getRoot()));
		System.out.printf("\n전위 순회:  ");
		t.preorder(t.getRoot());
		System.out.printf("\n중위 순회:  ");
		t.inorder(t.getRoot());
		System.out.printf("\n후위 순회:  ");
		t.postorder(t.getRoot());
		System.out.printf("\n레벨 순회:  ");
		t.levelorder(t.getRoot());
		System.out.println();*/
		
		
		System.out.println("동일성 검사: "+
				BinaryTree.isEqual(t1.getRoot(),t2.getRoot())
		);

	
	}
}



//-------------------------------------------------------------------------------
// [ 추가 ] 아래와 같이 출력되도록 
// 중위 순회:  컴퓨터공학과 공과대학 정보통신 정보통신학과 정보보안 우리한국대학교 경영학과 사회대학 경제학과 경제정보 
// 후위 순회:  컴퓨터공학과 정보통신 정보보안 정보통신학과 공과대학 경영학과 경제정보 경제학과 사회대학 우리한국대학교 

