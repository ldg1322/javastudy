package ch07_polymorphism;

public class Dog extends Animal {	// Animal 클래스를 상속받음
	// 부모 글래스에 sound() 메서드 존재
	// 재정의
	@Override
	void sound() {
		System.out.println("멍멍 소리를 냅니다.");
	}
}
