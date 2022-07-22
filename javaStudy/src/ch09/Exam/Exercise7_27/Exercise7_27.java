package ch09.Exam.Exercise7_27;

public class Exercise7_27 {

	public static void main(String[] args) {
		/*
		 * (4) . 알맞은 코드를 넣어 완성하시오
		 */
		// Outer 객체 생성
		Outer outer = new Outer();
		// Inner 객체 생성
		Outer.Inner inner = outer.new Inner(); 
		inner.method1();

	}

}

class Outer {
	int value = 10;

	// 인스턴스 멤버 클래스 -> Outer 객체가 생성이 되야함
	class Inner {
		int value = 20;

		// 인스턴스 메서드 -> Inner 클래스가 있어야 함
		void method1() {
			int value = 30;
			System.out.println(value);	// 30
			System.out.println(this.value);	// 20 (this : Inner)
			System.out.println(Outer.this.value);	// 10
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

