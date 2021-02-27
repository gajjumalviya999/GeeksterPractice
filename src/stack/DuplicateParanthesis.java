package stack;

public class DuplicateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateParanthesis dp= new DuplicateParanthesis();
		System.out.println(dp.duplicatepara("(((a+b))+(c+d))"));
	}
	public boolean duplicatepara(String str) {
		Stack<Character> st= new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=')') 
				st.push(ch);
			else { if(st.peek()=='(')
					 return true;
				   while(st.peek()!='(')
					   st.pop();
				   st.pop();
			}
		}
		return false;
	}

}
