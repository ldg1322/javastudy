package ch07.inherit_introduction;

public class StudentEx {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "111111-222222", 1);
		System.out.println("이름 : " + student.name);
		System.out.println("주민등록 번호 :" + student.ssn);
		System.out.println("학번 : " + student.studentNo);
	}

}
