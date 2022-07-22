package ch10_exception_example;

import java.text.FieldPosition;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (	// 자원을 얻는 부분을 프로그램 한다. -> finally가 작성할 필요 없다.
				FileInputStream fis = new FileInputStream("file.txt");
				)
		{	// 예외가 발생할 수 있는 코드를 작성
			fis.read();
			throw new Exception();	// 예외를 강제로 발생 시킴
		} catch(Exception e) {	// 예외처리
			// 예외가 발생되면 자동으로 closable() 메서드가 실행이 됨 
			// closable() 메서드가 실행이 되었음 -> 자원 반납
			System.out.println("예외처리 코드가 실행 되었습니다.");
		}
	}

}
