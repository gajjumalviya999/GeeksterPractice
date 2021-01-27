package Recursion;

import java.util.ArrayList;

class GetKPC{
	public static void main(String[] args) {
		System.out.println(getKPC("12"));
		
	}

	private static ArrayList<String> getKPC(String s) {
		// base case
		if(s.length()==0)
		{ ArrayList<String> br=new ArrayList<String>();
		br.add("");
		return br;
		}	
		char ch=s.charAt(0);
		String ros=s.substring(1);
		ArrayList <String> rr=getKPC(ros);
		ArrayList <String> mr=new ArrayList<String>();
		String charkpc=getchar(ch);
		for(String r:rr)
		{
		for(int i=0;i<charkpc.length();i++) {
			mr.add(charkpc.charAt(i)+r);
		}
		}
		return mr;
		
		
		
		
	}
	private static String getchar(char ch) {
		if(ch=='1')
			return "abc";
		else if(ch=='2')
			return "def";
		else if(ch=='3')
			return "ghi";
		else if(ch=='4')
			return "jkl";
		else if(ch=='5')
			return "mno";
		else if(ch=='6')
			return "pqr";
		else if(ch=='7')
			return "stu";
		else if(ch=='8')
			return "vwx";
		else if(ch=='9')
			return "yz";
		else 
			return "";
	}
}