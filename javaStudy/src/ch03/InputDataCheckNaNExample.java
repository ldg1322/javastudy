package ch03;

public class InputDataCheckNaNExample {

	public static void main(String[] args) {
			String userInput = "NaN";	// 문자열로 입력을 받음
			double val = Double.valueOf(userInput);	// 문자열을 doubl로 변환 (NaN : Not a Number)
			double currentBalance = 10000.0;
			currentBalance += val;
			System.out.println(currentBalance); // NaN + 소수 = NaN이 된다. -> 잔고가 무한대가 됨
			// 손님 입장에서는 NaN 입력했으므로 성공
			// 음행원 입장에서는 이런 경우를 방지
			// NaN 인지를 검사하여 처리 필요
			System.out.println("===================");
			
			String userInput2 = "NaN";
			double val2 = Double.valueOf(userInput2);
			double currentBalance2 =10000.0;
			
			if(Double.isNaN(val2)){	// 고객이 입금한 돈이 NaN인지를 확인하는 절차를 추가
				System.out.println("NaN이입력되어처리할수없음");
				val2 = 0.0;		// NaN이 입력되더라도 영향이 없도록 입력값을 0.0으로 설정 
			}
			currentBalance2 += val2;
			System.out.println(currentBalance2); //10000.0
		}

}	
