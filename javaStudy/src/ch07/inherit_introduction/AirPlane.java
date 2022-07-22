package ch07.inherit_introduction;
/* 메서드 재정의
 * 부모 클래스 : AirPlane
 * 자식 클래스 : SuperSonicAirPalne 초음속 비행기
 * 		모드 : 일반 비행 모드 -> 일반 비행모드로 비행 
 * 			   초음속 비행 모드 -> 초음속 모드로 비행
 */
public class AirPlane {	// 부모 클래스
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 비행합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙 합니다.");
	}
}
