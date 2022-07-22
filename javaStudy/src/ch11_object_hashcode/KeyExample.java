package ch11_object_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// 식별키 "newKey(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		// 식별키 "newKey(1)"로 "홍길동"을 읽어옴
		// hashMap에서 데이터를 꺼내올 떄 get 메서드를 사용하고 키 값을 매개변수에 준다
		String value = hashMap.get(new Key(1));
		System.out.println(value);	// nul -> 키 값을 못 찾음 -> 키 값이 다르다.
		// 논리적 동등 비교를 하는 방법
		// 두 객체의 (new Key(1))의 hashCode()가 같고, equals() 메서드가  같아야 한다.
		// 논리적 동등 비교를 위해서 hashCode와 equals 메서드를 재정의해야 한다.

	}

}
