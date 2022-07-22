package ch09_anonymouse_class;

public class Jing extends Person {	// 부모 클래스 PErson을 상속
	public void wake() {
		System.out.println("8시에 일어납니다.");
		gotoInstitute();
	}
	
	// 자식 클래스의 메서드를 추가
	private void gotoInstitute(){
		System.out.println("학원에 갑니다.");
	}
}
