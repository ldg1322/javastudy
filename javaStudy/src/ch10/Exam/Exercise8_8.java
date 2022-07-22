package ch10.Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise8_8 {

	public static void main(String[] args) {
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기 위한 변수

		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요  :");
			// 1. 정상적으로 입력되었을 때
			// 2. 비정상적으로 입력되었을때
//			do {
				try {
					input = new Scanner(System.in).nextInt(); // 입력 받기
				} catch (InputMismatchException e) {
					continue;
				}
			
//				break;
				// 문자를 입력하는 경우 예외 처리를 하라.
				// 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보안하라.
//			} while (input < 1 || input > 100);
			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println(" 맞췄습니다.");
				System.out.println("시도 횟수는 " + count + "번입니다.");
				break; // do-while문을 벗어난다
			}
		} while (true); // 무한반복문
	} // end of main

}
