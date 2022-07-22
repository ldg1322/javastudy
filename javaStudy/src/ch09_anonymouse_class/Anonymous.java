package ch09_anonymouse_class;

public class Anonymous {	// 클래스
	// 필드
	Person field = new Jing(); // 자식 객체를 대입
	// 익명 객체를 대입 : 한버난 사용. 별도로 클래스 파일을 만들지 않겠다.
	// 익명 -> 생성자가 없음 -> 생성자로 부모클래스를 사용 
	Person field2 = new Person() {	// 객체를 생성해서 대입을 한다.
		// 클래스의 정의부
		public void wake() {
			System.out.println("7시에 30분에 일어납니다.");
			gotoSchool();
		};
		
		private void gotoSchool() {
			System.out.println("학교에 갑니다.");
		}
	};
	// 생성자 
	public Anonymous(Person p) {	// 생성자의 매개 변수로 부모 객체 PErson을 사용
		this.field = p;
	}
	// 메서드
	void method1() {
		field.wake();	// 필드를 사용
	}
	
	// 메서드
	void method2() {
		Person p2 = new Person() {	// 익명 객체를 대입
			// 익명 객체의 정의부
			@Override
			public void wake() {
				System.out.println("9시에 일어납니다.");
				walk();	// 산책을 한다.
			}
			
			private void walk() {
				System.out.println("산책을 합니다.");
			}
		};
		p2.wake(); 	// wake() 메서드를 호출
	}
	
	// 메서드 : 매개변수에 익명객체를 대입
	void method4(Person p) {
		p.wake();
	}
	public void wake() {
		// TODO Auto-generated method stub
		
	}
}
