package sortingRecurssion;
class QuickSort{
	public static void main(String[] args) {
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
	 quicksort(arr,0,arr.length-1);
	 for(int a: arr) {
		 System.out.print(a + "   "); 
	 }
	}

	private static void quicksort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int ipartition=partition(arr,l,r);
			quicksort(arr,l,ipartition-1);
			quicksort(arr,ipartition+1,r);
			return;
		}
		
	}

	private static int partition(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		int pivot=arr[r];
		int i=l-1;
		for(int j=l;j<r;j++) {
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		
		return i+1;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return;
	}
}