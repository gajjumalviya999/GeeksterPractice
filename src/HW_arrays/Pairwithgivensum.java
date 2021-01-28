package HW_arrays;
class Pairwithgivensum{
	public static void main(String[] args) {
		int arr[]={11, 15, 6, 8, 9, 10};
		pairwithsum(arr,12);
		
	}

	private static void pairwithsum(int[] arr, int sum) {
		// TODO Auto-generated method stub
	
		int flag=0;
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==sum) {
					System.out.println("sum found between pair " + arr[i]+  " and " +arr[j]);
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		if(flag==0)
			System.out.println("No pair found\r\n" + 
					"There is no pair with " + sum + " sum");
		
	}
}