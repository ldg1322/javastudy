package ch07.exam.ex7_1;

public class Ex7_7 {
	// 다음 드의 실행했을 때 호출 되는 생성자의 순서와 실행 결과를 적으시오
		public static void main(String[] args) {
			Child c = new Child();
			
			System.out.println("x = " + c.getX());		// 실행 결과 : 200
			
			/*	생성자 순서
			 * 1. Child()
			 * 2. child(int x)
			 * 3. Parent()
			 * 4. Parent(int x)
			 */
			
		}
	}

	class parent {
		int x = 100;
		
		parent() {		// (3)
			this(200);
		}
		
		parent(int x) {	// (4)
			this.x = x;
		}
		
		int getX(){
			return x;
		}
	}
	
	class Child extends parent {
		int x = 3000;
		
		Child(){	// (1)	super()를 호출하지 않고 this() -> this가 우선순위가 높다.
			this(1000);
		}
		Child(int x){	// (2) : 부모 생성자를 호출
			super();	// 생략 가능 -> 부모를 먼저 생성 ( 초기화 )
			this.x = x;	// x = 1000;
		}
	}	

