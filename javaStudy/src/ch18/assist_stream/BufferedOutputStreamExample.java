package ch18.assist_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {
	public static void main(String[] args) throws Exception {
		int data = -1;
		long start = 0;
		long end = 0;

		File file = new File("src/ch18/assist_stream/forest.jpg");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:/Temp/forest.jpg");
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1)
			fos.write(data);
		fos.flush();
		fos.close();
		bis.close();
		fis.close();
		end = System.currentTimeMillis();
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");

		// BufferedOutputStream을 사용 
		fis = new FileInputStream(file);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/forest.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while ((data = bis.read()) != -1)
			bos.write(data);
		bos.flush();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		end = System.currentTimeMillis();
		System.out.println("사용했을 때: " + (end - start) + "ms");
	}
}
