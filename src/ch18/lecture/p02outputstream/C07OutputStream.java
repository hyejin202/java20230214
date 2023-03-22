package ch18.lecture.p02outputstream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try(var os = new FileOutputStream("output/output7.txt")) {
			//한바이트씩 쓰기
			os.write(30);  //1
			os.write(12346);  //1
			
			//여러바이트 쓰기
			byte[] data = {3, 3, 3, 3, 3, 3, 3, 3, 3};
			os.write(data);  //9bytes
			
			//여러바이트 쓰기(배열의 일부분)
			os.write(data, 0, 3); //바이트 배열 data의 0번부터 3의 길이만큼 쓴다  //3bytes
			os.write(data, 4, 5);  //4번부터 5 길이만큼 쓴다, //5bytes
			os.write(data, 0, data.length); //9bytes
			
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
