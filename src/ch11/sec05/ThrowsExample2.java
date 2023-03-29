package ch11.sec05;

public class ThrowsExample2 {
	public static void main(String[] args) throws Exception {  //다시 던짐, 상위타입으로 던지기 가능 (Exception->ClassNotFoundException 불가능)
		findClass();
	}
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}
