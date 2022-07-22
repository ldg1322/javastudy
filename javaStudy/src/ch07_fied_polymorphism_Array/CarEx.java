package ch07_fied_polymorphism_Array;

/*
 * 새로 NexenTire 객체를 추가
 * CarEx 클래스를 수정
 * NexenTire가 추가되어 동작
 * 다른 클래스는 변경되지 않음
 * 다형성의 효과 : 유지 보수가 편하다.
 */
public class CarEx {

	public static void main(String[] args) {
		
		Car car = new Car(new HankookTire("앞 왼쪽", 6), new HankookTire("앞 오른쪽", 2),
				  new KumhoTire("뒤 왼쪽", 3), new KumhoTire("뒤 오른쪽", 4));
		for(int i = 1; i <= 5; i++) {
			int l = car.run();
			switch(l) {
			case 1:
				println("앞 왼쪽 HankookTire로 교체");
				car.tires[l -1] = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				println("앞 오른쪽 KunhoTire로 교체");
				car.tires[l -1] = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3:
				println("뒤 왼쪽 HankookTire로 교체");
				car.tires[l -1] = new HankookTire("뒤 왼쪽", 14);
			case 4:
				println("뒤 오른쪽 KumhoTire로 교체");
				car.tires[l -1] = new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			println("-------------------------------");
		}
	}

	private static void println(String string) {
		// TODO Auto-generated method stub
		
	}

}
