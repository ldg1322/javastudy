package ch07_fied_polymorphism_Array;

public class Car {
		//필드
		Tire[] tires;
		//생성자
		public Car(Tire...tires) {
			this.tires = tires;
		}
		//메소드
		// 바퀴를 roll 하면서 수명이 다한 바퀴를 반환
		int run() {
			System.out.println("[자동차가달립니다.]");
			for(int i = 0; i < tires.length; i++){
				if(tires[i].roll() == false){
					stop();
					return(i + 1);
				}
			}
			return 0;
		}	
			void stop(){
				System.out.println("[자동차가멈춥니다.]");
	}
}
