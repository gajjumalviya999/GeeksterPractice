package stack;

import java.util.ArrayList;


public class Stackquestions {

public boolean  isBalancedParenthesis(String S) {
	boolean flag =true;
	Stack<Character> paranthesis= new Stack<>();
	loop: for(int  i=0;i<S.length();i++) {
		if(S.charAt(i)=='{'||S.charAt(i)=='('||S.charAt(i)=='[') {
			paranthesis.push(S.charAt(i));
		}
		else
			if(S.charAt(i)=='}') {
				if(paranthesis.peek()=='('|| paranthesis.peek()=='[' ||paranthesis.isEmpty())
				{
					flag=false;
					break loop;
				}
				else
					paranthesis.pop();
			}
			else if(S.charAt(i)==')') {
				if(paranthesis.peek()=='{'|| paranthesis.peek()=='['||paranthesis.isEmpty())
				{
					flag=false;
					break loop;
				}
				else
					paranthesis.pop();
			}
			else if(S.charAt(i)==']') {
				if(paranthesis.peek()=='{'|| paranthesis.peek()=='('||paranthesis.isEmpty())
				{
					flag=false;
					break loop;
				}
				else
					paranthesis.pop();
			}
			
		  
		
	}
	return flag;
	
}

public void nextGreaterElement(ArrayList<Integer> list) {
	Stack<Integer> stack = new Stack<>();
	for(int a:list) {
		while(!stack.isEmpty()&& stack.peek()<a) {
			System.out.println(stack.pop()+"-->"+a);
		}
		stack.push(a);
	}
	while(!stack.isEmpty()) {
		System.out.println(	stack.pop()+"--> -1");
		}
	
}
public int [] Span(int arr[]) {
	int span[]=new int[arr.length];
	Stack<Integer> spstack=new Stack<>();
	spstack.push(0);
	span[0]=1;
	for(int i=1;i<arr.length;i++) {
		if(spstack.Size()>0&& arr[i]>arr[spstack.peek()]) {
			spstack.pop();
		}
		if(spstack.Size()==0) {
			span[i]=1;
		}
		else
			span[i]=i-spstack.peek()-1;
		spstack.push(i);
	}
	return span;
}
public int maxareahisto(int arr[]) {
	int maxarea=0;
	int []lb=new int[arr.length];
	int rb[]=new int[arr.length];
	Stack<Integer> sb=new Stack<>();
	sb.push(0);
	lb[0]=-1;
	for(int i=1;i<arr.length;i++) {
		while(!sb.isEmpty()&&arr[sb.peek()]>arr[i]) {
			sb.pop();
		}
		if(!sb.isEmpty()) {
			lb[i]=sb.peek();
		}
		else
			lb[i]=-1;
		sb.push(i);
			
	}
	rb[arr.length-1]=arr.length-1;
	sb=new Stack<>();
	sb.push(arr.length-1);
	rb[arr.length-1]=arr.length;
	for(int i=arr.length-2;i>=0;i--) {
		while(!sb.isEmpty()&&arr[sb.peek()]>arr[i]) {
			sb.pop();
		}
		if(!sb.isEmpty()) {
			rb[i]=sb.peek();
		}
		else
			rb[i]=arr.length;
		sb.push(i);
	}
	int currarea=0;
	for(int i=0;i<arr.length;i++) {
		currarea=arr[i]*(rb[i]-lb[i]-1);
		maxarea=Math.max(maxarea,currarea);
	}
	return maxarea;
}
public int infixeva(String S) {
	Stack<Character> operator=new Stack<>();
	Stack<Integer> operand=new Stack<>();
	for(int i=0;i<S.length();i++) {
		char ch=  S.charAt(i);
		if (ch=='(')
			operator.push(ch);
		else if(Character.isDigit(ch)) {
			operand.push(ch-'0');
		}
		else if (ch==')') {
			while(operator.peek()!='(') {
				int val2=operand.pop();
				int val1=operand.pop();
				char op=operator.pop();
				operand.push(operation(val1,val2,op));
			}
			operator.pop();
		}
		else if ((ch == '+' || ch == '-' || ch == '*' || ch == '/') ) {
			while (operator.Size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
				int val2=operand.pop();
				int val1=operand.pop();
				char op=operator.pop();
				operand.push(operation(val1,val2,op));
			}
			operator.push(ch);
		}
	}
	
	while(operator.Size()>0) {
			int val2=operand.pop();
			int val1=operand.pop();
			char op=operator.pop();
			operand.push(operation(val1,val2,op));
		}
	return operand.peek();
}


	private int precedence(Character peek) {
	// TODO Auto-generated method stub
		if(peek=='+'||peek=='-')
			return 1;
		else 
			return 2;

}

	// TODO Auto-generated method stub
	
	public static int operation(int v1, int v2, char opt) {
		if (opt == '+') {
			return v1 + v2;
		} else if (opt == '-') {
			return v1 - v2;
		} else if (opt == '*') {
			return v1 * v2;
		} else {
			return v1 / v2;
		}
}
}
