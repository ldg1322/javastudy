package ch18.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); // Socket 생성
			System.out.println("[연결 요청]");
			// 같은 컴퓨터 내에 서버와 클라이언트가 같이 있으므로 loacalhost를 사용
			// 다른 컴퓨터의 서버에 접속하려면 서버의 IP주소(hostname : 도메인주소)를 입력한다.
			socket.connect(new InetSocketAddress("192.168.0.7", 5001)); // 연결 요청
			System.out.println("[연결 성공]");
		} catch (Exception e) {
		}

		if (!socket.isClosed()) { // 연결이 되어 있을 경우
			try {
				socket.close(); // 연결 끊기
			} catch (IOException e1) {
			}
		}
	}
}
