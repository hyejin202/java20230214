package ch18.lecture.p02outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		//간결하게 사용하기 위해 만들어짐
		//try-with-resources
		
		//자동으로 닫아줌
		try (OutputStream os = new FileOutputStream("");) {  //try 둥근괄호() 안에 스트림을 열어주면 자동으로 닫아줌
			os.write(1);
			os.flush();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
