package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		// 코드수정 힌트얻기 : ctrl + 1
		// 줄 맞추기(들여쓰기) : ctrl+shift+f
		int hour = 3;
		int min = 5;
		System.out.println(hour + "시간 " + min + "분");

		int totalMinute = (hour * 60) + min;
		System.out.println("총 " + totalMinute + "분");
	}
}
