package sql;
import java.util.Scanner;
public class RollBackDriver {
	public static void main(String[] args) {
		
		RollBack r1 = new RollBack();
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("Enter the option");
			
			
			System.out.println("1.AddData");
			System.out.println("2.RemoveData");
			System.out.println("3.ShowData");
			System.out.println("4.RollBack");
			System.out.println("5.Exit");
			
			int opt = sc.nextInt();
			
			switch (opt) {
			case 1: {
				System.out.print("Enter the name to Add : ");
				String name = sc.next();
				r1.addData(name);
				break;
			}
			case 2:
			{
				System.out.print("Enter the name to Remove : ");
				String name = sc.next();
				r1.removeData(name);
				break;
			}
			case 3:
			{
				
				r1.showData();
				break;
			}
			case 4:
			{
				System.out.print("Enter the RollBack number : ");
				int rb = sc.nextInt();
				r1.rollBack(rb);
				break;
			}
			case 5:
			{
				sc.close();
				System.exit(10);
				System.out.println("Exit Successfull...");
			}
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
