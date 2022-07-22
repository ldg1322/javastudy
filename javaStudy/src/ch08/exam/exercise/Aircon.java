package ch08.exam.exercise;

public class Aircon implements RemoteControl {
	// 상수
	int temperature;
	@Override
	public void turnOn() {
		System.out.println("에어컨 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨 전원을 끕니다");

	}

	@Override
	public void serTemperature(int remperature) {
		

	}

}
