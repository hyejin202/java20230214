package ch18.exercise.exam10;

import java.io.*;

public class Example10 {
	public static void main(String[] args) throws Exception {

		// 파일명 입력받는 코드 (option)
		String origin = "";
		String copy = "";

		try (
				BufferedInputStream bis = new BufferedInputStream(System.in);
				InputStreamReader isr = new InputStreamReader(bis);) {

			char[] intputFileCharArray = new char[1024];
			System.out.print("원본 파일 경로: ");
			int len = isr.read(intputFileCharArray);

			origin = new String(intputFileCharArray, 0, len);
			origin = origin.strip(); // 양옆 공백을 지워주는 메소드

			System.out.print("복사할 파일 경로: ");
			len = isr.read(intputFileCharArray);

			copy = new String(intputFileCharArray, 0, len);
			copy = copy.strip(); // 양옆 공백을 지워주는 메소드

			File file = new File(origin);
			if (!file.exists()) {
				System.out.println("원본파일이 존재하지 않음");
				return;
			}
			int lastSlashIndex = copy.lastIndexOf("/"); // lastOfIndex() :해당문자가 있는 마지막 인덱스를 리턴
			String copyFolder = copy.substring(0, lastSlashIndex);
			File file2 = new File(copyFolder);
			if (!file2.exists()) {
				file2.mkdirs();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 복사하는 코드 작성
		try (InputStream is = new FileInputStream(origin);
				OutputStream os = new FileOutputStream(copy);) {

			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);

//			bis.transferTo(bos);
			byte[] data = new byte[1024];
			int len = 0;
			while((len = bsi.read(data)) != -1) {
				bos.write(data, 0, len);
			}
			bos.flush();
			System.out.println("복사가 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
