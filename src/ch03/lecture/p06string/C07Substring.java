package ch03.lecture.p06string;

public class C07Substring {

	public static void main(String[] args) {
		//substring
		//문자열의 일부(substring)을 리턴
		//return type : String
		
		String str1 = "중국 재개방이 글로벌 인플레이션 촉발하지 않은 이유";
		//첫 번째 파라미터 : 시작 index (포함)
		//두 번째 파라미터 : 종료 index (포함안됨)
		
		//"중국" 리턴
		String res1 = str1.substring(0, 2); 
		System.out.println(res1);
		
		//"재개방"
		System.out.println(str1.substring(3, 6));
		
		// 전부
		System.out.println(str1.substring(0, str1.length()));
		
		//파라미터 하나 : 파라미터~끝까지 리턴
		System.out.println(str1.substring(8));
		
		// 파라미터가 인덱스를 벗어나면 오류
		String str2 = "java";
		System.out.println(str2.substring(2, 5));
		
	}
}
