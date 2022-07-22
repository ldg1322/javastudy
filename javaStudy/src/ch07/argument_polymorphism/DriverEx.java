package ch07.argument_polymorphism;

// 새로운 운송수단을 추가하면
// 새로운 객체를 추가하고
// 변경되는 객체는 DriverEx 클래스만 변경
// Driver 클래스는 변경되지 않는다.

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Bus();
		driver.drive(vehicle); 			// 버스가 달립니다.
		driver.drive(new Texi()); 		// 택시가 달립니다.
		driver.drive(new MotoCycle());	// 모터사이클이 달립니다.
	}

}
