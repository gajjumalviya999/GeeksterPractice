package HW;
class RatinMaze{
	public static void main(String[] args) {
		int arr[][]={{1, 0, 0, 0},
					 {1, 1, 1, 1},
					 {0, 1, 1, 0},
					 {1, 1, 1, 1}};
		int sol[][]=new int [arr.length][arr[0].length];
	   ratInMaze(arr,0,0,sol);
	 
}

	private static void ratInMaze(int[][] arr,int cur_r,int cur_c,int sol[][]) {
		// TODO Auto-generated method stub
		if(cur_r==arr.length-1&&cur_c==arr[0].length-1) {
			sol[cur_r][cur_c]=1;
			 for(int i[]:sol) {
				   for(int j=0;j<i.length;j++)
					   System.out.print(i[j]+"\t" );
				   System.out.println();
			 }
			 System.out.println("**********************");
			return;
		}
		
		if(arr[cur_r][cur_c]==1) {
			sol[cur_r][cur_c]=1;
			if(cur_c+1<arr.length)
				ratInMaze(arr,cur_r,cur_c+1,sol);
			if(cur_r+1<arr.length)
				ratInMaze(arr,cur_r+1,cur_c,sol);
			sol[cur_r][cur_c]=0;
		}
		else
			return;	
	}	
}