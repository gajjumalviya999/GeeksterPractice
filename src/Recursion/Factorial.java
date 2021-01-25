package Recursion;
class Factorial{
	public static void main(String[] args) {
		System.out.println(fact(6));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		int prfact=fact(n-1);
		return n*prfact;
	}
}