package ch10.Exam;

public class Exercise8_7 {
	static void method(boolean b) {
		// true : 1-종료
		try {
			System.out.println(1);
			if (b)
				System.exit(0);	// 프로그램을 종료
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		method(true);
		method(false);
	} // main

}
