
class Staff{
	int code;
	String Name;
	void setDetails(String name,int c){
		code = c;
		Name = name;
	}
}
class Teacher extends Staff{
	String subject;
	String publications;
	void setInfo(String sub, String pub){
		subject = sub;
		publications = pub;
	}
	void ShowDetails() {
		System.out.println("About Teacher: \n");
		System.out.println("Name \t\t Code \t\t  Subject \t\t Publications \n" );
		System.out.println(Name+"\t\t"+code+"\t\t"+subject+"\t"+publications);
	}
}
class Officer extends Staff{
	String grade;
	void setGrade(String G) {
		grade = G;
	}
	void ShowDetail() {
		System.out.println("\n\nAbout OFFICE: \n");
		System.out.println("Name \t\t Code \t\t Grade \n" );
		System.out.println(Name+"\t\t"+code+"\t\t"+grade);
	}
}
class Typist extends Staff{
	double speed;
	void setspeed(double s) {
		speed = s;
	}
}
class Regular extends Typist{
	void showInfo() {
	System.out.println("\n\nAbout Regular Typist: \n");
	System.out.println("Name \t\t Code \t\t Speed \n" );
	System.out.println(Name+"\t"+code+"\t\t"+speed);
	}
}
class Adhoc extends Typist{
	int wages;
	void setWages(int wage) {
		wages = wage;
	}
	void showInformation() {
		System.out.println("\n\nAbout Adhoc Typist: \n");
		System.out.println("Name \t\t Code \t\t Speed \t\t Wages\n");
		System.out.println(Name+"\t\t"+code+"\t\t"+speed+"\t"+wages);
	}
}
public class Inheritance1 {

	public static void main(String[] args)
	{
		Teacher t = new Teacher();
		t.setDetails("XYZZZ",10001);
		t.setInfo("Java Programming","MCGrawHill");
		t.ShowDetails();
		
		Officer o = new Officer();
		o.setGrade("A++");
		o.setDetails("ABCCC",12200);
		o.ShowDetail();
		
		Regular r = new Regular();
		r.setDetails("PQRRR",13302);
		r.setspeed(89.22);
		r.showInfo();
		
		Adhoc a = new Adhoc();
		a.setWages(100000);
		a.setDetails("MNOOO",13302);
		a.setspeed(92.002822);
		a.showInformation();
		
	}
	
}
