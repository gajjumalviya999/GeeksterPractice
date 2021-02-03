package Recursion;
class BinaryString{
	public static void main(String[] args) {
		String S= new String("?1?");
		binarystring(S,new StringBuilder(""),0);
	}

	private static void binarystring(String Ques, StringBuilder ans, int vidx) {
		// TODO Auto-generated method stub
		if(vidx==Ques.length()) {
			System.out.println(ans);
			return;
		}
		char ch=Ques.charAt(vidx);
		if(ch!='?') {
			ans.append(ch);
			binarystring(Ques,ans,vidx+1);
			ans.deleteCharAt(ans.length()-1);
		}
		else
		{   ans.append('1');
			binarystring(Ques,ans,vidx+1);
			ans.deleteCharAt(ans.length()-1);
			if(vidx!=0) {
				 ans.append('0');
				binarystring(Ques,ans,vidx+1);
				ans.deleteCharAt(ans.length()-1);
			}
			else
				binarystring(Ques,ans,vidx+1);
				
		}
		
	}
}