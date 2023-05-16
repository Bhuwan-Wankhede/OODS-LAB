package StudentPackage;

public class Student {
	int RollNo;
	String Name;
	int Class;
	public void setData(int roll,String name, int std){
		RollNo = roll;
		Name = name;
		Class = std;
	}
	public void Display() {
		System.out.println("\n\n----------- Student Data -----------\n");
		System.out.println("Student RollNo : "+RollNo);
		System.out.println("Student Name: "+Name);
		System.out.println("Student Class: "+Class+"th Semester");
	}
}
