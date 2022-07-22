package ch11_object_class;

// 모든 클래스는 Object 클래스를 상속 받는다.
// Object 클래스의 메서드를 가지고 있다.
// clone(), finalize(), toString(), equals(), hashCode()
// equals() -> 비교 -> 기본적으로 주소를 비교한다 -> 논리적 동등 비교 (equals() 메서드를 재정의를 해야 한다.)
// hashCode() : 물리적인 id를 반환 : 물리적으로 다른 요소이면 다른 값을 반환
// 논리적 동등 비교를 하려면 물리적으로 다르더라도 같은 hashCode를 가지도록 재정의 해주어야 한다.
// toString() : 클래스의 패키지 경로와 클래스의 주소를 출력
// 객체를 출력할 때 객체의 toString()메서드가 호출 됨
// 주소는 사용자에게는 의미없는 값이다.
// 클래스의 정보를 출력하도록 재정의흘 해주어야 한다.
// clone() : 객체를 복제할 때 사용
// 얕은 복제 : 클래스 내에 참조변수나 배열이 있을 때, 주소만 복사. 동일한 객체를 가리키게 된다.
// 깊은 복제 : 클래스 내에 참조변수나 배열이 있을 때, 복사를 하는데 참조객체의 내용이나 배열의 내용을 복사하는 것
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 논리적으로 동등한 객체를 비교를 하려면 equal() 메서드를 재정의
	// default는 Object 클래스의 equals() 메서드가 실행되어 == 과 같은 동작을 한다.
	@Override
	public boolean equals(Object obj) {	// Obj에 Member 객체가 대입된다.
		// 비교를 하려면 동일한 객체끼리 비교를 해야 한다.
		// 논리적 동등 비교 : 두객체의 id가 같으면 동일한 것으로 간주
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return id.equals(member.id);	// 논리적 동등 비교
		}
		return false;
	}
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1 == obj2;			// false
		System.out.println(obj1);	// obj1.toString()을 출력
		System.out.println(obj2);	// obj2.toString()을 출력
		System.out.println(result);	// false
		boolean result2 = obj1.equals(obj2);	// equals() 메서드는 == 와 같다. -> false
			// equals() 메서드는 주소를 비교
		System.out.println(result2);
	}
}
