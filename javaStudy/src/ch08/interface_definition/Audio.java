package ch08.interface_definition;

public class Audio implements RemoteControl {
	// 필드
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

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
