package ch18.lecture.p04writer;

import java.io.*;

public class C01Writer {
	public static void main(String[] args) {
		// Writer : 문자단위 출력 스트림
		// 주요 메소드 : write
		
		String fileName = "output/writer1.txt";
		try (Writer wr = new FileWriter(fileName)) {
			
			// write
			wr.write('a'); //자동형변환
			wr.write('b');  //영어-한글자당 한 바이트
			
			wr.write('가');  //한글-한 글자당 한바이트 아님 
			wr.write('나');
			
			wr.write(9850);  //유니코드
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	
		
		
		
	}
}
