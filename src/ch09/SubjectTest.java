package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 99);
		
		Student studentKim = new Student(100, "Lee");
		studentKim.setKoreaSubject("����", 50);
		studentKim.setMathSubject("����", 65);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
