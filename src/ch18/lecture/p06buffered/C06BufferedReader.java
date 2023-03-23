package ch18.lecture.p06buffered;

import java.io.*;

public class C06BufferedReader {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";
		try (FileReader fr = new FileReader(name);
				BufferedReader br = new BufferedReader(fr);) {

			String s = null;
			while ((s = br.readLine()) != null) { // readLine : 한줄씩 읽음, 끝에 도달하면(더이상 읽을게 없으면) null을 리턴
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
