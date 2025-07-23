package sql;

public class EmployeeDB extends Employee {
	
	
	String user;
	String pass;
	
	boolean connected;
	Employee[]  db = new Employee[10] ;
	
	public EmployeeDB() {
		// TODO Auto-generated constructor stub
	}
	
	EmployeeDB(String user,String pass)
	{
		super();
		this.user= user;
		this.pass= pass;
		System.out.println("Database Created");
	}
	public void connection(String user,String pass)
	{
		if (this.user.equals(user)&&this.pass.equals(pass)) 
		{	
			connected = true;
			System.out.println("DB Connected");
		}
		else
		{
			connected = false;
			System.out.println("Invalid Credentials");
		}
	}
	
	int cnt = (int) (.75* db.length);
	int index = 0;
	public void addData(Employee e)
	{
		if(connected)
		{
			
			if(index<cnt)
			{
				
				
					db[index]=e;
					System.out.println("Added to Database.");
					
					index++;
				
			}
			else
			{
				
				Employee[] db1 = new Employee[db.length*2];
				for(int j = 0;j<index;j++)
				{
					db1[j]=db[j];
				}
				db=db1;
				db[index]=e;
				cnt = (int) (.75*db.length);
				index++;
				
			}
		}
		else
		{
			System.out.println("Not Connected to DB");
		}
		
	}
	
	public void shodDB()
	{
		for(int i = 0;i<index;i++)
		{
			System.out.println(db[i]);
		}
	}
	

}
