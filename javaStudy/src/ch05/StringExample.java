package ch05;

public class StringExample {

	public static void main(String[] args) {
		String name1 = "아무나";	// "이름" : 문자 리터럴 -> heap영역에 저장됨
		String name2 = "아무나";	// 위와 동일 -> 위의 문자 리터럴과 동일 -> 동일한 문자열만 저장됨
		String name3 = new String("아무나");	// new 생성자를 이용해서 생성한 인스턴스 객체 => heap영역에 저장이 됨
		String name4 = new String("아무나");	// 인스턴스 객체
		
		// 주소 비교 -> 물리적으로 동일한 문자열 (객체)인지 비교
		System.out.println(name1 == name2);			// true
		System.out.println(name1 == name3);			// false -> 물리적으로 다름
		System.out.println(name3 == name4);			// false -> 물리저그올 다름
		
		// 내용 비교 -> 논리적으로 동일한 문자열 (객체)인지 비교 -> 논리적 동등 비교 (로그인 시 사용자로부터 입력받은 값과)
		// 데이터 베이스에 저장된 회원정보가 논리적으로 같은지 비교해야 한다.
		System.out.println(name1.equals(name2));	// true
		System.out.println(name1.equals(name3));	// true -> 물리적으로 다르지만 논리적으로 같음 
		System.out.println(name1.equals(name4));	// true -> 물리적으로 다르지만 논리적으로 같음
		
		// 가비지 (쓰레기) 컬렉션 (수집) : heap 영역에서 사용되지 않는 데이터를 사용할 수 있도록 환수하는 것(주체:JVM)
		name4 = null;	// new String("아무나")로 생성했던 객체에 대한 참조 방법이 없어진다. -> 쓰레기가 된다.
		// 가비지 컬렉터가 회수를 한다. -> 새로운 객체를 생성하려는데 메모리가 부족할 때 수행함.
		

	}

}
