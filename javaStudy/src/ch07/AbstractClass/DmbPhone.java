package ch07.AbstractClass;

// 필요하면 다시 추상클래스를 만든다
public abstract class DmbPhone extends Phone {
	int channel;
	
	public DmbPhone(String owner) {
		super(owner);
	}
	
	// 추상 메서드는 재정의를 해야 한다.
	// 재정의 하지 않으면 추상메서드가 된다. -> abstract 키워드를 메서드에 붙여준다.
	// 추상 메서드가 있는 클래스는 추상 클래스가 된다. -> abstract 키워드로 클래스에 붙여준다.
	@Override
	public void setVolume(int volume) {
	
	}
	public void setChannel(int channel) {
		
	}

}
