package ch18.iointroduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		byte[] readBytes = new byte[3];
		int num;	// 읽은 바이트 수
		String data = "";
		while((num = is.read(readBytes)) != 0) {	// EOF가 아닐 때까지
			System.out.println("읽은 바이트 수 : " + num);
			data += new String(readBytes);	// 바이트 배열 -> String -> 계속 이어진다.
		}
		System.out.println(data);
		is.close();
	}

}
