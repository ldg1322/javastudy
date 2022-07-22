package ch08.interface_definition;

public class Television implements RemoteControl {
	// 필드
	int volume;
	
	// 이클립스가 추상 메서드를 재정의하도록 자동으로 만들어 준다. -> 재정의한다.
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

}
