package bstack.list;

public class MainTest {
	public static void main(String[] args) {
		ListStack<String> stack = new ListStack<String>();
		stack.push("apple"); stack.push("orange"); stack.push("cherry");
		//System.out.println(stack.peek());
		stack.push("pear"); 	stack.print();
		stack.pop();     		//System.out.println(stack.peek());
		stack.print();
		stack.push("grape");	stack.print();
	}
}
