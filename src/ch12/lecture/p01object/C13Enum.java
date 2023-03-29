package ch12.lecture.p01object;

public class C13Enum {
	public static void main(String[] args) {
		Season season = Season.FALL;
		
		String a = switch (season) {
		case SPRING, FALL -> "좋은 계절이다.";
		case SUMMER -> "덮다.";
		case WINTER -> "춥다.";
//		default -> "잘못 입력";     //default 생략 가능: Season이 가질 수 있는 값 저 4개밖에 없음
		};
		
		System.out.println(a);
	}
}
