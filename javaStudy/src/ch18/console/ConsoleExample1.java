package ch18.console;

import java.io.Console;

public class ConsoleExample1 {
	public static void main(String[] args) {
		
		// Console 클래스는 이클리스에서 동작을 안함 -> cmd 창에서 만 수행
		Console console = System.console();
		System.out.print("아이디: ");
		String id = console.readLine();
		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}
