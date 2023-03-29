package ch18.lecture.p05reader;

import java.io.*;
import java.util.*;

public class C02Reader {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		
		try(var rd = new FileReader(name)) {
			System.out.println((char)rd.read());  //한 글자 읽음, 가
			System.out.println((char)rd.read());  //나
			System.out.println((char)rd.read());  //다
			char[] data = new char[5];
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			rd.read(data);
			System.out.println(Arrays.toString(data));  //그 다음 5글자 읽음
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
