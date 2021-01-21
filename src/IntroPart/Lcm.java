package IntroPart;
import java.util.Scanner;
public class Lcm

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter two Number ");
		int n1=Sc.nextInt();
		int n2=Sc.nextInt();
		int lc=0;
		lc = (n1 > n2) ? n1 : n2;

		    // Always true
		    while(true) {
		      if( lc % n1 == 0 && lc % n2 == 0 ) {
		        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lc);
		        break;
		      }
		      ++lc;
		    }
		    Sc.close();
	}

}
