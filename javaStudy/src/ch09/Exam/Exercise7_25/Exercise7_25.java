package ch09.Exam.Exercise7_25;

public class Exercise7_25 {

	public static void main(String[] args) {
		/*
		 * 알맞은 코드를 입력.
		 */
		Outer outer = new Outer();			// Outer 클래스를 생성
		Outer.Inner oi = outer.new Inner();	// Inner 클래스를 생성
		System.out.println(oi.iv);
	}
}

class Outer {
	// 인스턴스 멤버 클래스 : Outer 객체가 생성되어야만 존재 -> Outer 객체를 생성해야 함
	class Inner {
		// 인스턴스 멤버 필드 -> Inner 객체가 생성되어야만 존재
		int iv = 100;
	}
}