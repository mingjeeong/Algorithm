package bstack.postfix;

public class MainTest {

	public static void main(String[] args) {
		String inputStr = "(3+2)*(4-5)";
		char []infix = inputStr.toCharArray();
		char []postfix = toPostFix(infix);
		System.out.println(postfix);
		
		int result = calPostFix(postfix);
		System.out.println(">>"+result);
		
		
	}
	
	static int calPostFix(char[] postfix){
		ListStack stack = new ListStack();
		for(int i=0; i<postfix.length;i++){
			char ch = postfix[i];
			if(ch == '\0') continue;
			//(1)숫자라면 스택에 저장
			//(2)연산자라면 스택에서 2개를 꺼내서 계산하고
			//(3)다시스택에 저장
			int second =0;
			int first = 0;
			if(ch>='0'&& ch<='9'){
				int su = ch-'0';//문자숫자를 간단하게 숫자값으로 변환
				stack.push(su);
			}else if(ch =='+' ||ch=='-'|| ch=='/' || ch=='*'){
				second = (int) stack.pop();
				first = (int) stack.pop();
				int result =0;
				
				switch (ch) {
				case '+':
					result = first+second;
					break;
				case '-':
					result = first-second;
					break;
				case '*':
					result = first*second;
					break;
				case '/':
					result = first/second;
					break;
				default:
					break;
				}
				
				stack.push(result);
			}
			
			
		}
		return  (int) stack.pop();
	}
	
	/** 중위표기법을 후위표기법으로 변환하는 함수 */
	static char[] toPostFix(char [] infix){
		ListStack stack = new ListStack<>();
		char[] postfix = new char[infix.length];
		int k =0;
		
		for(int i=0;i<infix.length;i++){
			char ch = infix[i];
			//(1)숫자라면 (연산자가 아니라면) postfix 배열에 넣기
			//(2)연산자라면 스택에 저장
			//(3)')'라면 스택에 있는 연산자를 배열 넣기
			if(ch >='0' && ch<='9'){
				postfix[k] = ch;
				k++;
			}else if(ch =='+' ||ch=='-'|| ch=='/' || ch=='*'){
				stack.push(ch);
			}else if(ch==')'){
				postfix[k++] =  (char) stack.pop();
			}
			
		
		}
		//스택에 남은 연산자를 모두 배열에 넣기
		while(!stack.isEmpty()){
			postfix[k++] = (char) stack.pop();
		}
		return postfix;
	}
}
