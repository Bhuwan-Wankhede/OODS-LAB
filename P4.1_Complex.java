
class Arith {
	int real1,real2,img1,img2;
	Arith(int r1,int r2, int i1, int i2){
		real1 =  r1;
		real2 = r2;
		img1 = i1;
		img2 = i2;
	}
	void sum() {
		int real = real1+real2;
		int img = img1+img2;
		System.out.println("Two Complex Numbers");
		System.out.println(real1+" + j"+img1);
		System.out.println(real2+" + j"+img2);
		System.out.println("Complex Numbers Sum: "+real+" + j("+img+")");
	}
	void sub() {
		int real = real1 - real2;
		int img = img1 - img2;
		System.out.println("Complex Numbers Subtraction: "+real+" + j("+img+")");
	}
}
public class Arithematic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arith ar = new Arith(10,19,7,5);
		ar.sum();
		ar.sub();
	}
}
