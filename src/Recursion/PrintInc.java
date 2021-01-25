package Recursion;
class PrintInc{
	public static void main(String[] args) {
		printinc(5);
		
	}

	private static void printinc(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		printinc(n-1);
		System.out.println(n);
		
		
	}
}