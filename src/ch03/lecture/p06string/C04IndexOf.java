package ch03.lecture.p06string;

public class C04IndexOf {
	public static void main(String[] args) {
		// indexOf
		// 특정 문자(열)가 처음 나타나는 위치(index) 확인
		// return type : int
		
		String str1 = "spring";
		
		int i1 = str1.indexOf("ring");
		System.out.println(i1);  //2
		
		int i2 = str1.indexOf('i');
		System.out.println(i2);  //3
		
		String str2 = "java";
		System.out.println(str2.indexOf('a'));  //1
		System.out.println(str2.indexOf("a"));  //1
		
		//없으면 -1을 리턴
		String str3 = "html";
		System.out.println(str3.indexOf("tm"));
		System.out.println(str3.indexOf("mt"));
		System.out.println(str3.indexOf("Tm"));
		
		
	}
}
