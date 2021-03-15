package HashMaputil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class HashMaputil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hmap1= new HashMap<>();
		int []arr1= {1,1,2,2,2,3,5};
		int[] arr2= {1,1,1,2,2,4,5};
		
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
//		getCommonElement2(arr1,arr2);
//		int[] arr = {2,12,9,16,10,5,3,20,25,11,1,8,6,13};
//		LongestSubsequence(arr);
//		LargetsKelementinarr(arr ,4);
		LongestSubstringWithoutRepeat("gajendramalviya");
		
	}
	public static void getCommonElement(HashMap<Integer,Integer>hmap1,HashMap<Integer,Integer> hmap2) {
		for(int keys:hmap1.keySet()) {
			if(hmap2.containsKey(keys))
				System.out.print(keys+"  ");
		}
	}
	public static void getCommonElement2(int[] arr1,int[] arr2) {
		System.out.println();
		HashMap<Integer, Integer> hmap1= new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(!hmap1.containsKey(arr1[i])) {
				hmap1.put(arr1[i],1);
			}
			else {
				hmap1.put(arr1[i],hmap1.get(arr1[i])+1);
			}
		}
		for(int a: arr2) {
			if(hmap1.containsKey(a)) {
				System.out.print(a+"   ");
				hmap1.put(a, hmap1.get(a)-1);
				if(hmap1.get(a)==0)
					hmap1.remove(a);
			}
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
		System.out.println();
		System.out.println(sidx+ "   " +maxcount);
		
	}
	public static void LargetsKelementinarr(int arr[],int k){
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			if(i<k) {
				pq.add(arr[i]);
			}
			else {
				if(arr[i]>pq.peek()) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		while(pq.size()>0) {
			System.out.println(pq.remove());
		}
	}
	public static void LongestSubstringWithoutRepeat(String Str) {
		int max=0;
		int count=0;
		int sidx=-1;
		for(int i=0;i<Str.length();i++) {
			Set<Character> myset=new HashSet<>();
			count=0;
			inner: for(int j=i;j<Str.length();j++) {
				if(!myset.contains(Str.charAt(j)))
				{
					myset.add(Str.charAt(j));
					count++;
				}
				else
					break inner;
			}
			if(count>max) {
				sidx=i;
			    max=count;
			}
		}
		System.out.println(Str.substring(sidx,sidx+max));
		
		
	}
	
	

}
