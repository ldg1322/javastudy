package ch08.interface_definition;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		RemoteControl rc = new Television();	// 자동 타입 변환 : 인터페이스 = 구현 객체
		// 구현 객체가 인터페이스를 구현했으므로 대입이 가능하다
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();	// 인터페이스 이름을 사용해서 정적 메서드를 사용
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		/* 익명 구현 객체
		 * - 이름이 없는 구현 객체
		 * - class 파일을 생성하지 않는다.
		 * - 구현객체 이르믕로 생성자를 사용할 수 없다. -> 인터페이스 이름으로 생성자를 대신한다.
		 * - 구현 객체가 필요한 곳에 구현 객체를 정의해 준다.
		 * - .class 생성이 된다. -. RemoteControlExample$n.clss
		 * - 안드로이드 앱에서 서버와 통신할 떄 스레드를 만들어서 통신 -> 스레드를 익명구현 객체로 생성
		 */
		
		RemoteControl rc2 = new RemoteControl() {	// Television
			// 익명 구현 객체의 정의 부가 된다. -> Television.class과 같은 정의 부분이 된다.
			int volume;
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				if(volume < RemoteControl.MIN_VOLOME) {
					this.volume = RemoteControl.MIN_VOLOME;
				}else if(volume > RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 볼륨 : " + volume);
			}
		};
		// 리모콘으로 사용해서 TV을 시청
		rc2.turnOn();
		rc2.setVolume(3);
		rc2.setMute(true);
		rc2.turnOff();
		
		// rc2.volume = 10;	// 익명 구현 객체가 추가한 필드나 메서드에 접근할 수 없다.
		// 인터페이스에 정의된 것만 사용할 수 있다
		// 강제 타입 변환을 할 수 없음 : 클래스 이름이 없으므로 
	}
}
