package A2;
import java.util.Scanner;

class Date{
	int day, month, year;
	
	public Date () {
		this.day = 11;
		this.month = 9;
		this.year = 2001;
	}
	
	public Date (String date){
		Scanner Sc = new Scanner(System.in);
		
		String day = String.format("%s%s", date.charAt(0), date.charAt(1));
		int finalDay = Integer.parseInt(day);
		
		String month = String.format("%s%s", date.charAt(3), date.charAt(4));
		int finalMonth = Integer.parseInt(month);
		
		String year = String.format("%s%s%s%s", date.charAt(6), date.charAt(7), date.charAt(8), date.charAt(9));
		int finalYear = Integer.parseInt(year);
		
		
		if (finalDay < 1 && finalDay > 31){
			System.out.println("Invalid day entered..");
			return;
		}
		if (finalMonth < 1 && finalMonth > 12){
			System.out.println("Invalid month entered..");
			return;
		}
		if (finalYear < 1970 && finalYear > 3000) {
			System.out.println("Invalid year entered..");
			return;
		}
		this.day = finalDay;
		this.month = finalMonth;
		this.year = finalYear;
	}
}

class Employee{
	int employeeNumber;
	String employeeName;
	Date joiningDate;
	
	public Employee (int employeeNumber, String employeeName, Date joiningDate){
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.joiningDate = joiningDate;
	}
	
	void getDetails (){
		System.out.println(this.employeeNumber);
		System.out.println(this.employeeName);
		System.out.println(this.joiningDate.day+"/"+this.joiningDate.month+"/"+this.joiningDate.year);		
	}
}

public class Question5 {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		for (int i=0; i<2; i++) {
			System.out.print("Enter employee number: ");
			int employeeNumber = Sc.nextInt();
			System.out.print("Enter employee name: ");
			String employeeName = Sc.next();
			System.out.print("Enter joining date (Separated by '-'): ");
			String d = Sc.next();
			if (d.length() > 0) {
				Date newDate = new Date(d);
				Employee newEmployee = new Employee(employeeNumber, employeeName, newDate);
				newEmployee.getDetails();

			}
			else {
				Date newDate = new Date();
				Employee newEmployee = new Employee(employeeNumber, employeeName, newDate);
				newEmployee.getDetails();
			}
		}
	}
}