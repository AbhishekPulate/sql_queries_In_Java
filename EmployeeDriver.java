package sql;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		EmployeeDB ref = new EmployeeDB("Scott","tiger");
		ref.connection("Scott", "tiger");
		
		

		
		
		ref.addData(new Employee("Abhi Kulkarni", "E101", "M201", "Manager", 1500.0, 0.0));
		ref.addData(new Employee("Riya Sharma", "E102", "M202", "Developer", 1200.0, 100.0));
		ref.addData(new Employee("Mohit Verma", "E103", "M203", "Tester", 1100.0, 50.0));
		ref.addData(new Employee("Sneha Kulkarni", "E104", "M204", "HR Executive", 1000.0, 0.0));
		ref.addData(new Employee("Aman Joshi", "E105", "M205", "Team Lead", 1600.0, 200.0));
		ref.addData(new Employee("Neha Desai", "E106", "M206", "UI/UX Designer", 1300.0, 150.0));
		ref.addData(new Employee("Karan Mehta", "E107", "M207", "System Analyst", 1400.0, 80.0));
		ref.addData(new Employee("Isha Patil", "E108", "M208", "Support Engineer", 950.0, 30.0));
		ref.addData(new Employee("Rahul Nair", "E109", "M209", "Backend Developer", 1250.0, 120.0));
		ref.addData(new Employee("Anjali Gupta", "E110", "M210", "QA Lead", 1450.0, 100.0));
		ref.addData(new Employee("Vikram Singh", "E111", "M211", "DevOps Engineer", 1350.0, 90.0));
		ref.addData(new Employee("Tanvi Rane", "E112", "M212", "Product Manager", 1700.0, 250.0));

		
		//System.out.println(e);
		
		ref.shodDB();
	}

}
