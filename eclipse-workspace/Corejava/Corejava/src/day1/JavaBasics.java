package day1;

import day2and3.PackageExample;

//import java.lang.*;
//Store and retrive the data
class Students{  //To store student data - class - blue print - which doesn't work physically
	// References - Variables/fields/members/attributes
	//Primitive data/raw data - 8 data types - Boolean, int, String, float, char ...
	//Data type has default value and default size
	int studentId;      //Primitive Data type
	String studentName; //NonPrimitive Data type
	static String consultencyName = "Magnus"; //static variable
	
	public Students(int studentId, String studentName) {
		// TODO Auto-generated constructor stub
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	//operation - print
	//methods used to perform the operation
	void displayStudentDetails() {  //method start
		System.out.println("StudentId::::"+studentId);
		System.out.println("StudentName::::"+studentName);
		System.out.println("StudentConsultency::::"+consultencyName);
	}
}
public class JavaBasics {   //main class

	public static void main(String[] args) {   //starting point
		// Instance - object allocate the memory
		// 1. Declaration   - Students s1
		// 2. Instantiation
		// 3. Inilization  - contractor
		Students s1 = new Students(1, "Deepa");  //Implecit
		s1.displayStudentDetails();  //explicit
		Students s2 = new Students(2, "Vedha");  //Implecit
		s2.displayStudentDetails();  //explicit
		
		//s3 shows value  and default constracture
	//	Students s3 = new Students();  //Default constractor, default value
	//	s3.displayStudentDetails();  //explicit
		PackageExample obj = new PackageExample();
		obj.m1();

	}

}
