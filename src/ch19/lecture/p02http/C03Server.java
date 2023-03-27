package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C03Server {
	public static void main(String[] args) {
		// 스레드 추가
		// 여러 브라우저에 요청

		int port = 80;
		try (ServerSocket serverSocket = new ServerSocket(port);) {
			System.out.println("요청기다리는 중...");

			while (true) {   //여러 브라우저가 접속 가능

				Socket socket = serverSocket.accept();
				Thread t = new Thread(() -> {

					try (socket;
							OutputStream os = socket.getOutputStream();
							PrintStream ps = new PrintStream(os);) {

						String body = """
								<h1>This is NAVER!</h1>
								<h2>음료 뭐시켰어</h2>
								<h3>다른 사이트로 이동</h3>
								<ul>
									<li><a href="http://www.daum.net">daum</li>
									<li><a href="http://www.google.com">google</li>
								</ul>
								""";
						int length = body.getBytes().length; // 본문의 바이트단위 길이

						// 첫 줄
						ps.println("HTTP/1.1 200 OK");

						// 두번째 줄부터 헤더들
						ps.println("Content-Type: text/html; charset=utf-8");
						ps.println("Content-Length: " + length);

						// 빈 줄
						ps.println();

						// 응답 본문
						ps.println(body);

						ps.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
				t.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("서버종료!");

	}
}
