package dp;

import java.util.ArrayList;

class MergetwoSortedList{
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(15);
		list2.add(25);
		list2.add(35);
		list2.add(45);
		list2.add(55);
		System.out.println(merge(list1,list2));
	}
	public static ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list2){
		ArrayList<Integer>list=new ArrayList<Integer>();
		int ptr1=0, ptr2=0;
		while(ptr1<list1.size() && ptr2<list2.size()) 
		{
			if(list1.get(ptr1)<list2.get(ptr2)) 
			{
				list.add(list1.get(ptr1));
				ptr1++;
				}
			else {
				list.add(list2.get(ptr2));
			    ptr2++;
			}
		}
		while(ptr1<list1.size()) {
			list.add(list1.get(ptr1));
			ptr1++;
		}
		while(ptr2<list2.size()) {
			list.add(list2.get(ptr2));
		    ptr2++;
		}
		return list;
	}
}