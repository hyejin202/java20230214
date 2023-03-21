package ch11.lecture.p04throw;

import java.io.*;

public class C08Throw {
	public static void main(String[] args) {
		//1
		try {
			method1();
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}catch (FileNotFoundException e2) {
			e2.printStackTrace();
		}
		//2
		try {
			method1();
		} catch (ClassNotFoundException | FileNotFoundException e) {
			e.printStackTrace();
		}
		//3
		try {
			method1();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public static void method1() throws ClassNotFoundException, FileNotFoundException{
		
	}
}
