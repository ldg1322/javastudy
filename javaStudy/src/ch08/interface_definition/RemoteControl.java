package ch08.interface_definition;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;	// static final 생략됨 -> 변수가 아니다.
		// 이름은 상수이므로 대문자로 작성
	public int MIN_VOLOME = 0;
	
	// 추상 메서드 : abstract 키워드를 생략 -> 선언부가 있음. 실행부가 없다.
	// 구현 객체가 재정의하여 구체화
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	// default 메서드 : 기본 동작, default 키워드를 사용함, 인터페이스 확장할 때 사용한다.
	// 접근 제한자는 public
	default void setMute(boolean mute) {	// 수행 부분이 있다. -> 구현 객체가 재정의 하지 않아도 된다.
		if(mute) {
			System.out.println("무음 처리 합니다.");
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	// 정적 메서드 ( static 키워드 )
	// 인터페이스 이름으로 접근할 수 있다. -> 구현 객체 없이 사용 가능 -> 공통 메서드를 말함
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
