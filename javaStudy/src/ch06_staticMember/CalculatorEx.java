package ch06_staticMember;

public class CalculatorEx {

	public static void main(String[] args) {
		// 정적 멤버는 클래스 이름으로 접근 가능
		int x = 10;
		int y = 20;
		//
		int sum = Calculator.plus(x, y);
		double radius = 5.0;
		double area = Calculator.pi * radius * radius;
		
		// 인스턴스 멤버 -> 객체가 생성되어야만 의미
		Calculator myCal = new Calculator();	// 객체 생성
		myCal.value1 = 10;	// 참조변수를 사용해서 접근
		// 정적 필드를 접근 : 참조변수를 사용해서 접근을 할 수 있다.	-> Calculator.pi 사용을 권장
		System.out.println("pi : " + myCal.pi);	// 정적 필드는 어떤 인스턴스에만 있는 것이 아니므로
			// 아니므로 myCal.pi -> 인스턴스 필드인 것 처럼 사용하지말라.
		System.out.println("pi = " + Calculator.pi);	// 
		int result = myCal.plus(10, 20);
	}

}
