package ch11_object_tostring;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		// 객체 SmartPhone의 정보를 출력
		System.out.println(myPhone);	// 내부적으로 myPhone.toString() 호출
		System.out.println(myPhone.toString());
	}

}
