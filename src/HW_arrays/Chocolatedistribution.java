package HW_arrays;


import java.util.Arrays;

class Chocolatedistribution{
	public static void main(String[] args) {
		int arr[]= {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48,43, 50};
		int m=7;
		System.out.println(chocolatedistribution(arr,m));
		
	}

	private static int chocolatedistribution(int[] arr,int m) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int diff;
		int min=Integer.MAX_VALUE;
		for(int i=0;i+m-1<arr.length;i++) {
				diff=arr[i+m-1]-arr[i];
				if(diff<min)
				{
					min=diff;
				}
			
		}
		return min;
	}
}