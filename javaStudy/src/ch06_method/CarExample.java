package ch06_method;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(60);	// 메서드를 호출
		double result = myCar.divide(10.0, 5.2);
		result = myCar.divide(10, 2);	// 매개변수로 int를 사용 -> 매개변수로 double을 사용
		// 자동 타입 변환을 허용한다. double이 int를 저장할 수 있으므로 
		// 강제 타입 변환을 허용 하지 않음 -> 손실이 발생 할 수 있으므로 허용하지 않는다.
		// int r1 = myCar.sub(10.0, 20.0); // 에러 발생
		// 큰 데이터 타입을 작은 데이터 타입에 대입 할 때는 손실이 발생하므로 에러 발생
	}

}
