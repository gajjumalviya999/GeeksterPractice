//package HW;
//
//public class HurdleLongestPath {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HurdleLongestPath hlp=new HurdleLongestPath();
//		int arr[][]= { 
//		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
//		        { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 }, 
//		        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } 
//		    }; 
//		 hlp.path(arr,0,0,arr.length-1,arr[0].length-1,0);
//		 System.out.println(longpath);
//	
//	}
//	
//	private void  path(int[][] arr, int cr, int cc, int er, int ec,int currlongpath) {
//		// TODO Auto-generated method stub
//		if(cr==er&&cc==ec) {
//			longpath= Math.max(currlongpath, longpath);
//			
//		}
//		if(cr>er||cc>ec||cr<0||cc<0)
//		  return; 
//		
//		if(cc+1!=arr[0].length&&issafe(arr,cr,cc+1)) {
//			if(!isvisited(arr,cr,cc+1))
//				{currlongpath++;
//				arr[cr][cc+1]=-1;
//				path(arr,cr,cc+1,er,ec,currlongpath);
//				arr[cr][cc+1]=1;
//			
//			}
//		}
//		if(cr+1!=arr.length&&issafe(arr,cr+1,cc)) {
//			if(!isvisited(arr,cr+1,cc))
//			{
//			arr[cr+1][cc]=-1;
//			currlongpath++;
//			path(arr,cr+1,cc,er,ec,currlongpath);
//			
//			arr[cr+1][cc]=1;
//		}
//	   }
//		if(cc-1!=-1&&issafe(arr,cr,cc-1)) {
//		if(!isvisited(arr,cr,cc-1))
//		{
//		arr[cr][cc-1]=-1;
//		currlongpath++;
//		path(arr,cr,cc+1,er,ec,currlongpath);
//		arr[cr][cc-1]=1;
//		
//		}
//	}
//		if(cr-1!=-1&&issafe(arr,cr-1,cc)) {
//	if(!isvisited(arr,cr-1,cc))
//	{
//	arr[cr-1][cc]=-1;
//	currlongpath++;
//	path(arr,cr,cc+1,er,ec,currlongpath);
//	arr[cr-1][cc]=1;
//
//	 }
//	}
//	
//	}
//	private boolean issafe(int arr[][],int cr,int cc) {
//		if(arr[cr][cc]==0)
//			return false;
//		else 
//			return true;
//	}
//	private boolean isvisited(int arr[][],int cr,int cc) {
//		if(arr[cr][cc]==-1)
//			return true;
//		else 
//			return false;
//	}
//	
//
//}
