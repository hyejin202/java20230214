package ch11.lecture.p04throw;

import java.io.*;

public class C06Throw {
	public static void main(String[] args) {
		
	}
	public static void method2() throws Exception{  //상위클래스 하나만 작성 가능, 또는 Throwable
		int a = 1;
		 if(a == 1) {
			 throw new ClassNotFoundException();
		 } else {
			 throw new FileNotFoundException();
		 }
	}
	public static void method1() throws ClassNotFoundException, FileNotFoundException{
		int a = 1;
		
		if (a == 1) {
			throw new ClassNotFoundException();
		}else {
			throw new FileNotFoundException();
		}
	}
}
