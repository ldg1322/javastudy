package ch11_object_compare;

import java.util.Objects;

import ch10_exception_example.ExceptionExample;

public class NullEx {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		System.out.println(Objects.requireNonNull(str1)); // 홍길동
		try {
			String name = Objects.requireNonNull(str2); // null
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2, "이름이없습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 이름이없습니다.
		}
		try {
			// 람다식으로 작성
			String name = Objects.requireNonNull(str2, () -> "이름이없다니깐요");
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 이름이없다니깐요
		}

	}

}
