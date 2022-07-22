package ch05;

public class ArrayExample02 {

	public static void main(String[] args) {
		boolean[] bArr = new boolean[3];	// boolean 데이터타입의 배열 -> false로 초기화
		byte[] byteArr = new byte[5];		// 초기값 0 : 정수는 0이다
		float[] fArr = new float[4];		// 초기값 0.0f, double인 경우 0.0
		
		// enhanced for문
		// for(데이터타입 변수이름  : 배열/Collection) { }
		for(boolean flag : bArr) {	// 배열의 길이만큼 반복 실행
			// 실행문에서는 기본데이터타입 flag로 접근 가능
			System.out.println(flag);
		}
	}

}
