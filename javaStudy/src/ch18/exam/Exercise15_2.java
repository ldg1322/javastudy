package ch18.exam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/* 실행방법 : java HexaViewer HexaViewer.class -> args -> 파라미터 수 1개
 * 요구 사항 : 한 줄에 16개 Hexa로 출력
 * 힌트 : PrintStream과 printf() 메서드 사용
 * 파일을 읽어야 한다. -> 바이트?, 문자? -> 바이트(.class파일이 바이트로 구성되어 있으므로)
 * 		FileInputStream을 사용
 * 		한번에 16바이트씩 읽어야 함. -> 출력 -> 바이트 배열 -> 크기 16바이트 짜리 
 * 		남는 바이트가 있으면 그만큼 읽어서 출력
 * 출력 : Hexa로 출력, 대문자로 출력, 0 도 출력
 */
public class Exercise15_2 {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("사용방법 : java HexaViewer HexaViewer.class");
			System.exit(0); // 종료 코드 : -1(파라미터 잘못 입력)
		}
		// 입력한 파일이 존재하는지 확인
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("올바른 파일명을 입력하세요.");
			System.out.println(-2); // 종료 코드 : -2 (잘못된 파일 명을 입력한 경우)
		}
		// 16 바이트씩 읽어서 출력 -> 반복문을 사용
		// 입력 방법 : FileInputStream
		try (FileInputStream fis = new FileInputStream(file); PrintStream ps = new PrintStream(System.out)) {
			// 읽어들인 데이터를 저장할 변수를 선언
			byte[] inputs = new byte[16]; // 16바이트 씩 읽기
			int readBytes; // 읽은 바이트 수 : 남은 바이트 수가 얼마인지? 저장
			while ((readBytes = fis.read(inputs)) != -1) { // EOF 일때까지 읽는다.
				// 출력 -> 반복문을 사용해서 읽은 바이트 수만큼 출력
				int i;
				for (i = 0; i < readBytes - 1; i++) {
					// %x : hexa로 출력, %X : hexa 대문자로 출력
					// 출력된튼 문자의 수 : 2개
					ps.printf("%02X ", inputs[i]);
				}
				// 마지막 바이트 출력
				ps.printf("%02X\n", inputs[i]); // 변수 i가 필요함 -> for문 전에 선언
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

//		String inputFile = args[0];
//		try {
//			FileInputStream input = new FileInputStream(inputFile);
//			PrintStream output = new PrintStream(System.out);
//			int data = 0;
//			int i = 0;
//			while ((data = input.read()) != -1) {
//				output.printf("%02X ", data);
//				if (++i % 16 == 0)
//					output.println();
//			}
//			input.close();
//			output.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
