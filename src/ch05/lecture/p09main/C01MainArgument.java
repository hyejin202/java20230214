package ch05.lecture.p09main;

public class C01MainArgument {
	public static void main(String[] args) {
		
		// 아규먼트 없이 실행
		// java C01MainArgument
		
		//아규먼트 전달 실행
		// java C01MainArgument Hello Java
		
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		
//		System.out.println(args[2]);  //예외 발생
		System.out.println("명령문들..");
		
		
	}
}
