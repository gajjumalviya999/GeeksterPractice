package Recursion;

import java.util.ArrayList;

class GetPermutation{
	public static void main(String[] args) {
		System.out.println(getpermutation("abcd"));
	}

	private static ArrayList<String> getpermutation(String s) {
		// TODO Auto-generated method stub
	 if(s.length()==0) {
		 ArrayList<String> res=new ArrayList<String>();
		 res.add("");
		 return res;
	 }
	 char firstch=s.charAt(0);
	 ArrayList<String> rr=getpermutation(s.substring(1));
	 ArrayList<String> ss=new ArrayList<String>();
	 for(String rs:rr) {
		 for(int i=0;i<=rs.length();i++) {
			String ms =rs.substring(0,i)+firstch+rs.substring(i);
		 ss.add(ms);
		 }
	 }
	 return ss;
	 
	}
}