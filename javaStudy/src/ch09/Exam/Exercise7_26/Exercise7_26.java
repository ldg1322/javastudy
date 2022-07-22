package ch09.Exam.Exercise7_26;

public class Exercise7_26 {

	public static void main(String[] args) {
		/*
		 * 알맞은 코드를 입력.
		 */
		Outer.Inner oi = new Outer.Inner();	// Inner 객체 생성
		System.out.println(oi.iv);
	}
}

class Outer {
	// 정적 멤버 클래스 -> Outer 객체 없이 존재할 수 있음
	static class Inner {
		// 인스턴스 필드 -> Inner 객체가 생성 되어야 존재
		int iv = 200;
	}
}