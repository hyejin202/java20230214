package ch16.exersise.exam09;

public class Example {
	public static void main(String[] args) {
		//8번 문제 avg() 메소드의 매개값으로 람다식을 사용하지 않고 메고드 참조로 변경
		//double englishAvg = avg(s -> s.getEnglishScore() );
		// -> 답
//		double englishAvg = avg(Student::getEnglishScore);
		
		
		//double mathAvg = avg(s -> s.getMathScore() );
		//-> 답
//		double methAvg = avg(Student::getMathScore);
	}
}
