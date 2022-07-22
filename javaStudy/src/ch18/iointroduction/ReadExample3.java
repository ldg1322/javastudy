package ch18.iointroduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample3 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo; // 읽은 바이트 수
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3);
		for (int i = 0; i < readBytes.length; i++)
			System.out.println(readBytes[i]);
		is.close();

	}

}
