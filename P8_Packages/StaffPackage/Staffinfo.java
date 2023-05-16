package StaffPackage;

public class Staffinfo {
	int ID;
	String Name;
	String Department;
	public void setData(int id,String name,String Dep){
		ID = id;
		Name = name;
		Department = Dep;
	}
	public void Display() {
		System.out.println("----------- Staff Data -----------\n-");
		System.out.println("Staff Member ID: "+ID);
		System.out.println("Staff Member Name: "+Name);
		System.out.println("Staff Member Department: "+Department);
		
	}
}
