package ch05.exam;

public class EX05_3 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;

		/*
		(1) . 알맞은 코드를 넣어 완성하시오
		*/
		
		// for문, enhanced for 문을 사용
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		sum = 0;
		for(int value : arr) {
			sum += value;
		}
		
		System.out.println("sum = " + sum);
	}

}
