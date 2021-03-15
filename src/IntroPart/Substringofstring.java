package IntroPart;

public class Substringofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABCDEFGHI";
		String []arr=  {"ABC","CDE","ZXY","ABCDEFGHI",""};
		substringss(str,arr);
	}

	private static void substringss(String str, String[] arr) {
		// TODO Auto-generated method stub
		int res[]= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int lenofstring=arr[i].length();
			if(lenofstring==str.length()&&str.equals(arr[i]))
				res[i]=1;
			else if(lenofstring==0)
				res[i]=1;
			else
			for(int j=0;j<str.length()-lenofstring;j++) {
				if(str.substring(j,j+lenofstring).equals(arr[i]))
				{	
					res[i]=1;
				    break;
				}
			}
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
