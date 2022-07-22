package ch06.access.modifier2;

import ch06.access.modifier1.ClassA;

public class ClassD {
	void method() {
		ClassA ca = new ClassA(10);	// public : ok
		ca.field1 = 10;		// public : OK
		ca.field2 = "홍길동";	// protected : 접근 불가능 -> 다른 패키지에 있는 클래스는 접근 불가
		ca.field3 = 20L;	// default : 접근 불가능
		ca.field4 = 2.3;	// private : 접근 불가능
		
		// 메서드
		ca.method1();	// public만 ok
		ca.method2();
		ca.method3();
		ca.method4();
		
		// 생성자
		ClassA capro = new ClassA("홍길동");	// 접근 불가능
		ClassA cadef = new ClassA(20L);
		ClassA capri = new ClassA(5.4);
		
	}
}
