package QUEUE;

import java.util.ArrayList;

public class Heap {
	ArrayList<Integer> heap= new ArrayList<>();
	boolean min;
	
//	public Heap(int arr[], boolean min) {
//		this.min=min;
//		this.heap.add(arr[0]);
//		for(int i=1;i<arr.length;i++) {
//			heap.add(arr[i]);
//			upheapify((i-1)/2,i,min);
//		}
//	}
//		
	
	public void Heap2(int arr[],boolean min) {
		this.min=min;
		for(int i=0;i<arr.length;i++) {
			this.heap.add(arr[i]);
		}
		for(int i=this.heap.size()/2-1;i>=0;i--) {
			downheapify(i,this.min);
		}
	}

	private void downheapify(int pi,boolean min) {
	// TODO Auto-generated method stub
		int maxi=pi;
		int lci=2*pi+1;
		int rci=2*pi+2;
		if(lci<this.heap.size()&&!isHP(maxi,lci,min)) {
			maxi=lci;
			
		}
		if(rci<this.heap.size()&&!isHP(maxi,rci,min)) {
			maxi=rci;
			
		}
		if(maxi!=pi) {
			swap(pi,maxi);
			downheapify(maxi,min);
		}
}

	private void upheapify(int pi, int ci, boolean min) {
		// TODO Auto-generated method stub
			if(!isHP(pi,ci,min))
			{	swap(pi,ci);
				if(pi>0) {
					upheapify((pi-1)/2,pi,min);
				}
			}
			return;	
	}

	private void swap(int pi, int ci) {
		// TODO Auto-generated method stub
		int temp=this.heap.get(pi);
		this.heap.set(pi,this.heap.get(ci));
		this.heap.set(ci, temp);
		return;
	}
	private boolean isHP(int pi,int ci ,boolean min) {
		if(min) {
			if(this.heap.get(pi)<this.heap.get(ci))
				return true;	
		}
		else {
			if(this.heap.get(pi)>this.heap.get(ci))
				return true;	
		}
		return false;
	}
	public int remove() {
		swap(0,this.heap.size()-1);
		int removeelement=this.heap.remove(this.heap.size()-1);
		downheapify(0,this.min);
		return removeelement;
	}
	public void Display() {
		System.out.println(this.heap);
	}
	public int peek() {
		return this.heap.get(0);
	}

	public int size() {
		// TODO Auto-generated method stub
		return this.heap.size();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.heap.isEmpty();
	}

}
