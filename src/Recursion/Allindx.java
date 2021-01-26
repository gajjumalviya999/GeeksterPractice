package Recursion;
class Allindx{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,4,4,5,3,4};
		int res[]=allindx(arr,4,0,0);
		for(int i:res)
			System.out.println(i);

	}

	private static int[] allindx(int[] arr, int val, int vidx, int fsf) {
		// TODO Auto-generated method stub
		if(vidx==arr.length) {
			int res[]=new int[fsf];
			return res;
		}
		if(arr[vidx]==val)
		{
			int aid[]=allindx(arr,val,vidx+1,fsf+1);
			aid[fsf]=vidx;
			return aid;
		}
		else
			return allindx(arr,val,vidx+1,fsf);
	}	
}