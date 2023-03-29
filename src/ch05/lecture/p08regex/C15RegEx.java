package ch05.lecture.p08regex;

public class C15RegEx {
	public static void main(String[] args) {
		// {0,}
		// * : 0개 이상
		
		//pattern1과 pattern2 같음 
		String pattern1 = "[0-9]{0,}";
		String pattern2 = "[0-9]*";
		//true
		System.out.println("".matches(pattern1));
		System.out.println("".matches(pattern2));
		//true
		System.out.println("3".matches(pattern1));
		System.out.println("3".matches(pattern2));
		//true
		System.out.println("23".matches(pattern1));
		System.out.println("23".matches(pattern2));
		//false
		System.out.println("2a5".matches(pattern1));
		System.out.println("2a5".matches(pattern2));
	}
}
