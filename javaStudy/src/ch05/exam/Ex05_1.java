package ch05.exam;

public class Ex05_1 {

	public static void main(String[] args) {
		int[] arr[];	// 정상(?) -> 2차원 배열
		
		int[] arr2 = {1, 2, 3};	// 마지막 , 는 무시된다.
		System.out.println("arr2 배열의 길이 : " + arr2.length);	 
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3 = new int[5];
		
		// int[] arr4 = new int[5] {1, 2, 3, 4, 5,};	// 배열의 갯수는 {} 안에 있는 요소의 갯수로 알 수 있음.
			// int[5]라고 갯수를 적어주면 에러가 발생
		int[] arr4 = new int[] {1, 2, 3, 4,5};
		
		// int arr[5];	
		
		int[] arr5 = new int[] {1, 2, 3, 4, 5};
		int[] arr6[] = new int[3][];	// 열의 갯수는 정해주어야 한다. 행의 갯수는 나중에 정해도 된다.
		arr6[0] = new int[3];			// arr6[0] 열의 1차원 배열을 나중에 생성할 수 있음.
		// int[] arr7[] = new int[][3];	// 에러 -> 열의 갯수를 정해주지 않았으므로 에러 발생

	}

}
