package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) {
		// ip 주소
		// port 번호
		int port = 50500;
		String ip = "172.30.1.65";
		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);) {
			String input = "";
			try (Scanner scanner = new Scanner(System.in);) {
				System.out.println("서버에게 보낼 데이터 작성>");
				input = scanner.nextLine();
			}
			ps.println(input);

			ps.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("클라이언트 종료");
	}
}
