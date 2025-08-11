package LabSessions_24_07;

abstract class Student{
	public String name;
	public int rollno;
	Student(String name, int roll){
		this.name = name;
		this.rollno = roll;
	}
	abstract void getGrade(int marks);
}

class EngineeringStudent extends Student{
	EngineeringStudent(String name, int roll) {
		super(name, roll);
		System.out.println("Engineering Student Entered");
	}
	@Override
	void getGrade(int marks) {
		char grade;
		if(marks>90) grade='A';
		else if(marks>75) grade='B';
		else if(marks>55) grade='C';
		else if(marks>40) grade='D';
		else grade='F';
		System.out.println("Your grade is :"+grade);
	}	
}

class MedicalStudent extends Student{
	MedicalStudent(String name, int roll) {
		super(name, roll);
		System.out.println("Medical Student Entered");
	}
	@Override
	void getGrade(int marks) {
		char grade;
		if(marks>=90) grade='A';
		else if(marks>=75) grade='B';
		else if(marks>=55) grade='C';
		else if(marks>=40) grade='D';
		else grade='F';
		System.out.println("Your grade is :"+grade);
	}	
}

public class StudentSubclasses {

	public static void main(String[] args) {
		EngineeringStudent obj1 = new EngineeringStudent("Mayank", 21);
		obj1.getGrade(98);
		MedicalStudent obj2 = new MedicalStudent("Rahul", 24);
		obj2.getGrade(81);
	}

}