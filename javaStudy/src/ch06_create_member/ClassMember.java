package ch06_create_member;

public class ClassMember {		// 클래스
	// 구성 멤버 : 4가지 (상수, 필드, 메서드, 생성자)
	// 상수 : 정해진 수 -> 일정한 수 ex) 차에서 최대 속도, 연료량
	public static final int MAX_SPEED = 300;	// 300km
	public static final int MAX_GAS = 100;		// 100L
	
	// 필드  : 상태 정보, 특성, 부품(구성품) -> 관심있는 대상 (정보)
	// 문제를 풀기 위해서 필요한 정보
	int speed;
	String model;
	Engine engine;	// 구성품
	Handle handle;
	String color;
	
	// 생성자 -> 객체를 생성할 때 필드 값을 초기화 -> 어떤 필드를 초기화할 것인가에 따라 여러개가 존재
	public ClassMember() { // 초기화하는 필드가 없음 ( 매개변수로 초기화를 위한 필드를 안받음)
		speed = 20;	// 보통은 초기화 하지 않음. 그러나 필요하면 초기화
	}
	// 생성자
	public ClassMember(int s) {	// 매개변수로 받은 s로 필드 speed를 초기화
		speed = s;
	}
	
	// 생성자 : speed와 color를 생성 시 초기화를 하고 싶다.
	public ClassMember(int s, String c) {	// 매개변수로 받은 값으로 필드를 초기화
		speed = s;
		color = c;
	}
	
	// 메서드 : 객체의 동작, 행위 -> 필드를 조작 
	public void setSpeed(int s) {
		speed = s;
		System.out.println("현재 속도 : " + speed);
	}
	
	public int getSpeed() {			// 필드 정보를 반환 (현재 속도를 얻기 ㅜ이하여 사용하는 메서드)
		return speed;
	}
	
}

class Engine {
	
}
class Handle {
	
}
