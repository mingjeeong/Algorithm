package dtree.search;


public class MainTest {

	public static void main(String[] args) {
		BST t = new BST(500, "Apple");  

		t.put(600, "Banana");
		t.put(200, "Melon"); 
		t.put(100, "Orange");
		t.put(400, "Tangerine"); 
		t.put(250, "Kiwi");
		t.put(150, "Grape");
		t.put(800, "Strawberry"); 
		t.put(700, "Cherry"); 
		t.put(50,  "Pear");
		t.put(350, "Lemon");
		t.put(10,  "Watermelon");

		/*	t.print(t.root);System.out.println();
		System.out.println("높이 = "+ t.height());
		
		System.out.println("250의 데이타 : "+
				t.get(t.root,250)
				);*/
		
		t.print(t.root);
		
		t.delete(t.root, 250);//case 0/1/2
		
		System.out.println();
		t.print(t.root);

	}
}