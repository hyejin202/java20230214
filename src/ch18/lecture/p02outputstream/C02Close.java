package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		// finally 블럭에서도 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;
		try {
			// 스트림 열고
			os = new FileOutputStream("output/output.txt");

			// 어떤 작업
			os.write(1);

			os.flush(); // 습관적으로 사용하는게 좋음
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) { // exception이 발생하면 os는 null값을 가지기 때문에 NullPointerException이 발생할 수 있음
				try {
					os.close();
				} catch (Exception e) {
					e.printStackTrace();
				} // 꼭 닫아줘야 함->꼭 실행되야 하므로 finally block에 작성
			}
		}
		//close() 때문에 코드 길어짐
	}
}
