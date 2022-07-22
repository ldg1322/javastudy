package ch06_Constructor;

public class Car {
	// 필드
	String model;
	String company;
	int color;
	int speed;
	int seatNum;
	
	// 생성자 : 객체 생성시, 필드 초기화를 한다.
	// 형식 : 접근제한자 클래스 이름 (매개변수 ...) { } -> 일종의 메서드 
	// 메서드와 차이점 : 반환형이 없다.
	// 매개변수가 없는 생성자 : default 생성자
	public Car() {		// 다른 생성자가 없을 경우 생략 가능
		// default 생성자가 생략 되었을 경우, 컴파일러가 default 생성자를 자동으로 생성
		
	}
	
	// 다른 생성자를 추가할 수 있음 -> 매개변수로 필드를 초기화 하고자 할 때
	public Car(String model) {	// 매개변수로 model을 받아서
		this.model = model;	// 매개변수 이름과 필드 이름이 같아서 필드를 구분하기 위해 this를 사용
		// this : Car 클래스를 의미
	}
	// 다른 생성자가 하나라도 존재하면 default 생성자를 자동으로 만들어 주지 않는다.
	// 존재하는 생성자를 사용해서 객체를 만들 수 있기 때문에 default 생성자를 만들어 주지 않음
	// 주의사항 : default 생성자가 필요하면 수동으로 정의해 주어야 한다.
	// 상속과 연계가 된다.
	
	// 생성자를 여러 개 정의해서 사용 할 수 있다. -> 생성자 오버로딩(overloading)
	// 컴파일러가 매개변수가 다른 것을 구별할 수 있으므로 허용 
	// 컴파일러가 매개 변수를 구별할 수 없으면 허용하지 않음 
	public Car(int seatNum) {	// 매개변수로 seatNum을 초기화
		this.seatNum = seatNum;
	}
	
//	// 위의 생성자와 같은 생성자로 인식 -> 매개변수로 필드를 초기화 하고자 할 때
//	public Car(int speed) {		// 매개변수로 speed를 초기화 -> 컴파일러는 다른 것을 구분 못함
//		// 매개변수의 변수이름은 논리적인 의미를 가지므로 		
//	}


	// 생성자 오버로딩 -> 매개변수 이름이 동일, 시그너쳐(매개변수의 갯수, 순서, 위치)로 구분
	// 매개 변수가 1개 잇는 것과 2개 있는 것은 구별할 수 있다.
	// 순서가 다른 것은 구분 할 수 있다. 
	public Car(String model, String company) {	// 허용
		this.model = model;
		this.company = company;
	}
	// 순서가 다른 것은 구분할 수 있다.
	public Car(int speed, String company) {
		this.speed = speed;
		this.company = company;
	}
	
	public Car(String company, int seatNum) {
		this.company = company;
		this.seatNum = seatNum;
	}
}