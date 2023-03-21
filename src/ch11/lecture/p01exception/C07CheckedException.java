package ch11.lecture.p01exception;

import java.io.*;

public class C07CheckedException {
	public static void main(String[] args) {
//		FileInputStream file = new FileInputStream(".gitIgnore");  //FileNotFoundException - checked exception
		try {
			FileInputStream file = new FileInputStream(".gitIgnore");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue...");
	}
}
