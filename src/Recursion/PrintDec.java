package Recursion;
class PrintDec{
	public static void main(String[] args) {
		printdec(5);
		
	}

	private static void printdec(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		
		System.out.println(n);
		printdec(n-1);
		
	}
}