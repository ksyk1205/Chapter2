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
		
		return studentName + "�л��� �й���  "+ studentName + "�̰�, "+ grade+"�г��Դϴ�."; 
	}
}
