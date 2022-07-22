package ch03;

public class CompareExample {

	public static void main(String[] args) {
		// 비교 연산을 할 때 연산자의 타입이 서로 다른경우 ( 부동소수점을 사용하는 경우 ) 주의를 해야한다.
		// float, double -> 오차가 다르다. -> 연산자를 통일을 하거나 아니면 정수로 변환을 하여 비교를 한다.
		int v2 = 1;
		double v3 = 1.0;	// -> 오차 없음
		System.out.println(v2 == v3);	// true
		
		double v4 = 0.1;	// 오차가 존재
		float v5 = 0.1f;	
		long l4 = Double.doubleToLongBits(v4);
		System.out.println(Long.toBinaryString(l4));
		int i5 = Float.floatToIntBits(v5);
		System.out.println(Integer.toBinaryString(i5));
		System.out.println(v4 == v5);	// false
		System.out.println((float)v4 == v5);	// 오차가 다르다. -> float -> double -> false
		// 생각했던 결과가 안나온다. -> 오차가 다르기 때문에 -> float으로 변환은 하거나, int로 변환
		// double로 변환하면 안되나? 원래의 double과 변환던 것이 다르게 된다 . -> 다르다.
		
		// float으로 변환을 해서 비교
		System.out.println(v4 == v5);	// false
		System.out.println((float) v4 == v5);	// true
		System.out.println((int)(v4 * 10) == (int)(v5 * 10));	// true
		
		System.out.println();
		
		System.out.println(3 > 5); // 3이 5보다 큽니까? : false 반환
		System.out.println((12 <= 12));// 12가 12보다 작거나 같습니까? : true 반환

		System.out.println("a" != "b");// "a"와 "b"가 다른가? : true 반환
		System.out.println("a" == "a");// "a"와 "a"가 같은가? : true 반환
		System.out.println(5 != 5.0);// 5.0과 5.0이 다른가? : false 반환

	}

}
