package HW_arrays;

import java.util.ArrayList;

class PairDiff{
	public static void main(String[] args) {
		int arr[]={5, 20, 3, 2, 50, 80};
		System.out.println(pairdiff(arr,15));
		
	}

	private static ArrayList<Integer> pairdiff(int[] arr,int givendiff) {
		// TODO Auto-generated method stub
		ArrayList<Integer> res=new ArrayList<>();
		int diffij;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				diffij=Math.abs(arr[i]-arr[j]);
				if(diffij==givendiff)
				{
					res.add(arr[i]);
					res.add(arr[j]);
					return res;
				}
			}
		}
		if(res.size()==0)
			System.out.println("No element Found");
		return res;
	}
}