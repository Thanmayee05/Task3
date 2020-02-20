package epamTask.dryPrinciple;

public class dryPrinciple 
{
	public void practical(){
	    System.out.println("Welcome to practical session");
	    performTasks();
	    }
	    
	    public void theory(){
	     System.out.println("Welcome to theory session");
	      performTasks();
	    }
	    public void performTasks(){
	        System.out.println("Lecturer delivering a lesson");
	        System.out.println("Marking attendance");
	        System.out.println("Students taking down their notes");
	    }
	    }
	    class dryMain{
	          public static void main(String args[]){
	           dryPrinciple d=new dryPrinciple();
	           d.practical();
	           d.theory();
	           }

}
