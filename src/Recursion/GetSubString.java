package Recursion;

import java.util.ArrayList;

class GetSubString{
	public static void main(String[] args) {
		System.out.println(getsubstring("abc"));
	}

	private static ArrayList<String> getsubstring(String s) {
		// TODO Auto-generated method stub
	 if(s.length()==0) {
		 ArrayList<String> res=new ArrayList<String>();
		 res.add("");
		 return res;
	 }
	 char firstch=s.charAt(0);
	 ArrayList<String> rr=getsubstring(s.substring(1));
	 ArrayList<String> ss=new ArrayList<String>();
	 for(String rs:rr) {
		 ss.add(rs);
		 ss.add(firstch+rs);
	 }
	 return ss;
	 
	}
}