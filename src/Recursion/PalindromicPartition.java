package Recursion;

import java.util.ArrayList;

public class PalindromicPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="Geeks";
	
		System.out.println( palindromicpartition(S.toLowerCase(),"",new ArrayList<String>())) ;
	}

	private static ArrayList<String> palindromicpartition(String string , String ans, ArrayList<String> anslist) {
		// TODO Auto-generated method stub
		if(string.length()==0) {
			anslist.add(ans);	
		}
		for(int i=0;i<string.length();i++) {
		 String pre=string.substring(0, i+1);
		 if (ispalindrome(pre)) {
			 
			palindromicpartition(string.substring(i+1),ans+"["+pre+"]",anslist);
		 }
		}
		
		return anslist ;
	}
private static boolean ispalindrome(String S) {
	if(S.length()==1) {
		return true;
	}
	else {int i=0;
		while(i<=S.length()/2) {
			if(S.charAt(i)!=S.charAt(S.length()-1-i))
				return false;
			i++;
		}
	}
	return true;
	
}
}
