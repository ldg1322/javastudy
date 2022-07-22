package ch08.interface_definition;

// InterfaceAimpl : 구현객체
// implements 키워드를 사용하고 구현하고자 하는 인터페이스 명을 붙여준다.
// 여러 개 구현할 수 있다.	(필요한 기능을 추가 한다.)
// 추상 메서드를 재정의 해주어야 한다. (구현 객체는 구현할 목적으로 implement 하였으므로)
// 추상 메서드를 구현하지 않으면 추상 메서드가 되고, 추상 클래스가 된다.
public class InterfaceAImpl implements InterfaceA {
	
	// 추상 메서드 -> 재정의 
	@Override
	public void method1() {
		System.out.println("추상 메서드를 재정의한다.");

	}

}
