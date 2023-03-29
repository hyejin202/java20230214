package ch18.sec03.exam03;

import java.io.*;

public class CopyExample {
	public static void main(String[] args) throws Exception{   //잡지(try-catch)않고 던짐
		String orginalFileName = "output/bird.jfif";
		String targetFileName = "output/bird_copy3.jfif";
		
		var is = new FileInputStream(orginalFileName);
		var os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];   //읽은 바이트를 정장할 배열 생성
		while(true) {
			int num = is.read(data);
			if(num == -1) break;
			os.write(data, 0, num);  //읽은 바이트 수만큼 출력
		}
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사가 잘 되었습니다.");
		
		
		
		
	}
}
