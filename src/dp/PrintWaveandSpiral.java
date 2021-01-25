package dp;
class PrintWaveandSpiral{
	public static void main(String[] args) {
		int[][]arr= { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		printwave(arr);
		System.out.println("*********");
		printspiral(arr);
		
	}

	private static void printspiral(int[][] arr) {
		// TODO Auto-generated method stub
		int startR=0;
		int startC=0;
		int endR=arr.length-1;
		int endC=arr[0].length-1;
		while(startR<=endR&&startC<=endC) {
			
			for(int i=startC;i<=endC;i++) {
				System.out.print(" "+arr[startR][i]);
			}
			startR++;
			
			for(int j=startR;j<=endR;j++) {
				System.out.print(" "+arr[j][endC]);
			}
			endC--;
			
			for(int k=endC;k>=startC;k--) {
				System.out.print(" "+arr[endR][k]);
			}
			endR--;
			
			for(int l=endR;l>=startR;l--) {
				System.out.print(" "+arr[l][startC]);
			}
			
			startC++;;
			
	  } 
   }		

	private static void printwave(int[][] arr) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for (int j = 0; j < arr[0].length; j++) {
			if (flag == false) {
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			flag = !flag;
			
		
		    
		}
		
		
	}
}