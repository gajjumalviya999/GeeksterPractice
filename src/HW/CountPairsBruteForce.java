package HW;
class CountPairsBruteForce{
	public static void main(String[] args) {
		int X[] = {2, 1, 6};
		int Y[] = {1, 5} ;
		System.out.println(countPairsBruteForce(X,Y));
		
	}
	public static int countPairsBruteForce(int X[], int Y[] )
			
    { 
       int ans = 0; 
       for(int i = 0; i < X.length; i++) 
       for(int j = 0; j < Y.length; j++) 
        if (Math.pow(X[i], Y[j]) > Math.pow(Y[j], X[i])) 
         ans++; 

       return ans; 
} 



}
