import java.util.Scanner; 
public class Number
{ 
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = (a>b&&a>c)?a:(b>c&&b>a)?b:c;
		System.out.println("Largest Among 3 is: "+res);
	}
}