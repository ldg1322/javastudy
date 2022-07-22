package ch06_sec09;

public class Car_ex {
	// 인스턴스 필드
	int sum = 0;

	// 정적 메서드 -> 생성의 생성과는 무관하게 동작
	public static void main(String[] args) {
		
		sum = 10;	// 에러 발생 -> 인스턴스 필드이므로 객체가 생성이 되어야만 존재 
		Car_ex ce = new Car_ex();	// 인스턴스 멤버는 객체가 생성되어야만 존재
		ce.sum = 20;	// 참조변수를 통해서 인스턴스 필드에 접근할 수 있다.
		
		// 정적 멤버는 클래스에 공통인 멤버 
		Car.battery = "로켓";		// 클래스 이름으로 접근
		System.out.println("배터리 : " + Car.battery);
		
		// 차를 운전을 하려면 구체적인 하나의 실체가 필요 -> 인스턴스 화(객체를 생성)
		Car c1 = new Car("포르쉐");
		Car c2 = new Car("벤츠");
		
		c1.run();	// 포르쉐 운행
		c2.run();	// 벤츠 운행
		
		
	}

}
