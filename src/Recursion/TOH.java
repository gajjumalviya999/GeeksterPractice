package Recursion;

public class TOH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh(3,'S','D','H');
	}

	private static void toh(int i,char src, char des,char helper) {
		// TODO Auto-generated method stub
		if(i==0)
			return;
		toh(i-1,src,helper,des);
		System.out.println("move "+i+" from "+src+" to "+ des);
		toh(i-1,helper,des,src);
	}
	
}
