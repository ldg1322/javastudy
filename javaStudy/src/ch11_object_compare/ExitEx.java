package ch11_object_compare;

// 이 프로그램의 목적은 종료코드가 5일때만 종료 하도록 하는 것이다.
// 그 이외의 종료 코드가 발생하면 종료하지 않는다.

public class ExitEx {

	public static void mmain(String[] args) {
		// 보안관리자설정
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if (status != 5) {
					// throw 예외를 발생
					throw new SecurityException();
				}
			}
		});
		for (int i = 0; i < 10; i++) {
			// i값출력
			System.out.println(i);
			try {
				// JVM종료요청
				System.exit(i);	// i : 종료 코드
			} catch (SecurityException e) {	}
		}
	}

}
