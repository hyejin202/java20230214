package ch18.lecture.p03inputstream;

import java.io.*;

public class C02InputStream {
	public static void main(String[] args) {
		try(var is = new FileInputStream("output/test3.db")) {
			
			//read: int형으로 리턴
			int data = 0;
			
			while((data = is.read()) != -1) {   //읽은 값이 -1이 아닐때까지 반복
				System.out.println(data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
