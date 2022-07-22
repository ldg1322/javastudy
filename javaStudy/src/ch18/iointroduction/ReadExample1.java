package ch18.iointroduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileAlreadyExistsException;

public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		// 한 바이트씩 읽기
		InputStream is = new FileInputStream("C:/Temp/test.txt");	// 예외처리를 해준다.
		int readByte;
		while(true) {
			readByte = is.read();	// read() : 한 바이트씩 읽는다. -> 반환형은 int
			if(readByte == -1) {	// -1 : EOF(End of File) -> 데이터의 맨 끝
				break;	// 반복문 종료
			}
			System.out.println((char)readByte);
		}
		is.close();
	}

}
