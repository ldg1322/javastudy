package ch10_exception_example;

/*
 * 에외 : 사용자의 오동작이나 프로그래머의 오류로 발생되는 예외
 * 모든 예외는 Exception 클래스를 상속한다. 
 * 일반 예외 : 컴파일러가 컴파일 시 알려준다. 문법적인 에러 -> 에러 원인을 해결해주면 된다.
 * ClassNotFoundException, interruptedException
 * 실행 예외 : 문법적인 오류가 없고, 구문(Semantic) 에러 -> 프로그램이 실행 시 발생되는 예외
 * RuntimeExcepiton 클래스를 상속한다.
 * NullPointerException, NumberFormatException, ArrayIndexOutOfBoundException
 */
public class ExceptionExample {

	public static void main(String[] args) {
		String data = null;	// 아무것도 참조하는 것이 없다.
		System.out.println(data.toString()); 	// toString() : 문자열 정보를 출력 
		// NullPointerException이 발생 -> default로 스택에 저장된 내용을 출력
		// 예외가 발생되면 스택의 내용을 출력 한다.
		// 여러분이 프로그램  클래스가 어디에 있는지를 찾는다. -> 모든 예외의 원인은 나다(내가 짠 프로그램).
		// 예외의 원인을 출력해준다. -> 그것을 잘 이해를 하고 에러 원인이 무엇인지를 분석/조치를 한다.
		
	}

}
