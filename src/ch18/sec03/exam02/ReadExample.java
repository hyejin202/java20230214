package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		
		try (var is = new FileInputStream("output/test2.db")) {
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);  //최대 100byte를 읽고, 읽은 바이트는 data에 저장, 읽은 수는 리턴, 3리턴
				if(num == -1) break;   //파일 끝에 도달했을 경우
				
				for(int i=0; i<num; i++) {      
					System.out.println(data[i]);    //읽은 바이트를 출력
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
