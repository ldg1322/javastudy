package ch18.file;

import java.io.File;
import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		// package 경로에 따라 다를 수 있음
		File file = new File("src/ch18/file/FileReaderExample.java");
		System.out.println("절대경로 : " + file.getAbsolutePath());
		FileReader fr = new FileReader(file);

		int readCharNo;
		char[] cbuf = new char[100];
		while ((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}
