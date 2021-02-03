package sortingRecurssion;
class MergeSort{
	public static void main(String[] args) {
		int arr[]= {3,5,6,4,2,34,56,35};
	 mergesort(arr,0,arr.length-1);
	 for(int a: arr) {
		 System.out.print(a + "   "); 
	 }
	}

	private static void mergesort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int mid=(l+(r-1))/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			mergeTwoSorted(arr,l,mid,r);
		}
	}

	private static void mergeTwoSorted(int[] arr, int l, int m, int r) {
		int size1 = m - l + 1;
		int size2 = r - m;

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		for (int i = 0; i < size1; i++) {
			arr1[i] = arr[l + i];
		}

		for (int i = 0; i < size2; i++) {
			arr2[i] = arr[m + i + 1];
		}

		int i = 0, j = 0;
		int k = l;
		while (i < size1 && j < size2) {
			if (arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}

		while (j < size2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}	
}