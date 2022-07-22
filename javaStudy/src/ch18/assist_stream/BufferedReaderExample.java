package ch18.assist_stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
 * BufferedReader : Reader를 통해서 읽은 문자열을 버퍼를 사용하여 성능향상을 한다.
 * 빠른 처리를 하는 CPU와 느린 처리를 하는 I/O 장치간의 완충역할을 하는 버퍼를 사용해서 성능 향상
 */
public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;	// 키보드 : 바이트로 ㅓㅊ리
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);

		System.out.print("입력: ");
		String lineString = br.readLine();

		System.out.println("출력: " + lineString);
	}
}
