package ch02;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		int i = 128;
		
		if(i<Byte.MIN_VALUE||i>Byte.MAX_VALUE){ //-128,127
			System.out.println("byte타입으로변환할수없습니다.");
			System.out.println("값을다시확인해주세요.");
			} else {
			byte b =(byte)i;
			System.out.println(b);

		}
	}
}
