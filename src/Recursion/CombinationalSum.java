package Recursion;

import java.util.ArrayList;

public class CombinationalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,4,6,8};
		CombinationalSum CS= new CombinationalSum();
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		CS.combinationalsum(arr,8,0,new ArrayList<>(),result);
		System.out.println(result);
	}
	public void  combinationalsum(int[] arr,int sum,int START,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result) {
		if (sum<0) {
			
			return ;
		}
		if (sum==0) {
			result.add(new ArrayList<Integer>(list));
			return ;
		}
		for(int i=START;i<arr.length;i++) {
			list.add(arr[i]);
			combinationalsum(arr,sum-arr[i],i,list,result);
			if(list.size()>0)
				list.remove(list.size()-1);
		}
		
	}

}
