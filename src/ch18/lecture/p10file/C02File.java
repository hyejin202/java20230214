package ch18.lecture.p10file;

import java.io.*;

public class C02File {
	public static void main(String[] args) {
		File file = new File("output");
		
		System.out.println(file.getName());  //output
		System.out.println(file.length());  //4096
		System.out.println(file.exists());  //true
		System.out.println(file.isFile());  //false
		System.out.println(file.isDirectory());  //true
		
		System.out.println("디렉토리 내의 파일 목록");
		File[] files = file.listFiles();
		for(File f : files) {
			System.out.println(f.getName());
		}
	}
}
