package ch07.inherit_introduction;

public class SuperSonicAirPlaneEX {

	public static void main(String[] args) {
		SuperSonicAirPlane ssap = new SuperSonicAirPlane();
		ssap.takeOff();
		ssap.fly();
		ssap.flyMode = SuperSonicAirPlane.SUPERSONIC;
		ssap.fly();	// 비행 모드에 따라서 다른 비행을 적용
		ssap.flyMode = SuperSonicAirPlane.NORMAL;
		ssap.fly();
		ssap.land();
	}

}
