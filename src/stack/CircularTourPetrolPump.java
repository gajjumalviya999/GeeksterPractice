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
		petrolpump arr[]= { new petrolpump(6,4),new petrolpump(3,6), new petrolpump(7,3)};
		CircularTourPetrolPump cp= new CircularTourPetrolPump();
		System.out.println(cp.firstpoint(arr));
	}

	private int firstpoint(petrolpump[] arr) {
		// TODO Auto-generated method stub
		int f=0;
		int c=0;
		int balance=0;
		int r=arr.length-1;
		while(r!=c) {
			balance=arr[c].fuel-arr[c].distance;
			if(balance<0) {
				f=c;
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
