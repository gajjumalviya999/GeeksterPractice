package GeekstersAdvance;
import java.util.Scanner;
public class Hcf

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter two Number ");
		int n1=Sc.nextInt();
		int n2=Sc.nextInt();
		int Hc=1;
		for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
              Hc = i;
        }

        System.out.printf("G.C.D of %d and %d is %d", n1, n2, Hc);
Sc.close();

	}

}
