package ch07.AbstractClass;

/*
 * 추상 클래스
 * 여러가지 객체의 공통된 특성을 모아놓은 클래스
 * 구체화할 수 없고, 규격화 (필드 정의, 생성자, 메서드도 정의)
 * 추상 클래스를 상속한 클래스가 구체화를 한다.
 * 객체를 생성할 수 없다. -> 구체화가 안되어 있으므로
 * 추상 메서드를 가지고 있다. -> 형식만 정의하고 실행부가 없는 메서드
 * 추상 메서드가 없을 수도 있다. 기본 틀만 만들었기 때문에 상속받은 클래스가 재정의흘 한다.
 * abstract 키워드를 사용
 */
public abstract class Phone {
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메서드 : 공통되는 메서드만 정의 -> 기본적인 동작만 기술
	public void turnOn() {
		System.out.println("폰 전원을 몁니다.");
	}
	
	// 필요에 따라서 재정의를 하지 않아도 된다.
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 메서드를 가질 수 있다. -> 실행문이 없음
	// abstract 키워드를 사용 -> 상속받은 클래스가 반드시 재정의를 한다.
	// 상속받은 클래스가 추상메서드를 재정의를 하지 않으면 상속받은 클래스가 추상클래스가 된다.
	public abstract void setVolume(int volume);	// 형식만 정의 할 수 있다.
}
