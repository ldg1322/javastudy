package ch04;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {	// JVM이 예외 처리를 해달라
		// 규칙 : 1: 증속, 2: 감속, 3: 중지
		// 반복문을 무조건 계속 반복을 하고, 어떤 조건이 되면 반복문을 종료하도록 flag를 선언
		boolean run = true;	// 반복 조건에 들어가는 변수
		int speed = 0;		// 자동차의 속도
		int keyCode = 0;	// 사용자오룹터 키보드 입력값을 저장
		while(run) {
			// 반복 실행 하는 실행문 
			// 현재는 무한 반복을 수행 : 곤란 -> 주의 -> 어떤 조건에서 종료되도록 프로그램을 한다.
			// CPU 점유율이 100%가 되고 다른 프로세스가 일을 할 수 없음
			// IO 동작은 키보드로 부터 엔터키가 입력이 되어야함 입력을 시작 ( 불필요한 입력이 발생 : 13('\r), 10('\n')
			if(keyCode != 13 && keyCode != 10) {	// 키보드 입력받을 때 엔터키를 입력해야 동작
				// 메뉴 출력
				System.out.println("----------------------");
				System.out.println("1. 증속 | 2. 감속  | 3. 중지");
				System.out.println("----------------------");
				System.out.println("선택:");	// print 메서드를 사용 : 커서를 유지하려고
			}
			keyCode = System.in.read(); // 키보드로부터 입력 -> IO동작을 하는 경우는 예외가 발생할 수 있음
										// 예외 처리를 해주어야 한다.
		}

	}

}
