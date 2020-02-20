package epamTask.task35;

public class yagni 
{
	public void labclass() 
	{

		System.out.println("lab class going on now");
		performOtherTasks();
		}
		public void performOtherTasks() 
		{

			System.out.println("Attendence is taken");
			System.out.println("Learning is done");
			System.out.println("teaching is done");
		}

} 

class Mainyagni12
{
	public static void main(String[] args) 
	{
		yagni obj=new yagni();
		obj.labclass();
	}
}
