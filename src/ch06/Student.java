package ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		 this.studentNumber = studentNumber;
		 this.studentName = studentName;
	}
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은  "+ studentName + "이고, "+ grade+"학년입니다."; 
	}
}
