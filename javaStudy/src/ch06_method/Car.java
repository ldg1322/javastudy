package ch06_method;

public class Car {
	// 필드
	String model;
	int maxSpeed;
	String Color;
	String company;
	int speed;
	// 생성자
	// 메서드
	// 향식 : 접근 제한자 반환형 메서드 이름 (매개변수, ...){ 실해문...}	
	public void setSpeed(int speed) {	// 반환형 : void (없음) -> return문이 없어도 된다.
		this.speed = speed;
		return/*데이터가 없음*/;	// 메서드의 종료
	}
	
	public int getSpeed() {		// 반환형 : int -> return문이 있어야 한다.
		// return문이 없어서 에러 발생
		return speed;	// 현재 속도를 반환 -> 반환형에 맞추어 주어야 한다.
	}
	
	// 메서드 오버로딩 : 메서드의 시그너쳐가 다르면 여러개를 허용
	// 생성자 오버로딩 : 시그너쳐가 다르면 여러개를 허용 
	void method() {
		byte b1 = 10;
		short s1 = 20;
		int i1 = 30;
		long l1 = 40L;
		float f1 = 60.0f;
		double d1 = 70.0;
		// 메서드 호출 : println() 메서드를 호출
		// 매개변수의 타입이 각각 다르다.
		// 메서드 오버로딩의 전형적인 예 -> 시그너쳐 중에서 타입이 다르다.
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
	}
	
	// C언어는 메서드 오버로딩이 존재하지 않음 -> 메서드 이름을 다르게 해야함
	// 같은 이름의 add 메서드가 존재 : 매개변수의 시그너쳐가 다른 것을 정의할 수 있음 (타입, 갯수, 순서)을 정의할 수 있음 -> 
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	long add(long l1, long l2) {
		return l1 + l2;
	}
	
	float add(float f1, float f2) {
		return f1 + f2;
	}
	
	double divide(double d1, double d2) {
		return d1 / d2;
	}
}
