package ch07.AbstractClass;

// 추상 클래스를 상속받아 구
public class SmartPhone extends Phone {
	int volume;
	
	public SmartPhone(String owner) {
		super(owner);
	}

	// 추상 메서드는 반드시 재정의를 해주어야 한다.
	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 볼륨 : " + volume);
	}
	
	// 자식의 메서드를 추가
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
}
