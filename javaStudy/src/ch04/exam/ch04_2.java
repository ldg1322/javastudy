package ch04.exam;

/*	1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) . 의 결과를 계산하시오
 * i=4 -> 1+2+3+4 1~4 (i: 중첩 for문의 종료조건) : 초기치, 종료조건, 증감식
 */
public class ch04_2 {

	public static void main(String[] args) {
		// 합을 저장하는 변수
		int sum = 0;
		for(int i = 1;i <= 10;i++) {	// 1~10
			// System.out.println("i");
			for(int j = 1;j <= i;j++) {
				sum += j;
			}
		}
		// 결과 출력
		System.out.println("결과 = " + sum);
	}

}
