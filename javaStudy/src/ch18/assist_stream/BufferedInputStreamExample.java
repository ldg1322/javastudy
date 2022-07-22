package ch18.assist_stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
	public static void main(String[] args) throws Exception {
		long start = 0, end = 0;

		File file = new File("chap18/src/sec05/exam03_bufferedinputstream/forest.jpg");
		FileInputStream fis1 = new FileInputStream(file);
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();

		FileInputStream fis2 = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
		}
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}
}
