package ch08.exam.exercise;

public class Apartment {

	RemoteControl rc;

	// 생성자의 매개변수로 RemoteControl
	public Apartment(RemoteControl rc) {
		this.rc = rc;
	}

	void method1() {
		// 로컬 변수
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}

			@Override
			public int getVolume() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		rc.turnOn();
		rc.setVolume(20);
		rc.getVolume();
		rc.turnOff();
	}

	// 매개 변수
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(30);
		rc.getVolume();
		rc.setMute(true);
		rc.turnOff();
	}

	public static void main(String[] args) {
		Apartment apartment = new Apartment(new RemoteControl() {
			// 작성 위치 (2)

		});
		apartment.rc.turnOn();
		apartment.rc.setVolume(15);
		apartment.rc.getVolume();
		apartment.rc.setMute(false);
		apartment.rc.turnOff();

		apartment.method1();
		apartment.method2(new RemoteControl() {
			// 작성 위치 (3)

		});
	}
}
