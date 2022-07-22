package ch03.exam;

public class ch03_1 {

	// ascii 
	// '0' ~ '9' : 0 x 30 (48) ~ 0x39(57)
	// 'A' ~ 'Z' : 'A' 와 'B'는 1만큼 차이가 있다.
	// 'a' ~ 'z' : 'a' (?), 'a' 와 'b' 사이에는 1만큼 차이가 있다.
	// 대문자 -> 소문자로 바꾸는 경우 : 'C' -> 'c' = 'C' ~ 'A' + 'a'
	// 소문자 -> 대문자로 바꾸는 경우 : 'e' -> 'E' = 'e' ~ 'a' + 'A'
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		
		System.out.println(1 + x << 33);	// 산순연산이 먼저 : 3 << 33 -> 6 
		System.out.println(y >= 5 || x < 0 && x > 2);	// true
		System.out.println(y += 10 - x++);	// 대입 연산자는 마지막에 실행 (y=13, x=3) -> 13
		System.out.println(x+=2);			// x = 5 -> 5 
		System.out.println( !('A' <= c && c <='Z') );	// false
		System.out.println('C'-c);			// ascii 코드는 ABC순으로 저장 : 2
		System.out.println('5'-'0');		// 5 : 문자 (숫자인 문자)를 숫자로 변경할 때
		System.out.println(c+1);			// 66 
		System.out.println(++c);			
		System.out.println(c++);
		System.out.println(c);
	}

}
