package Recursion;
public class arraysintwosetmindiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,2,1,9};
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		System.out.println(ArrayintwoSetmindiff(arr,0,0,sum));
	}

	private static int  ArrayintwoSetmindiff(int[] arr, int vidx,int sum1,int sum2) {
		// TODO Auto-generated method stub
		if(vidx==arr.length) {
			return Math.abs(sum1-sum2);
		}
		else
		{
			return  Math.min( ArrayintwoSetmindiff(arr,vidx+1,sum1,sum2),ArrayintwoSetmindiff(arr,vidx+1,sum1+arr[vidx],sum2-arr[vidx]));
		}
	}
}
