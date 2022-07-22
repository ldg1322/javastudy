package ch07_polymorphism;

public class Cat extends Animal {
	// 재정의
	@Override
	void sound() {
		System.out.println("야옹 소리를 냅니다.");
	}
}
