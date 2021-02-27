package stack;
class petrolpump{
	int fuel;
	int distance;
	petrolpump(int f,int d){
		this.fuel=f;
		this.distance=d;
	}
}
public class CircularTourPetrolPump {
	public static void main(String[] args) {
		petrolpump arr[]= { new petrolpump(4,6),new petrolpump(6,5), new petrolpump(7,3), new petrolpump(4,5)};
		CircularTourPetrolPump cp= new CircularTourPetrolPump();
		System.out.println(cp.firstpoint(arr));
	}

	private int firstpoint(petrolpump[] arr) {
		// TODO Auto-generated method stub
		int f=0;
		int c=0;
		int balance=0;
		int r=arr.length-1;
		
		while(c!=r) {
			
			balance=arr[c].fuel-arr[c].distance;
			if(balance<0) {
				f=c+1;
				if(f==0)
					r=arr.length-1;
				else
					r=f-1;
			}
			else {
				c++;
				if(c==arr.length)
					c=0;
		}
		}
		
		return f;
		
	}
}
