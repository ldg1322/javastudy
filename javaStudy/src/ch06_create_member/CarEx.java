package ch06_create_member;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		
		Car aCar = new Car("그랜저");	// 생성자를 사용해서 model 정보를 초기화 할 수 있음.
		System.out.println("모델명 : " + aCar.model);
		
		// 어느 차의 모델인지 모르므로 직접 model에 접근이 불가능
		model = "그랜저";	// 에러 -> CarEx 클래스의 필드로 생각한다
		// 다른 클래스에서는 참조변수를 사용해서 접근해야 한다. : aCar.meodel= "그랜저";
		
		Car yourCar = new Car();
		System.out.println("회사 : " + yourCar.company);
		System.out.println("모델명 : " + yourCar.model);

	}

}
