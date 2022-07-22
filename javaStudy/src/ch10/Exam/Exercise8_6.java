package ch10.Exam;

public class Exercise8_6 {

	public static void main(String[] args) {	// 3-5
		try {
			method1();
		} catch (Exception e) {
			System.out.println(5);
		}
	}

	// NullPointerException이 발생
	// catch로 붙잡아야 하는데, 붙잡지 못함
	// finally가 실행됨 -> 예외는 유지된다. -> 예외를 던지는 효과를 가진다.
	// 인위적으로 throw 하는 것과 차이가 존재 -> 에러가 표시가 안난다.
	static void method1() {
		try {
			method2();
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3);
		}
		System.out.println(4);
	} // method1()

	static void method2() {
		throw new NullPointerException();
	}
}