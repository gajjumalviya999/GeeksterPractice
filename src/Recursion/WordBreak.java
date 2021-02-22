package Recursion;

public class WordBreak {
public static void main(String[] args) {
	String str="iloveicecreamandmango";
	Wordbreak(str,str.length(),"");
}
public static String Wordbreak(String str,int n, String ans) {
	if(n==0) {
		System.out.println(ans + " ");
		return "";
	}	
	for(int i=1;i<=n;i++) {
		if(dictionarycheck(str.substring(0, i))) {
			
			Wordbreak(str.substring(i),n-i,ans+" " +str.substring(0, i));
		}
	}
	return "";
	
}
public static boolean dictionarycheck(String word) {
	String[] Dictionary=  {"mobile","samsung","sam","sung",
            "man","mango", "icecream","and",
            "go","i","love","ice","cream"};
	for(int i=0;i<Dictionary.length;i++) {
		if(Dictionary[i].equalsIgnoreCase(word))
			return true;
	}
	return false;
}
}
