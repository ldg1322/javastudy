package ch06_staticMember;

public class Television {
	// 정적필드 -> 공통 데이터
	// static 멤버는 메서드 영역에 존재
	static String company = "Samsung";	//	초기화
	static String model = "LCD";		// LCD, OLED
	static String info;					// 초기화
	
	static {	// 정적 블럭 ('{','}' 중괄호로 둘러싼 부분 -> 초기화 할 떄 사용된다.
		// 클래스가 메서드 영역에 로딩이 될 때 위에서부터 아래로 순서적으로 실행이 된다.
		info = company + "-" + model;	// 초기화 : 위에 있는 static 필드를 이용하거나
			// 정적 메서드를 이용할 수 있다.
	
	}

}
