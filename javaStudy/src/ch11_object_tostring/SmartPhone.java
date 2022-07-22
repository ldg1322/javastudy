package ch11_object_tostring;

public class SmartPhone {
	// 필드
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// 이클리스의 기능을 이용해서 자동으로 생성함
	@Override
	public String toString() {	// Object 클래스의 toString() 메서드를 그대로 사용하는 경우
	//	return super.toString();
		return "SmartPhone [제조회사:" + company + ", OS: " + os + "]";
	}
	
	/*
	 * toString() 메서드를 재정의하지 않으면, 별의미 없는 정보가 출력이 된다.
	 * 객체의 정보(내용)을 출력하고 싶으면 toString() 메서드를 재정의해야 한다.
	 */
}
