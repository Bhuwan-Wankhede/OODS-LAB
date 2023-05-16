import java.util.Scanner;

interface Series{
	void start(int s, int len);
	void next();
	void reset();
}
class Oddseries implements Series{
	int start;
	int size;
	public void start(int s, int len){
		start = s;
		size = len;
	}
	public void next(){
		int total = size;
		int i = start;
		int cnt = 0;
		while(cnt != total) {
			if(i%2 != 0 ) {
				System.out.println(i);
				cnt++;
			}
			i++;
		}
	}
	public void reset() {
		start = 0;
		size = 0;
	}
}
public class SeriesOdd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Starting Number:");
		int start = sc.nextInt();
		System.out.println("Enter Size:");
		int total = sc.nextInt();
		System.out.println("The Odd Series of "+total+" Numbers Starting from "+start+ " are");
		Oddseries od = new Oddseries();
		od.start(start,total);
		od.next();
		od.reset();
//		System.out.println("Start :"+start+"total:"+total);
	}

}
