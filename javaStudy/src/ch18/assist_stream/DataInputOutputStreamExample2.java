package ch18.assist_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStreamExample2 {
	public static void main(String[] args) {
		// Data로 출력 -> 파일 형태로 저장
		try (FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat");
				DataOutputStream dos = new DataOutputStream(fos)) {
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(1);

			dos.writeUTF("감자바");
			dos.writeDouble(90.3);
			dos.writeInt(2);

			dos.flush();
		} catch (IOException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			return;
		}
		try (FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat");
				DataInputStream dis = new DataInputStream(fis)) {
			for (int i = 0; i < 2; i++) {
				// 쓸 떄 사용했던 순서대로 읽어야 함
				String name = dis.readUTF();
				double score = dis.readDouble();
				int order = dis.readInt();
				System.out.println(name + " : " + score + " : " + order);
			}
		} catch (IOException e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	}
}
