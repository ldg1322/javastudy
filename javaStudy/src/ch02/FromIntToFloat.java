package ch02;

// int -> float
public class FromIntToFloat {

	public static void main(String[] args) {
		// 오차 없이 저장할 수 있는 가장 큰 수 : 16777216
		int num1 = 123456780;	// 16777216보다 큰 수 -> 오차가 발생
		int num2 = 123456780;
		
		float num3 = num2;		// 자동 타입 변환 : int -> float
		num2 = (int) num3;		// 강제 타입 변환 : float -> int (손실이 발생할 수 있음)
		
		int result = num1 - num2;	// 오차가 없을 경우 0이 된다.
		System.out.println(result); 

	}

}
