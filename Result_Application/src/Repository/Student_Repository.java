package Repository;

import Entity.Student;

public class Student_Repository {

	public Student getRamObject() {
		Student student = new Student();
		student.id = 101;
		student.fname = "ram";
		student.lname = "shinde";
		student.MathObtained = 91;
		student.ScienceObtained = 92;
		student.EnglishObtained = 90;
		return student;

	}

	public Student getshamObject() {
		Student student = new Student();
		student.id = 102;
		student.fname = "sham";
		student.lname = "patil";
		student.MathObtained = 81;
		student.ScienceObtained = 88;
		student.EnglishObtained = 91;
		return student;

	}

	public Student getOmObject() {
		Student student = new Student();
		student.id = 103;
		student.fname = "Om";
		student.lname = "shinde";
		student.MathObtained = 89;
		student.ScienceObtained = 90;
		student.EnglishObtained = 91;
		return student;

	}

	public Student getRohanObject() {
		Student student = new Student();
		student.id = 104;
		student.fname = "Rohan";
		student.lname = "wagh";
		student.MathObtained = 61;
		student.ScienceObtained = 64;
		student.EnglishObtained = 70;
		return student;
	}

	public Student getAshishObject() {
		Student student = new Student();
		student.id = 105;
		student.fname = "Ashish";
		student.lname = "rao";
		student.MathObtained = 77;
		student.ScienceObtained = 79;
		student.EnglishObtained = 84;
		return student;
	}

	public Student getAjayObject() {
		Student student = new Student();
		student.id = 106;
		student.fname = "Ajay";
		student.lname = "kasrale";
		student.MathObtained = 67;
		student.ScienceObtained = 69;
		student.EnglishObtained = 80;
		return student;
	}

	public Student getAshokObject() {
		Student student = new Student();
		student.id = 107;
		student.fname = "Ashok";
		student.lname = "udate";
		student.MathObtained = 73;
		student.ScienceObtained = 70;
		student.EnglishObtained = 81;
		return student;
	}

	public Student getIshaObject() {
		Student student = new Student();
		student.id = 108;
		student.fname = "Isha";
		student.lname = "Khan";
		student.MathObtained = 51;
		student.ScienceObtained = 54;
		student.EnglishObtained = 60;
		return student;
	}

	public Student getNathObject() {
		Student student = new Student();
		student.id = 109;
		student.fname = "Nath";
		student.lname = "paran";
		student.MathObtained = 96;
		student.ScienceObtained = 91;
		student.EnglishObtained = 94;
		return student;
	}

	public Student getSurajObject() {
		Student student = new Student();
		student.id = 110;
		student.fname = "Suraj";
		student.lname = "bhoinwad";
		student.MathObtained = 71;
		student.ScienceObtained = 89;
		student.EnglishObtained = 76;
		return student;
	}

	public Student getPavanObject() {
		Student student = new Student();
		student.id = 111;
		student.fname = "Pavan";
		student.lname = "Pawar";
		student.MathObtained = 91;
		student.ScienceObtained = 96;
		student.EnglishObtained = 99;
		return student;

	}
//	public Student findByName(String name)
//	{
//		Student s1= getRamObject();
//		Student s2= getshamObject();
//		Student s3= getOmObject();
//		
//		if (s1.fname.equalsIgnoreCase(name)) {
//	        return s1;
//	    } else if (s2.fname.equalsIgnoreCase(name)) {
//	        return s2;
//	    } else if (s3.fname.equalsIgnoreCase(name)) {
//	        return s3;
//	    } else {
//	       System.out.println("Student not found");
//	    }
//		return s3;
//	}

//	public Student FindByid(int id) {
//
//		Student s1 = getRamObject();
//		Student s2 = getshamObject();
//		Student s3 = getOmObject();
//		Student s4 = getAjayObject();
//		Student s5 = getAshishObject();
//		Student s6 = getAshokObject();
//		Student s7 = getIshaObject();
//		Student s8 = getNathObject();
//		Student s9 = getPavanObject();
//		Student s10 = getRohanObject();
//		Student s11 = getSurajObject();
//
//		if (s1.id == id) {
//			return s1;
//		} else if (s2.id == id) {
//			return s2;
//		} else if (s3.id == id) {
//			return s3;
//		} else if (s4.id == id) {
//			return s4;
//		} else if (s5.id == id) {
//			return s5;
//		} else if (s6.id == id) {
//			return s6;
//		} else if (s7.id == id) {
//			return s7;
//		} else if (s8.id == id) {
//			return s8;
//		} else if (s9.id == id) {
//			return s9;
//		} else if (s10.id == id) {
//			return s10;
//		} else if (s11.id == id) {
//			return s11;
//		} else {
//			System.out.println("Student not found");
//		}
//		return null;
//	}

}
