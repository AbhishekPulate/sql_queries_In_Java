package sql;

public class Employee {
	
	String name;
	String empId;
	String mgrId;
	String job;
	double salary;
	double comm;
	
	Employee(){}
	
	Employee(String name,String empID,String mgrId,String job,double salary,double comm)
	{
		this.name= name;
		this.empId= empID;
		this.mgrId= mgrId;
		this.job= job;
		this.salary= salary;
		this.comm= comm;
	}
	
	public String toString()
	{
		return "NAME :"+name+", EMPID :"+empId+", MGRID :"+mgrId+", JOB :"+job+", SALARY :"+salary+", COMMISION :"+comm;
	}
	
}
