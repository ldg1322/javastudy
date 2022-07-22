package ch01;

public class Hello {

	// 파일을 수정하면 반드시 저장 을 해야 이클립스는 새로운 내용을 반영함.
	// 저장하지 않으면 옛날 데이터로 되어 있는 것으로 간주한다.
	// 이클립스는 빌드 도구로 ant를 사용한다.
	// maven : spring 배울 때 사용 
	// gradle :android 앱을 개발할 때 android studio 개발도구
	public static void main(String[] args) {	// 행 주석 : // 이후부터 끝까지 주석으로 간주
		// 실행문의 끝에는 ' ; ' 세미콜론을 붙여주어야 한다. (규칙)
		System.out.println("Hello World!");
		System.out.println("안녕하세요. 반갑습니다.");
		/* // 범위 주석 시작
		  여러 줄이 가능 
		 */ // 범위 주석 끝
		 
		/** Hello : 클래스
		    소스코드 안에 문서(클래스의 사용법)를 추가할 때 사용
		    클래스를 구성하는 필드, 메서드, 생성자가 무엇이 있는지를 설명
		*/

	}

}
