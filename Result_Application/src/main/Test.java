package main;

import java.util.Scanner;

import Entity.Student;
import Repository.Student_Repository;

public class Test {
	public static void main(String[] args) {

//		Student_Repository repository = new Student_Repository();
//		Student ram = repository.getRamObject();
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter id: ");
	        int id = sc.nextInt();

	        Student_Repository repo = new Student_Repository();
	        Student result = repo.FindByid(id);

	        if (result != null) {
	            result.display();
	        } else {
	            System.out.println("Student not found");
	        }

	        sc.close();
		

	}

}
