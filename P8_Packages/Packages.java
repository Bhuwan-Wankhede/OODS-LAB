import StaffPackage.*;
import StudentPackage.*;

public class Packages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staffinfo st = new Staffinfo();
		Student sd = new Student();
		st.setData(101,"Dhiraj Farad","Non-teaching");
		sd.setData(28,"Bhuwan Wankhede",6);
		st.Display();
		sd.Display();
	}

}
