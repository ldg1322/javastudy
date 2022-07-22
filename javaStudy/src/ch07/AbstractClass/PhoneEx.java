package ch07.AbstractClass;

public class PhoneEx {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
		
		KtDmbPhone kt = new KtDmbPhone("이선희");
		kt.setVolume(10);
		
	}
}
