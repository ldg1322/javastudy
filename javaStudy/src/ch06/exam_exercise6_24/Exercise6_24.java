package ch06.exam_exercise6_24;

public class Exercise6_24 {
	// abs() 메서드를 정의
	public static int abs(int value) {
		if(value < 0)
			return -value;
		else
			return value;
	//	return value >= 0 ? value : -value; // 3항식
	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값 :" + abs(value)); // 5
		value = -10;
		System.out.println(value + "의 절대값 :" + abs(value)); // 10
	}

}
