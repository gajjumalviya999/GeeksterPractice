package stack;

import java.util.HashSet;

public class validparanthesis {
	public static void main(String[] args) {
		printvalid("()V)");
	}

public static  int  getmin(String str) {
	Stack<Character> st= new Stack<>();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='(')
			st.push('(');
		else if(str.charAt(i)==')')
		{
		 if (st.Size()!=0&&st.peek()=='(')
			 st.pop();
		
		 else if(st.Size()==0||st.peek()==')')
			st.push(')');
		}
	}
	return st.Size();
}
public static void printvalid(String str) {
	int minrem=getmin(str);
	HashSet<String> HS= new HashSet<>();
	solution(str,minrem,HS);
}

public static void solution(String str, int minrem,HashSet<String> HS) {
	// TODO Auto-generated method stub
	if(minrem==0) {
		if(getmin(str)==0&&!HS.contains(str)) {
			System.out.println(str);
			HS.add(str);
		}
		return;
	}
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='('||str.charAt(i)==')') {
		solution(str.substring(0,i)+str.substring(i+1,str.length()),minrem-1,HS);
	}
	}
}

}