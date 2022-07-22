package ch06_staticMember;

public class Calculator {
	// 정정 픽드 : static 키워드를 사용 -> 메서드 영역의 클래스 Calculator에 존재한다.
	// 클래스이름으로 접근할수 잇다.
	// 공통 데이터로 사용 -> 어디서든지 접근
	static double pi = 3.14159;
	// 인스턴스 필드
	int result;
	int value1;
	int value2;
	
	// 정적 메서드
	static int plus(int x, int y) {
		return x + y;
	}
}
