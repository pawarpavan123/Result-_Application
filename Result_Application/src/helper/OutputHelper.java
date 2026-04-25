package helper;

import Entity.Student;

public class OutputHelper {
	
	public void printStudentDetails(Student student) {
		System.out.println("id : "+student.id);
		System.out.println("fname : "+student.fname);
		System.out.println("lname : "+student.lname);
		System.out.println("MathObtained : "+student.MathObtained);
		System.out.println("scienceObtained : "+student.ScienceObtained);
		System.out.println("englishObtained : "+student.EnglishObtained);
		
	}

}
