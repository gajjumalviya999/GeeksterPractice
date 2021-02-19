package QUEUE;

public class Queueimp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			DynamicQueue Q=new DynamicQueue(3);
			
			Q.enqueue(1);
			Q.enqueue(2);
			Q.enqueue(3);
			Q.enqueue(4);
			Q.dequeue();
			System.out.println("front "+Q.getfront()+" rear "+Q.getrear());
			Q.display();
			
	}

}
