package ch18.assist_stream;

import java.io.Serializable;

public class ClassC implements Serializable {
	// 명시적으로 클래스의 serialVersionUID를 기술
//	private static final long serialVersionUID = -2138726466068655971L;
	// 명시적으로 serialVersionUID를 기술하지 않으면 컴파일러가 자동으로 발생시킨다.
	// 다시 컴파일을 하면 다른 값으로 변경된다 -> 다른 버전의 클래스가 된다.
	int field1;
	int field2;	// 하나의 필드를 더 추가 -> 클래스의 내용이 변경됨 -> 다른 버전이 된다.
	
}
