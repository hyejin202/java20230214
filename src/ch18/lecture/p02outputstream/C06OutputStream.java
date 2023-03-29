package ch18.lecture.p02outputstream;

import java.io.*;

public class C06OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output6.txt")) {
			//한 바이트 쓰기
			os.write(298734);   //1
			os.write(92873492);  //1+1 =2
			
			//여러바이트 쓰기
			byte[] data = {3, 1, 2, 127, 64};
			os.write(data);  //2+5 =7
			os.write(data);  //7+5 =12  
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
