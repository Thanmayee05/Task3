package epamTask.task31;
import java.util.*;
public class calculator1 {
	public static void main(String[] args) 
	 {
		 int x, y, ans;
		 char c;
		 Scanner s=new Scanner(System.in);
		 
		 System.out.print("Enter Number 1 : ");
		 x=s.nextInt();
		 System.out.print("Enter Number 2 : ");
		 y=s.nextInt();
		 System.out.print("Choose operator from + - * / to perform: ");
		 c=s.next().charAt(0);
		 if(c == '+')
		 {
			 ans = x + y;
			 System.out.print("Result = " +ans);
		 }
		 else if(c == '+')
		 {
			 ans = x - y;
			 System.out.print("Result = " +ans); 
		 }
		 else if(c == '*')
		 {
			 ans = x * y;
			 System.out.print("Result = " +ans);
		 }
		 else if(c == '/')
		 {
			 ans = x / y;
			 System.out.println("Result = " +ans);
		 }
		 else 
		 {
			 System.out.println("Invalid Input");
		 }
	 }

}
