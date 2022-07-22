package ch18.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * Reader : 문자 단위로 읽을 때 사용하는 최상위 클래스
 * Reader 클래스를 상속을 받아 FileReader, BufferedReader, InputStreamReader를 만든다.
 * - FileReader : 파일에서 읽을 때 사용 
 * - BufferedReader ㅣ 버퍼를 사용해서 읽는 효율을 높일 때
 * - InputStreamReader : InputStream으로 읽은 것을 문자단위로 읽을 때
 * - 제공하는 메서드 : input Stream과 동일한 형태의 메서드를 제공 -> 차이점 : 바이트 -> 문자(Char)
 */ 
public class ReadExample1 {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readData;
		while( true ) {	// EOF가 있을 때까지 반복해서 읽는다. -> 모든 파일의 내용을 다 읽게 된다.
			readData = reader.read();	// 한문자씩 -> 반환형 int(주의)
			if(readData == -1) break;	// EOF : -1(int)
			System.out.print((char)readData);
		}
		reader.close();

	}

}
