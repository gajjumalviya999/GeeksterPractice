package dp;

import java.util.ArrayList;

class ArrayList01{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(1);
		System.out.println(arraylist01(list));
	}
	public static ArrayList<Integer> arraylist01(ArrayList<Integer>list){
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==1) {
				list.remove(i);
				list.add(1);
			}
		}
		
		return list;
	}
	
}