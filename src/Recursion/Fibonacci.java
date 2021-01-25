package Recursion;
class Fibonacci{
	public static void main(String[] args) {
		System.out.println(fibonacci(7));
	}

	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1) 
			return n;
		int pr1=fibonacci(n-1);
		int pr2=fibonacci(n-2);
		return pr1+pr2;
		
	}

	
	
}