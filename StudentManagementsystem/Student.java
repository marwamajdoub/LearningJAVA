
import java.util.Scanner;
public class Student {
	
	    private String firstname;
	    private String lastname;
	    private int gradeyear;
	    private String studentid;
	    private String courses;
	    private int balance;
	    private int costcourse=600;
	    private static int id =1000;//static means that when we create a new student this attribut will remain with the class
	    //This constructor will prompt user to enter student's name
	     public Student(){
	        Scanner in= new Scanner(System.in);
	        System.out.println("Enter student  first name: ");
	        this.firstname=in.nextLine();

	        System.out.println("Enter student last  name: ");
	        this.lastname=in.nextLine();

	        System.out.println("Enter student class level  : ");
	        this.gradeyear=in.nextInt();
	        setStudentID();

	        System.out.println(firstname+""+lastname+""+gradeyear+""+studentid);
	        
	       // the number of student will +

	     }
	      private void setStudentID(){
	        id ++;
	        this.studentid= this.gradeyear +" " +id;

	      }
	      public void enroll() {
	    	  do {
	    		  System.out.println("Enter courses to enroll or to quit (Q)");
		    	  Scanner in = new Scanner(System.in);
		    	  String course =in.nextLine();
		    	  if (!course.equals("Q")) {
		    		  courses=courses+"\n"+course;
		    		  balance=balance+costcourse;}
		    		  
		    	  else {
		    		  break;}
	    	  }while(1!=0);
	    	  System.out.println("enrolled in :"+courses);
    		  System.out.println("balance:"+balance);
    	  }
	    	 
	    public void Balance()	{
	    	System.out.println("Your Balance is:"+this.balance );
	    }
	     public void payment () {
	    	 System.out.println("Enter your payment");
	    	  Scanner in = new Scanner(System.in);
	    	  int pay=in.nextInt();
	    	 balance= balance-pay;
	    	 System.out.println("Thank you for your payment");
	    	 Balance();
	     }
	     public String toString() {
	    	 return("Name"+firstname+"" +lastname+"\nCourses enrolled"+courses+"" +balance);
	     }
	     
	     
	  
}
	      




	


