package ch06.lecture.p07constructor;

public class C09String {
	public static void main(String[] args) {
		//여러 생성자가 있는 String 클래스 (생성자 오버로딩)
		String s1 = new String();
		System.out.println(s1);
		
		String s2 = new String(new byte[] {97, 98, 99});
		System.out.println(s2);
		
		String s3 = new String(new byte[] {97, 98, 99}, 1, 2);
		System.out.println(s3);
		
		String s4 = new String(new char[] {'가', '나', '다', 'a', 'b'});
		System.out.println(s4);
		
		String s5 = new String("hello");
		System.out.println(s5);
	}
}
