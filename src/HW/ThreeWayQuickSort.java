package HW;
class ThreeWayQuickSort{
	public static void main(String[] args) {
		 int []arr={1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4};
		 ThreeQuickSort(arr,0,arr.length-1);
		 for(int element:arr)
			 System.out.print(element+ "  ");
	}

	private static void ThreeQuickSort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low<high) {
		int pivot=arr[high];
		int pivotstart=partitionstart(arr,low,high,pivot);
		int pivotend=partitionmid(arr,pivotstart,high,pivot);
		ThreeQuickSort(arr,low,pivotstart-1);
		ThreeQuickSort(arr,pivotend+1,high);
		}
	}

	
	private static int partitionstart(int[] arr, int low, int high,int pivot) {
		// TODO Auto-generated method stub
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	private static int partitionmid(int[] arr, int pivotstart, int high, int pivot) {
		// TODO Auto-generated method stub
		int i=pivotstart-1;
		for(int j=pivotstart;j<=high;j++) {
			if(arr[j]==pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return;
	}
	
}