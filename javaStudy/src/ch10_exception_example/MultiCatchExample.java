package ch10_exception_example;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1]; // ArrayIndexOutOfBoundsException 발생가능

			int value1 = Integer.parseInt(data1); // NumberFormatException이 발생 가능
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// 친절하게 출력
			// 두 개 중에 어느 예외가 발생했는지 알수 없음
			// 공통된 예외 처리를 한다. -> 바람직하지 않고 하나씩 예외처리를 하는 것이 좋다.
			System.out.println("실행 매개값의 수가 부족합니다 숫자로 변환할 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("알수 없는 예외 발생.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
