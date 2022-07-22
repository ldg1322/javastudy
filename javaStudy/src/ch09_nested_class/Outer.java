package ch09_nested_class;

public class Outer {
	// 멤버 : 상수, 필드, 생성자, 메서드
	// 인스턴스 멤버 클래스 : Outer 클래스 내에서만 사용 가능 -> 객체가 생성되어야만 존재
	public class InnerA {
		// 생성자
		InnerA() {
			
		}
		// 멤버 : 인스턴스(o), 정적 멤버(x)
		int field1;
		// static String str1;	// 사용 불가능 
		// 인스턴스 메서드
		void iMethod1() {
			
		}
//		 static void sMethod1() {	// 사용 불가능
//			
//		}
	}
	
	// 정적 멤버 클래스 : 객체의 생성없이 접근이 가능 -> 클래스의 이름으로 접근 -> 객체의 생서오가 무관하게 존재
	public static class InnerB {
		// 멤버 : 인스턴스 멤버(o), 정적 멤버(o)
		int field3;
		static String str3;
		void method3() {}
		static void method4() {}
	}
	
	// 메서드
	public void method() {
		// 로컬 클래스 : 메서드 내에서만 사용 -> 정의
		class CommThread extends Thread{	// 서버와 통신을 하는 스레드 클래스
			@Override
			public void run() {
				// 서버와 통신 -> ex) 파일 다운로드
				System.out.println("스레드가 동작함");
				try {
				sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		CommThread com = new CommThread();	// 객체 생성
		com.start();	// 스레드를 시작
	}
	
}

// Outer 클래스와 동등한 레밸에 있는 클래스  
class Bus {
	
}