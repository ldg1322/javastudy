package ch06;

public class Car {	// class 이름은 대문자로 시작, 파일 이름과 동일. 접근 제한자가 public
	// 파일 이름과 동일한 클래스는 public 접근 제한자를 사용 가능.
	// public 접근 제한자 : 어떤 클래스든지 접근할 수 있다.
	
}

class Tire {	// Car.java내에 정의된 Tire 클래스 -> 접근 제한자 default를 사용
	// public 접근 제한자를 사용할 수 없음. default 접근제한자만 사용 가능
	// 접근 제한자 없는 것 : default -> 같은 패키지에 있는 클래스만 접근 가능
	// -> 별도의 파일로 작성하는 것이 일반적 (권장사항)
	// Car.java안에 작성하는 경우 -> 간단하게 프로그램을 수행할 경우에는 사용된다.
	
}