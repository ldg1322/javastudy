package ch18.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			// localhost : 자기자신 ( 내 컴퓨터)
			serverSocket.bind(new InetSocketAddress("192.168.0.7", 5001)); // ServerSocket 생성
			while (true) {		// 여러 클라이언트를 처리하기 위해 무한 반복
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept(); // 클라이언트가 접속해 오기를 기다린다. -> 블러킹 상태(대기모드)
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch (Exception e) {
		}

		if (!serverSocket.isClosed()) { // ServerSocket이 닫혀있지 않을 경우
			try {
				serverSocket.close(); // ServerSocket 닫기
			} catch (IOException e1) {
			}
		}
	}
}
