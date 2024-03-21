
import java.util.Scanner;
public class StudentDataBase {
	public static void main (String[] args){
        Student student1 =new Student();
        student1.enroll();
        student1.payment();
        System.out.println(student1.toString());
    
	//ask how many student we want to add 
	System.out.println("Enter the number of students to enroll:");
	Scanner in=new Scanner(System.in);
	int numofStudents=in.nextInt();
	Student[]students=new Student[numofStudents];
	for (int n=0; n<numofStudents;n++) {
		Student stu=new Student();
		stu.enroll();
		stu.payment();
		System.out.println(stu.toString());
		
		
	}
	
}

}
