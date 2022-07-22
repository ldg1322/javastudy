package ch04;

public class If01 {

	public static void main(String[] args) {
		// 아래와 같이 작성하며
		// if(조건식) {
		//     실행할구문 1:
		//     실행할구문 2:
		//     ......
		// }
		// 조건식이 참인 경우는 { } 사이의 실행할구문 세트를 전부 실행하지만
		// 조선식이 거짓인 경우는 무시하고 넘어갑니다.
		int age = 20;	// 나이를 입력 받고
		
		boolean gender = true; // 성별을 입력받고, true : 남자  false : 여자
		String candidate = "윤석열";	// 지지자를 입력 받았을 때 (이재명, 심상정)
		// 연령별, 성별, 지지하는 후보
		int arr[] = new int[3];	// 계수
		if(age >= 18 && age < 20) {	// 10대
			// 조건을 만족하면 실행이 된다.
			if(gender == true) {	// 중첩문 : if문 안에 if문이 있을 경우 남성
				if(candidate.equals("윤석열")) {
					arr[2]++;
				} else if(candidate.contentEquals("이재명")) {
					arr[1]++;
				} else {
					arr[3]++;
				}
			} else {		// 여성
			
			}
		} else if(age >= 20 && age < 30) {	// 20대
			
		} else if(age <= 30 && age < 40) {	// 30대
			
		} else if(age <= 40 && age < 50) {	// 40대
		
		} else if(age <= 50 && age < 60) {	// 50대
	
		} else {	// 그 밖에 60 이상
			
		}
		
		// if 문의 조건을 만족해서 실행을 한 후 이곳으로 프로그램의 순서가 이동 된다.
		// 효율성이 떨어짐 -> 매번 판단을 해야함
		if(age >= 18 && age < 20) {
			
		}
		if(age >= 20 && age < 30) {	// 10대인 경우 불필요하게 또 비교를 하게되어 효율이 떨어짐
			
		}
		if(age >= 30 && age < 40) {
			
		}
		// 실행문이 한 줄일 경우 중괄호는 생략할 수 있음.
		if(gender) {
			// gender가 true이면 실행된다.
			System.out.println("남성");
		} else {
			System.out.println("여성");
		}	
		int a = 3;
				
		if(a < 4 ) {
		// if문 중괄호 내부 영역에 있어서 조건식의 영향을 받는 구문
			System.out.println("a는 4보다 작습니다.");
		}
		// if문의 중괄호 영역이 종료된 다음 작성하는 구문은 
		// if문의 참 거짓과는 상관없이 실행됩니다.
		System.out.println("무조건 실행됩니다,");

	}

}
