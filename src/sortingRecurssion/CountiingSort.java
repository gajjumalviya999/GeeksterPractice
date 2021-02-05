package sortingRecurssion;
class Countingsort{
	public static void main(String[] args) {
		int arr[]= {1, 4, 1, 2, 7, 5, 2};
		int max=Integer.MIN_VALUE;
		for(int element:arr) 
			max=Math.max(max, element);
			int ans[]=countsort(arr,max);
		for(int element:ans)
			System.out.println(element + " ");
	}

	private static int [] countsort(int[] arr, int max) {
		// TODO Auto-generated method stub
		int [] countarray=new int[max+1];
		int answer[]=new int[arr.length];
		for(int element :arr)
			countarray[element]++;
		
		for(int i=1;i<max+1;i++) {
			countarray[i]=countarray[i]+countarray[i-1];
		}
		for(int i=arr.length-1;i>=0;i--) {
			answer[countarray[arr[i]]-1]=arr[i];
			countarray[arr[i]]--;
		}
		return answer;
	}
}