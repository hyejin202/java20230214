package ch11.exercise.exam05;

public class Example05 {
	//2
	public static void method2() throws Exception{
		method1();
	}
	public static void main(String[] args) {
		//1
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//4
		try {
			method1();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//3
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
//			catch (ClassNotFoundException e) {      //XX 앞에서 잡아서 도달할 수 없음
//			e.printStackTrace();
//		}
	}                                   //RuntimeException      //Exception
	public static void method1() throws NumberFormatException, ClassNotFoundException{
		
	}
}
