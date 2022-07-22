package ch10_exception_example;

// 예외처리 순서 : 범위가 작은 것으로 먼저 catch를 하고
// 그 다음에 더 넓은 범위의 예외를 catch하는 것을 사용
// Exception : 모든 얘외를 다 붙잡을 수 있다.
// RuntimeException : 모든 실행 예외를 붙잡을 수 있다.
// ArrayIndexOutOfBoundsException : 특정한 유형의 예외를 잡는다.
public class CatchOrderExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1]; // ArrayIndexOutOfBoundsException 발생가능

			int value1 = Integer.parseInt(data1); // NumberFormatException이 발생 가능
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NullPointerException e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
