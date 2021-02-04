package HW;
class CountTripletsSum{
	public static void main(String[] args) {
		int arr[]= {5, 1, 3, 4, 7};
		int sum=12;
		System.out.println(countTripletsSum(arr,sum));
	}

	private static int countTripletsSum(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int n= arr.length;
		int count=0;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]<sum) {
						System.out.println("(" +arr[i]+" , " +arr[j]+" , "+arr[k] +")");
						count++;
				}
			}
		}
		
	}
	return count;	
}
}