package HW;
class QueensProblem1{
	public static void main(String[] args) {
		int arr[][]=new int[4][4];
		queensproblem(arr,4,0,0);
//		for(int i[]:arr) {
//			for(int j=0;j<i.length;j++) {
//				System.out.print(i[j]+ "\t");
//			}
//			System.out.println();
//		}
	}

	private static void queensproblem(int[][] arr,int n, int row,int queenplaced) {
		// TODO Auto-generated method stub
		if(row==n&&queenplaced==n) {
			for(int i[]:arr) {
				for(int j=0;j<i.length;j++) {
					System.out.print(i[j]+ "\t");
				}
				System.out.println();
//				System.out.println();
			}
			System.out.println("***************************");
			return;
		}
		else if(row>n) {
			return;
		}
		
		for(int col=0;col<n;col++) {
			if(issafe(arr,n,row,col)) {
				arr[row][col]=1;
				queensproblem(arr,n,row+1,queenplaced+1);
				arr[row][col]=0;
			}
		}
		
	}

	private static boolean issafe(int[][] arr, int n, int row, int col) {
		// TODO Auto-generated method stub
		 int i=row-1,j=col-1;
		 while(i>=0&&j>=0) {
			 if(arr[i][j]==1) {
				 return false;
			 }
			 i--;
			 j--;
		 }
		 i=row-1;
		 j=col+1;
		 while(i>=0&&j<n) {
			 if(arr[i][j]==1) {
				 return false;
			 }
			 i--;
			 j++;
		 }
		i=row-1;
		j=col;
		while(i>=0) {
			 if(arr[i][j]==1) {
				 return false;
			 }
			 i--;
		}
		return true;
	}
}