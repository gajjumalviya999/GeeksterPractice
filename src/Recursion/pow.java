package Recursion;
class pow{
	public static void main(String[] args) {
		System.out.println(powx(2,10));
		System.out.println(powxBtr(2,9));
	}

	private static int powxBtr(int x, int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		if(n%2==0) {
			int halfpow=powxBtr(x,n/2);
			return halfpow*halfpow;
	}
		else {
			int halfpow=powxBtr(x,n/2);
		return halfpow*halfpow*x;
		}
	}		
	private static int powx(int x,int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		int prepow=powx(x,n-1);
		return prepow*x;
	}

	

	
	
}