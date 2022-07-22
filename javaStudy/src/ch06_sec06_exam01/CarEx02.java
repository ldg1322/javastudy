package ch06_sec06_exam01;

public class CarEx02 {

	public static void main(String[] args) {
		Car myCar = new Car();	// 객체를 생성 (실체가 있어야 접근할 수 있다.)
		System.out.println("제조사 : " + myCar.company); 	// 참조변수를 이용해서 필드에 접근
		System.out.println("속도 : " + myCar.speed);		// 0으로 초기화
		myCar.speed = 60;
		System.out.println("변경된 속도 : " + myCar.speed);

	}

}
