package ch07.casting;

public class Child extends Parent {
	// 필드
	int filed2;
	
	// 메서드
	// method2()를 재정의
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	// 자식이 추가한 메서드
	void method3() {
		System.out.println("Child-method3()");
	}
}
