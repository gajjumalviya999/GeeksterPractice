package HW_arrays;
class Zigzagarray{
	public static void main(String[] args) {
		int arr[]={4, 3, 7, 8, 6, 2, 1} ;
		zigzag(arr);
	}

	private static void zigzag(int[] arr) {
		// TODO Auto-generated method stub
		boolean currcase=true;
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			if(currcase) {
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			else
				if(arr[i]<arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			currcase=!currcase;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}