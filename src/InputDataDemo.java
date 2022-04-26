
import java.util.Scanner;

public class InputDataDemo {

	public static void main(String[] args) {


		int studentId;
		String studentName,course;
		double fees;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter student Id :");
		studentId=sc.nextInt();
		
		System.out.print("Enter student name :");
		studentName=sc.next();
		
		System.out.print("Enter Course :");
		course=sc.next();
		
		System.out.print("Enter course Fees :");
		fees=sc.nextDouble();
		
		
		System.out.println("Student Details are ");
		System.out.println("======================");
		
System.out.println("Student Id :"+studentId+"\nStudent Name :"+studentName+"\nCourse :"+course+"\nFees :"+fees);
		
		
	}

}
