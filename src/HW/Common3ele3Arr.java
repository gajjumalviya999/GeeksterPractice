package HW;

import java.util.ArrayList;

class Common3ele3Arr{
	public static void main(String[] args) {
		// Array must be sorted
		int ar1[] = {1, 5, 10, 20, 40, 80},
		ar2[] = {6, 7, 20, 80, 100},
		ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println("Common elements are"+common3ele3Arr(ar1,ar2,ar3));
	}

	private static ArrayList<Integer> common3ele3Arr(int[] ar1, int[] ar2, int[] ar3) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		ArrayList<Integer> Ans=new ArrayList<Integer>();
		while(i<ar1.length&&j<ar2.length&&k<ar3.length) {
			if(ar1[i]==ar2[j]&&ar2[j]==ar3[k]) {
					Ans.add(ar1[i]);
					i++;
					j++;
					k++;
			}
			else
				if(ar1[i]<ar2[j])
					i++;
				else if (ar2[j]<ar1[i])
					j++;
				else
					k++;
				 
			
		}
		return Ans;
	}
}