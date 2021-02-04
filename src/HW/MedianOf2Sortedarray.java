package HW;
class MedianOf2Sortedarray{
	public static void main(String[] args) {
		int ar1[] = {2, 3, 5, 8};
        int ar2[] = {10, 12, 14, 16, 18, 20};
         System.out.println(median(ar1,ar2));
	}

	private static int median(int[] ar1, int[] ar2) {
		// TODO Auto-generated method stub
		
		int total= ar1.length+ar2.length;
		int arr[]=new int [total];
		int i=0,j=0,k=0;
		while(i<ar1.length&&j<ar2.length) {
			if(ar1[i]<ar2[j])
			{
				arr[k]=ar1[i];
				i++;
			}
			else {
				arr[k]=ar2[i];
				j++;
			}
			k++;
		}
		while(i<ar1.length)
		{
			arr[k]=ar1[i];
			i++;
			k++;
		}
		while(j<ar2.length)
		{
			arr[k]=ar2[j];
			j++;
			k++;
		}
		if(total%2==0) {
		   return  (arr[total/2]+arr[(total/2)-1])/2;
		}
		else
			return arr[total/2];
	}
}		
		