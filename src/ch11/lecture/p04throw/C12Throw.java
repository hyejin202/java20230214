package ch11.lecture.p04throw;

import java.io.*;

public class C12Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {   //Exception을 던졌기 때문에 FileNotFoundException을 던지거나 잡을 수 없음
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method1() throws Exception {
		new FileInputStream("");   //String파라미터를 받는 생성자-throws FileNotFoundException
	}
}
