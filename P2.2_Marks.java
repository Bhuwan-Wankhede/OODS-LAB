import java.util.Scanner; 
public class Marks
{ 
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
	if(marks>75){
System.out.println("A+");
}
else if(marks>60 && marks<75){
System.out.println("A");
}
else if(marks>50 && marks<60){
System.out.println("B");
}
else if(marks>40 && marks<50){
System.out.println("C");
}
else if(marks<40){
System.out.println("D");
}
else{
System.out.println("Error");
}

}
}