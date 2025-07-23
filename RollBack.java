package sql;

import java.util.Arrays;

public class RollBack {
	
	String[] db = {"Allen","King","Abhi","Yash","Deep"};
	String[][] savePoint = new String[10][];
	int savePointIndex = 0;
	
	public void addData(String name)
	{
		for(int i = 0;i<db.length;i++)
		{
			if(db[i].equalsIgnoreCase(name))
			{
				System.out.println(name+" Name already exists.");
				return;
			}
		}
		
		String[] temp = new String[db.length+1];
		
		for(int i = 0;i<db.length;i++)
		{
			temp[i] = db[i];
		}
		temp[db.length]=name;
		
		savePoint[savePointIndex] = db;
		savePointIndex++;
		
		db = temp;
		System.out.println(name+" Added Succesfully.....");
	}
	public void removeData(String name)
	{
		
		String[] temp = new String[db.length-1];
		int index = -1;
		boolean flg = false;
		for(int i = 0;i<db.length;i++)
		{
			if(db[i].equalsIgnoreCase(name))
			{
				index = i;
				flg = true;
				break;
			}
		}
		if(!flg)
		{
			System.out.println(name+" Does not exist in Database....");
		}
		for(int i = 0;i<index;i++)
		{
			temp[i] = db[i];
		}
		for(int i = index;i<db.length-1;i++)
		{
			temp[i]=db[i+1];
		}
		savePoint[savePointIndex] = db;
		savePointIndex++;
		db = temp;
		System.out.println(name+" Removed Succesfully.....");
		
	}
	public void showData()
	{
	
		for(int i = 0;i<db.length;i++)
		{
			System.out.print(db[i]+",");
		}
		System.out.println();
	}
	
	public void rollBack(int rb)
	{
		if(savePointIndex==0)
		{
			System.out.println("Nothing to roll back to.");
			
		}
		int index = savePointIndex - rb;
		if(index>0)
		{
			db = savePoint[index];
			System.out.println("Rollback Successfull.....");
		}
	}
	
	public void commitChanges()
	{
		Arrays.fill(savePoint, null);
		savePointIndex = 0;
	}

}
