package main;

import java.util.Scanner;

import Entity.Student;
import Repository.Student_Repository;
import helper.OutputHelper;

public class Test {
	public static void main(String[] args) {

		Student_Repository repository = new Student_Repository();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.next();

		OutputHelper helper = new OutputHelper();

		switch (name) {
		case "ram": {
			Student student =  repository.getRamObject();
			helper.printStudentDetails(student);
			break;
		}
		case "sham": {
			Student student = repository.getshamObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Ajay": {
			Student student = repository.getAjayObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Ashish": {
			Student student = repository.getAshishObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Ashok": {
			Student student = repository.getAshokObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Isha": {
			Student student = repository.getIshaObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Nath": {
			Student student = repository.getNathObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Om": {
			Student student = repository.getOmObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Pavan": {
			Student student = repository.getPavanObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Rohan": {
			Student student = repository.getRohanObject();
			helper.printStudentDetails(student);
			break;
		}
		case "Suraj": {
			Student student = repository.getSurajObject();
			helper.printStudentDetails(student);
			break;
		}
		default:
			System.out.println("please Enter the proper name :");

		}

//		Student ram = repository.getRamObject();

//		Student_Repository repo = new Student_Repository();
//		Student result = repo.FindByid(id);
//
//		if (result != null) {
//			result.display();
//		} else {
//			System.out.println("Student not found");
//		}
//
//		sc.close();

	}

}
