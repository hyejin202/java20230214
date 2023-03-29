package ch03.lecture.p06string;

public class C11IsBlank {
	public static void main(String[] args) {
		// isBlank
		// 공백문자만 있는지 확인?
		// return type : boolean
		
		String str1 = " java ";
		String str2 = "   ";
		String str3 = """
				
				
				
				""";
		String str4 = "";
		
		System.out.println(str1.isBlank());  //false
		System.out.println(str2.isBlank());  //true
		System.out.println(str3.isBlank());  //true
		System.out.println(str4.isBlank());  //true
		
		System.out.println(str1.isEmpty());  //false
		System.out.println(str2.isEmpty());  //false
		System.out.println(str3.isEmpty());  //false
		System.out.println(str4.isEmpty());  //true
	}
}
