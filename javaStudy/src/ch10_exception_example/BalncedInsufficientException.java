package ch10_exception_example;

// 사용자 정의 예외 클래스
public class BalncedInsufficientException extends Exception {
	// default 생성자
	public BalncedInsufficientException() {}
	public BalncedInsufficientException(String message) {	// message : 에러의 원인
		super(message);	// 부모인 Exception 클래스에게 전달
	}
}
