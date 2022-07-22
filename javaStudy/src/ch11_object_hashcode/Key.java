package ch11_object_hashcode;

public class Key { // HashMap 컬렉션의 키로 사용되는 객체
	// 유일하게
	public int number;

	public Key(int number) {
		this.number = number;
	}

	// 논리적 동등 비교를 위해서는 equals() 메서드와 hashCode() 메서드를 재정의가 필요
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key) obj; // 강제 타입변환
			return number == key.number; // 같으면 true 다르면 false로 반환
		}
		return false; // 객체가 key가 아니면 false를 반환 -> 다른 객체끼리는 비교 불가
	}
	
	// 논리적 동등 비교를 위해서는 equals() 메서드와 hashCode() 메서드를 재정의가 필요함
	// hashCode() 메서드를 재정의
	@Override
	public int hashCode() {
		return number; // number가 같으면 hasCode값이 같다.
	}
}
