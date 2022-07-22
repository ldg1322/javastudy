package ch05;

public class ArrayExample01 {

	public static void main(String[] args) {
		// 배열 : 동일한 데이터 타입의 데이터를 여러 개 연속적으로 저장할 수 있는 데이터 구조
		// 반복문을 이용해서 조작이 편리
		// 물리적으로는 이웃해서 존재한다.
		// 인덱스를 사용 저장 위치를 지정한다.
		// 동일한 데이터가 저장된다.
		// 한번 배열의 크기를 설정해서 생성하면 변경할 수 없다. -> 고정된 크기
		// 더 많은 데이터를 저장하려면 새로 더 큰 것을 생성하고 기존에 있는 데이터를 복사 유지한다.
		
		// 형식 : 데이터 타입[] 배열 이름, 데이터타입 배열이름[]
		int[] score1 = { 100, 98, 87, 50, 79 };	// 배열을 선언과 함께 초기화 -> { } 안에 있는 원소의 갯수만큼 길이가 할당됨
			// 배열의 길이는 5 
		int score2[] = { 87, 95, 90, 88, 100, 89 };	
			// 배열의 길이는 6
		int score3[];	// 선언만
		// 나중에 데이터를 추가
		score3 = new int[] { 100, 95 };	// 생성할 때는 new 연산자를 사용해야 한다.
		int score4[];
		// score4 = { 79, 91 };		// 에러가 발생 -> 데이터 타입이 무엇인지 모르기 때문
		int score5[] = new int[7]; 	// -> 초기값이 0으로 데이터가 저장이 된다.
		// int score6[] = new int[3] { 100, 95 };	// 에러 발생 -> 배열의 갯수가 2개인데, [3]을 넣을 수 없음
		
		// 배열의 위치를 지정할 때 인덱스를 사용
		System.out.println(score1[0]);	// 0번째 데이터를 출력
		System.out.println(score1[1]);	// 1번째 데이터를 출력
		
		// 주의 : 인덱스 0~4 -> 길이 5
		System.out.println(score1[5]); 			// 5번째 데이터를 출력 -> 예외가 발생 -> ArrayIndexOutOfBoundsException
		
		// 배열은 객체
		// 배열에 저장된 데이터를 출력 -> 반복문을 사용해서 조작하기 편하다.
		for(int i = 0; i< score1.length; i++) {	// 배열 객체의 length 필드 정보를 이용
			System.out.println(score1[i] + " ");
		}
		System.out.println();
		
		score1 = null;
		System.out.println(score1[0]);	// 예외 -> NullPointerException 발생
	}

}
