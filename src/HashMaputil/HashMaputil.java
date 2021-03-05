package HashMaputil;

import java.util.HashMap;

public class HashMaputil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap1= new HashMap<>();
		int []arr1= {2,2,3,3,3,5,5,5,1};
		int[] arr2= {2,2,5,5,5,1};
		
		for(int i=0;i<arr1.length;i++) {
			if(!hmap1.containsKey(arr1[i])) {
				hmap1.put(arr1[i],1);
			}
			else {
				hmap1.put(arr1[i],hmap1.get(arr1[i])+1);
			}
		}
		HashMap<Integer, Integer> hmap2= new HashMap<>();
		
		for(int i=0;i<arr2.length;i++) {
			if(!hmap2.containsKey(arr2[i])) {
				hmap2.put(arr2[i],1);
			}
			else {
				hmap2.put(arr2[i],hmap2.get(arr2[i])+1);
			}
		}
//		getCommonElement(hmap1,hmap2);
//		getCommonElement2(hmap1,hmap2);
		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6,13};
		LongestSubsequence(arr);
		
	}
	public static void getCommonElement(HashMap<Integer,Integer>hmap1,HashMap<Integer,Integer> hmap2) {
		for(int keys:hmap1.keySet()) {
			if(hmap2.containsKey(keys))
				System.out.print(keys+"  ");
		}
	}
	public static void getCommonElement2(HashMap<Integer,Integer>hmap1,HashMap<Integer,Integer> hmap2) {
		System.out.println();
		for(int keys:hmap1.keySet()) {
			if(hmap1.get(keys)==hmap2.get(keys))
				System.out.print(keys+"  ");
		}
	}
	public static void LongestSubsequence(int arr[]) {
		HashMap<Integer,Boolean>hmap= new HashMap<>();
		for(int a:arr) {
			hmap.put(a, true);
		}
		for(int a:hmap.keySet()) {
			if(hmap.containsKey(a-1)) {
				hmap.put(a, false);
			}
		}
		int maxcount=1;
		int sidx=-1;
		int count;
		for(int a:hmap.keySet()) {
			if(hmap.get(a)==true) {
				count=1;
				while(hmap.containsKey(a+count)) {
					count++;
				}
				if(count>maxcount) {
					maxcount=count;
					sidx=a;
				}
			}
		}
		System.out.println(sidx+ "   " +maxcount);
		
	}
	
	

}
