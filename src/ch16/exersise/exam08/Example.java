package ch16.exersise.exam08;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	// avg() 메소드 작성   //다시 공부하기..
	private static double avg(Function<? super Student> function) {   //와일드카드 안써도 된다고 함 굳이 쓰면 저거
		int sum = 0;
		for(Student s : students) {
			double score =  function.apply(s);
			sum += score;
		}
		return sum / students.length;
		
	};

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}
}
