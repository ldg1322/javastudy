package ch11_object_compare;

import java.util.Objects;

public class ToStringEx {

	public static void main(String[] args) {
		String str1="홍길동";
		String str2=null;
		System.out.println(Objects.toString(str1));	// 홍길동
		System.out.println(Objects.toString(str2));	// "null"
		System.out.println(Objects.toString(str2,"이름이없습니다."));	// 이름이 출력된다.

	}

}
