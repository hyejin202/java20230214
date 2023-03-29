package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		
		try {
			Reader rd = null;
			
			// 1문자씩 읽기
			rd = new FileReader("output/test.txt");
			while(true) {
				int data = rd.read();
				if(data == -1) break;
				System.out.print((char) data);
			}
			rd.close();
			System.out.println();
			
			//문자 배열로 읽기
			rd = new FileReader("output/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = rd.read(data);
				if(num == -1) break;
				for(int i=0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			rd.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
