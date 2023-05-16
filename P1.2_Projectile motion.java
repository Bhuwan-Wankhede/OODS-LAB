import java.util.Scanner; 
public class Motion
{
	public static void main(String args[])
         {
	  Scanner sc = new Scanner(System.in);
                
		System.out.println("Enter Intial VELOCITY: ");
		int u = sc.nextInt();
		System.out.println("Enter Acceleration: ");
		int a = sc.nextInt();
                System.out.println("Enter time: ");
		int t = sc.nextInt();
		double res = u*t+(0.5)*a*(t*t);
                System.out.println("Displacement : "+res);
			
         }
}