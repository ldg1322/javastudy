package ch03;

public class AccuracyExample {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - number * pieceUnit;
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면,");
		System.out.println(result + "조각이 남는다."); //0.29999999999999993
		
		System.out.println("=====================");
		
		int apple2 = 1;
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		double result2 = temp / 10.0;
		System.out.println("사과한개에서");
		System.out.println("0.7조각을빼면,");
		System.out.println(result2+"조각이남는다."); //0.3
	}

}
