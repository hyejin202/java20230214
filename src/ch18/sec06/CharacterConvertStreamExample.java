package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용합니다.");   //string을 받아서 파일에 출력
		String data = read();
		System.out.println(data);
	}
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("output/test.txt");
		Writer writer = new OutputStreamWriter(os, "UTF-8");   //한글 스트링을 받기위해 Writer로 감쌈(OutputStreamWriter이용)
		writer.write(str);
		writer.flush();
		writer.close();
	}
	public static String read() throws Exception {
		InputStream is = new FileInputStream("output/test.txt");
		Reader reader = new InputStreamReader(is, "UTF-8");    //한글 스트링도 읽기위해 문자단위인 Reader로 감쌈 (InputStreamReader)
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}
}
