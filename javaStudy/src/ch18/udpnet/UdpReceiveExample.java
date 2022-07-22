package ch18.udpnet;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5001); // 수신 DatagramSocket 생성

		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while (true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet); // DatagramPacket 수신
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[받은 내용: " + packet.getSocketAddress() + "] " + data);
					}
				} catch (Exception e) {
					System.out.println("[수신 종료]");
				}
			}
		};
		thread.start();
		Thread.sleep(10000);
		datagramSocket.close();
	}

}
