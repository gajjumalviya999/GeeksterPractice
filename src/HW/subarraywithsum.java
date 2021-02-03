package HW;
class subarraywithsum{
	public static void main(String[] args) {
		int arr[]={1, 4};
		function1(arr,0);
		
	}

	private static void function1(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int currsum=0;
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			currsum=0;
			for(int j=i;j<arr.length;j++) {
				currsum+=arr[j];
				if(currsum==sum) {
					System.out.println("sum found between index " + i+  " and " +j);
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		if(flag==0)
			System.out.println("No subarray found\r\n" + 
					"There is no subarray with " + sum + " sum");
		
	}
}