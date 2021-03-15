package QUEUE;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		function2();
//		ArrayList <Integer> A1= new ArrayList<>();
//		A1.add(10);
//		A1.add(20);
//		A1.add(30);
//		A1.add(40);
//		A1.add(50);
//		ArrayList <Integer> A2= new ArrayList<>();
//		A2.add(5);
//		A2.add(7);
//		A2.add(9);
//		A2.add(11);
//		A2.add(19);
//		A2.add(55);
//		A2.add(57);
//		ArrayList <Integer> A3= new ArrayList<>();
//		A3.add(1);
//		A3.add(2);
//		A3.add(3);
//		ArrayList <Integer> A4= new ArrayList<>();
//		A4.add(32);
//		A4.add(39);
//		ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
//		list.add(A1);
//		list.add(A2);
//		list.add(A3);
//		list.add(A4);
//		
//		mergeKsortedList(list);
		int arr[]= {10,20,30,25,35,47,16,15,27,90,87,1};
		Heap heappq=new Heap();
		heappq.Heap2(arr, true);
		heappq.Display();
		System.out.println(heappq.remove());
		heappq.Display();
		System.out.println(heappq.peek());
		System.out.println(heappq.size());
		System.out.println(heappq.isEmpty());
		}
	public static void function1() {
		int arr[]= {1,2,3,4,59,6,7,89};
		int k=3;
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(i<k) {
				pq.add(arr[i]);
			}
			else {
				if(pq.peek()<arr[i]) {
					pq.remove();
					pq.add(arr[i]);
				}
			}
		}
		
		System.out.println(pq);
	}
	public static void function2() {
		
			int arr[]= {30,10,40,20,50,70,80,60,110,90,100,120};
			int k=2;
			int count=0;
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(i<=k) {
				pq.add(arr[i]);
			}
			else {
				arr[count]=pq.poll();
				count++;
				pq.add(arr[i]);
			}
	  }
		while(pq.size()>0) {
			arr[count]=pq.poll();
			count++;
		}
		
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	

}
	static class Pair implements Comparable<Pair>{
		int li;
		int di;
		int value;
		public Pair(int li, int di, int val) {
			this.li=li;
			this.di=di;
			this.value=val;
		}
		@Override
		public int compareTo(Pair P) {
			return this.value-P.value;
		}
		
	}
	public static void mergeKsortedList(ArrayList<ArrayList<Integer>> lists) {
		PriorityQueue<Pair>pq=new PriorityQueue<>();
		for(int i=0;i<lists.size();i++) {
			Pair p=new Pair(i,0,lists.get(i).get(0));
			pq.add(p);
		}
		while(pq.size()>0) {
			Pair P=pq.remove();
			System.out.println(P.value);
			P.di++;
			if(P.di<lists.get(P.li).size()) {
				P.value=lists.get(P.li).get(P.di);
				pq.add(P);
			}
		}
	}
}

