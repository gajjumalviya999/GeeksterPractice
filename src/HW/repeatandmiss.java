package HW;
class repeatandmiss{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,6,7,8,9};
		searchrepeatandmiss(arr);
		
	}

	private static void searchrepeatandmiss(int[] arr) {
		// TODO Auto-generated method stub
		int myarr[]=new int[arr.length+1];
		int repeat=-1;
		for(int i:myarr)
			i=0;
		for(int i=0;i<arr.length;i++) {
			if(myarr[arr[i]]!=0)
				repeat=arr[i];		
		
		else 
			myarr[arr[i]]=1;
		}
		for(int i=1;i<myarr.length;i++)
			if(myarr[i]==0) {
				System.out.println("missing number is " + i + " and repeat number is "+ repeat);
				return;
			}
	}
}