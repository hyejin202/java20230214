package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C01NetworkServer {
	public static void main(String[] args) {
		// IP 주소 -내가 지정 불가능
		// Port 번호 - 내가 지정 가능
		// 필요
		int port = 50500;
				//서버 소켓을 만듦
		try (ServerSocket serversocket = new ServerSocket(port);) {// 50500번 port로 설정해 서버를 생성
			System.out.println("연결 기다리는 중...");
			try (
					//소켓 열기, 클라이언트 클래스 , 연결 허용하겠다
					Socket socket = serversocket.accept();  //클라이언트 요청을 받아 들인다, 누군가 이컴퓨터에 연결을 시도하면 실행됨
					OutputStream os = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(os);
					BufferedWriter bw = new BufferedWriter(osw);) {
				bw.write("Hello world");
				
				bw.flush();

			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}
}
