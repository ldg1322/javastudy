package ch06_Constructor;

public class Car_Ex {

	public static void main(String[] args) {
		// 여러가지 생성자를 이용해서 객체를 생성할 수 있다. 어떤 것을 초기값으로 설정할 것인가?
		Car c1 = new Car();
		Car c2 = new Car(4);
		Car c3 = new Car("그랜저");
		Car c4 = new Car(60, "에딘슨 모터");
		

	}

}
