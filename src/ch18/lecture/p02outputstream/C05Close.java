package ch18.lecture.p02outputstream;

import java.io.*;

public class C05Close {
	public static void main(String[] args) {
		// var
		String s = "java";
		var s2 = "java";  //초기화되는 값에 따라 참조변수의 타입을 유추
		
		//try-with-resource에 var 사용 가능
		try(var os = new FileOutputStream("");) {
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
