package ch07.inherit_introduction;

public class SuperSonicAirPlane extends AirPlane{
	// 상수 : 비행모드 2가지를 상수로 정의 -> 약속
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 필드
	public int flyMode = NORMAL;	// 초기치 : 일반비행모드
	
	// 부모의 메서드를 재정의할 때 : 부모의 메서드를 
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {	// 자식이 재정의함
			System.out.println("초음속 비행을 합니다.");
		} else {
			super.fly();	// 부모가 정의한 메서드를 호출
		}
		
	}
}
