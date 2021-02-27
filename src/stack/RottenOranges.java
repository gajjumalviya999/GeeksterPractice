package stack;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
	int rr;
	int cc;
	public Pair(int rr, int cc ) {
		this.rr=rr;
		this.cc=cc;
	}
}
public class RottenOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]={ {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
		int r=arr.length;
		int c=arr[0].length;
		System.out.println(rottenoranges(arr,r,c));
		
	}

	private static int rottenoranges(int[][] arr, int r, int c) {
		// TODO Auto-generated method stub
		Queue<Pair> queue= new LinkedList<Pair>();
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(arr[i][j]==2)
						queue.add(new Pair(i,j));
				}
			}
			queue.add(new Pair(-1,-1));
		int count=0;
		while(queue.size()>1) {
			Pair tpair=queue.peek();
			// right
			if(tpair.rr==-1)
				{
				queue.add(queue.poll());
				count++;
				}
			
				
			else {	
			
			if(tpair.cc+1<c&&arr[tpair.rr][tpair.cc+1]==1) {
				arr[tpair.rr][tpair.cc+1]=2;
				queue.add(new Pair(tpair.rr,tpair.cc+1));
			}
			// left
			if(tpair.cc-1>=0&&arr[tpair.rr][tpair.cc-1]==1) {
				arr[tpair.rr][tpair.cc-1]=2;
				queue.add(new Pair(tpair.rr,tpair.cc-1));
			}
			//up
			if(tpair.rr-1>=0&&arr[tpair.rr-1][tpair.cc]==1) {
				arr[tpair.rr-1][tpair.cc]=2;
				queue.add(new Pair(tpair.rr-1,tpair.cc));
			}
			//down
			if(tpair.rr+1<r&&arr[tpair.rr+1][tpair.cc]==1) {
				arr[tpair.rr+1][tpair.cc]=2;
				queue.add(new Pair(tpair.rr+1,tpair.cc));
			}
			
			queue.poll();
			}
			
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(arr[i][j]==1)
					return -1;
			}
		}
		
		return count;
	}
	

}
