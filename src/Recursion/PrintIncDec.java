package Recursion;
class PrintIncDec{
	public static void main(String[] args) {
		printincdec(5);
		
	}

	private static void printincdec(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		if(n%2!=0)
		System.out.println(" Hii " +n);
		printincdec(n-1);
	    if(n%2==0)
		System.out.println("bye" +n);
		
	}
}