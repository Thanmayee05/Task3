package epamTask.task32;
import java.util.*;

public class kissPrinciple {

	public void dayMonth(int month) {
		if ((month < 1) || (month > 12)) 
			System.out.println("Enter months in range");
		else 
		{
			String[] months = {
			"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","November","Dec"
		};
		System.out.println(months[month-1]);
		}
		
	}
}
class kissmain{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		kissPrinciple obj=new kissPrinciple();
		System.out.print("Enter Number of month: ");
		int x=s.nextInt();
		obj.dayMonth(x);
		
	}
}
