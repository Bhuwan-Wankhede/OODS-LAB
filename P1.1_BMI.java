import java.util.Scanner; 
public class Bmi{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Weight in KGs:");
float weight = sc.nextFloat();
System.out.println("Enter height in CM:");
float height = sc.nextFloat();
float BMI = weight * (100)*(100)/(height*height);
System.out.println("Your BMI is: "+BMI);
}
}