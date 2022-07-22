package ch11_system_time;

/*
 * 시스템에서 제공하는 시간으 얻는 방법
 * System.currentTimeMilles() : ms 단위로 시스템의 현재시간을 반환. 1990년 1월1일이 0이다.
 * Systme.nonTime() : ns 단위(E-9) -> method의 수행시간을 측정하는데 사용 (종료시간 - 시작시간)
 */
public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();	// 시작 시간을 저장
		// longtime3=System.currentTimeMillis();
		int sum = 0;
		for (int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();	// 종료시간
		// longtime4=System.currentTimeMillis();
		System.out.println("1~1000000까지의합:" + sum);
		System.out.println("계산에" + (time2 - time1) + "나노초가 소요되었습니다.");
		// System.out.println("계산에"+(time4-time3)+"ms가소요되었습니다.");
		
	}

}
