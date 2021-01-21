package dp;
class Majorityidx{
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,3,2,2};
		majorityidx(arr);
		
	}
	public static void majorityidx(int [] arr) {
		int mjidx=0;
		int count =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[mjidx]==arr[i]) 
				count++;
			
			else
				count--;
			if(count==0)
			{
				mjidx=i;
				count=1;
			}
			
		}
		int element=arr[mjidx];
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element)
				count++;
		}
		if(count>(int)arr.length/2)
			System.out.println("mjority element is " + element);
		else
			System.out.println("No majority element");
		
	}
}