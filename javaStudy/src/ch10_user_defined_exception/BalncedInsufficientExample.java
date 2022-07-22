package ch10_user_defined_exception;

import ch10_exception_example.BalncedInsufficientException;

/*
 * 사용자 정의 예외 -> 필요에 따라서 예외처리 방법을 이용해서 사용자에게 알릴 수 있다.
 * 브라우저 - 서버간에도 사용할 수 있다.
 * 사용자 정의 예외 클래스를 만드는 방법 : Exception 또는 RuntimeException 클래스를 상속한다.
 * default 생성자와 예외 원인을 매개변수로 받는 생성자를 정의한다.
 */
public class BalncedInsufficientExample {

	public static void main(String[] args) throws BalncedInsufficientException{
		// 잔고 부족할 경우 예외를 발생시키는 예외 클래스를 사용
		int deposit = 20000;
		int money = 30000;
		if(money > deposit) {	// 잔고 부족
			// 예외를 발생시킨다 
			throw new BalncedInsufficientException("잔고부족");
		}

	}

}
