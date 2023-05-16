import java.util.Scanner;

class Train {

	int trainNumber,capacity;
	String journeyDate;
	String trainName,source,destination;
	
	Scanner sc = new Scanner(System.in);
	
	void initializeVar() {
	    trainNumber=0;
	    capacity=0;
	    journeyDate=null;
		trainName=null;
		source=null;
		destination=null;
	}
	void inputTrainData() {
		
		System.out.println("Enter Train Number: ");
		trainNumber = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Train Name: ");
		trainName = sc.nextLine();
		
		System.out.println("Enter Source: ");
	    source = sc.nextLine();
	    
		System.out.println("Enter Destination: ");
	    destination = sc.nextLine();
		
		System.out.println("Enter Date: ");
		journeyDate= sc.nextLine();
		
		System.out.println("Enter Capacity: ");
		capacity = Integer.parseInt(sc.nextLine());
		
	}
	void displayData() {
		System.out.println("----------- Train Details -----------"+"\n");
		System.out.println("Train Number: "+trainNumber+"\n");
		System.out.println("Train Name: "+trainName+"\n");
		System.out.println("Source: "+source+"\n");
		System.out.println("Destination: "+destination+"\n");
		System.out.println("Date: "+journeyDate+"\n");
		System.out.println("Capacity: "+capacity);
	}
	
}
class Traindemo{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train  tr = new Train();
		tr.initializeVar();
		tr.inputTrainData();
		tr.displayData();
	}

}
