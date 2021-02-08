package IntroPart;
public class HelloWorld
{

	public static void main(String[] args) {
		String s ="babccc";
		boolean flag=false;
		int[] freq=new int[27];//hashing array
	    for(int i=0;i<s.length();i++) {
	    	char ch=s.charAt(i);
	    	freq[(int)ch-96]++;
	    }
	    for(int i=1;i<27;i++) {
	    	if(freq[i]>0&&freq[i]!=i) {
	    		flag=true;
	    		break;
	    	}
	    }
	    if(flag)
	    	System.out.println("NO");
	    else
	    	System.out.println("YES");
	}
}