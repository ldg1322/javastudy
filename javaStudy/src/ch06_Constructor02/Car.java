package ch06_Constructor02;

public class Car {
	// 필드
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 1
	Car(String model) {	// default접근 제한자를 이용 : public 생략
		// 다른 생성자(생성자3)를 재사용 할 수 있다.
		this(model, "은색", 250);		// 생성자 3을 호출 : this -> Car 클래스
//		this.model = model;
//		// 다른 필드를 임의의 값으로 설정
//		color = "은삭";
//		maxSpeed = 250;
	}
	// 생성자2
	Car(String model, String color) {
		// 생성자 3을 호출
		this(model, color, 250);
//		this.model = model;
//		this.color = color;
//		maxSpeed = 250;
	}
	// 생성자3
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
