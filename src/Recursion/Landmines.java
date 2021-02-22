package Recursion;

public class Landmines {
public static void main(String[] args) {
	int [][] array= { 
	        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
	        { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
	        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }, 
	        { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 }, 
	        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	        { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
	        { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, 
	        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 
	        { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, 
	        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 } };
	
	System.out.println(shortestpath(unsafearray(array),12,Integer.MAX_VALUE));

}

private static int  shortestpath(int[][] array,int totalrow, int mintillnow) {
	// TODO Auto-generated method stub
	for(int i=0;i<totalrow;i++) {
		mintillnow=Math.min(mintillnow, shortestpathrow(array,i,array.length-1,0,array[0].length,0));
	}
		return mintillnow;
}
private static int shortestpathrow(int [][] array,int currow,int endrow,int cc,int ec,int count) {
	
	
	if(currow==endrow&&cc==ec) {
		return count;
	}
	else if(currow<array.length&&cc<array[0].length)
	{
		if(array[currow][cc]==1)
		{
			
			 shortestpathrow(array,currow,endrow,cc+1,ec,count+1);
			 shortestpathrow(array,currow+1,endrow,cc,ec,count+1);
			 return count;
		}
		else
			return count;
		}
	
	
	return count;
}
private static int [][] unsafearray(int[][] array){
	int R=array.length;
	int C=array[0].length;
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array[0].length;j++) {
			if(array[i][j]==0) {
				if(isvalid(i,j-1,R,C))
					array[i][j-1]=-1;
				if(isvalid(i,j+1,R,C))
					array[i][j+1]=-1;
				if(isvalid(i-1,j,R,C))
					array[i-1][j]=-1;
				if(isvalid(i+1,j,R,C))
					array[i+1][j]=-1;
			}
		}
	}
	for(int i=0;i<R;i++) {
		for(int j=0;j<C;j++) {
			if(array[i][j]==-1) {
				array[i][j]=0;
			}
		}
	}
	return array;
}
private static boolean isvalid(int i,int j,int R,int C) {
	if(i>=R||i<0||j>=C||j<0) {
		return false;
	}
	return true;
}
}
