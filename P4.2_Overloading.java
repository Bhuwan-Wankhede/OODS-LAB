class Over
{
	int test(int num) {
		return (num*num);
	}
	double test(double num) {
		return (num*num*num);
	}
}
public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over ov = new Over();
		System.out.println("Square of Number: "+(ov.test(4)));
		System.out.println("Cube of Number: "+(ov.test(4.8823)));
	}

}
