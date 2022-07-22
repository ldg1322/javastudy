package ch18.assist_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Child child = new Child();
		child.field1 = "홍길동";	// 부모의 필드
		child.field2 = "홍삼원";	// 자식의 필드
		oos.writeObject(child);
		oos.flush();
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Child v = (Child) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		ois.close();
		fis.close();
		
		// 부모 클래스를 Serializable을 구현한다.
		// 부모 클래스를 Serializable을 구현하지 않은 경우
		// - Child 객체에 writeObject()와 readObject()를 추가해서
		// - 부모 클래스의 필드를 출력
		
	}

}
