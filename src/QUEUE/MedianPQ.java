package QUEUE;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPQ {
	PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer>pq2= new PriorityQueue<>();
	
	
	public void  add(int data){
		if(pq1.size()==0&&pq2.size()==0) {
			pq1.add(data);
		}
		else if(pq1.size()==0) {
			pq1.add(data);
		}
		else if(pq2.size()==0) {
			pq2.add(data);
		}
		else {
			if(data<pq1.peek())
				pq1.add(data);
			else {
				pq2.add(data);
			}	
			balance(pq1,pq2);
		}
	}
	public int peek()
	{
		if(pq2.size()>pq1.size())
			return pq2.peek();
		else
			return pq1.peek();
	}
	public int size() {
		return pq1.size()+pq2.size();
	}
	public int remove() {
		if(pq1.size()>=pq2.size())
			return pq1.remove();
		else return pq2.remove();
	}
	
	
	
	
	
	

	private void balance(PriorityQueue<Integer> pq1, PriorityQueue<Integer> pq2) {
		// TODO Auto-generated method stub
		if(pq1.size()-pq2.size()>1)
			pq2.add(pq1.remove());
		else
			if(pq2.size()-pq1.size()>1)
				pq1.add(pq2.remove());
	}







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MedianPQ  mp = new MedianPQ();
	        mp.add(10);
	        System.out.println(mp.peek());
	        mp.add(100);;
	        System.out.println(mp.peek());
	        mp.add(90);
	        System.out.println(mp.peek());
	        mp.add(80);;
	        System.out.println(mp.peek());
	        mp.add(110);
	        System.out.println(mp.peek());
	        mp.add(105);;
	        System.out.println(mp.peek());
	        mp.add(120);
	        System.out.println(mp.peek());
	        System.out.println();
	        System.out.println(mp.remove());
	        System.out.println(mp.remove());
	        System.out.println(mp.remove());
	        System.out.println(mp.remove());
	}

}
