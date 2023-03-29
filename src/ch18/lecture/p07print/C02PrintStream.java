package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {
	public static void main(String[] args) {
		
		try (PrintStream ps = new PrintStream("output/print2.txt");) {
			ps.println(9999);
			ps.println(9.999);
			ps.println(true);
			ps.println("the glory");
			ps.println("더글로리");
			
			System.out.println();  //printStream의 메소드
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
