package HW;
class KnightTourProblem{
	public static void main(String[] args) {
		int n=8;// Size of board
		int r=0,c=0;// position of knight in starting ;
		int arr[][]=new int[n][n];
		
		KnightTour(arr,r,c,n,1);
		
		
	}

	private static void showarr(int[][] arr, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}

	private static void KnightTour(int arr[][], int row, int col,int n, int move) {
		// TODO Auto-generated method stub
		if(row<0||col<0||row>=arr.length||col>=arr.length||arr[row][col]>0) {
			return;
		}
		else if(move==n*n) {
			arr[row][col]=n*n;
			showarr(arr,n);
			return;
			
		}
			
		arr[row][col]=move;
		KnightTour(arr,row-2,col+1,n,move+1);
		KnightTour(arr,row-1,col+2,n,move+1);
		KnightTour(arr,row+1,col+2,n,move+1);
		KnightTour(arr,row+2,col+1,n,move+1);
		KnightTour(arr,row+2,col-1,n,move+1);
		KnightTour(arr,row+1,col-2,n,move+1);
		KnightTour(arr,row-1,col-2,n,move+1);
		KnightTour(arr,row-2,col-1,n,move+1);
		arr[row][col]=0;
	}
	
}