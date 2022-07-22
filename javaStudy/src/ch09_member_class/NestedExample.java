package ch09_member_class;

public class NestedExample {
	
	public static void main(String[] args) {
		A.C ac = new A.C();	// 객체 C를 생성
		ac.method();
		
		A a = new A();
		A.B ab = a.new B();
		ab.method();
	}
}
