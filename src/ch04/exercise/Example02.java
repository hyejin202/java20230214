package ch04.exercise;

public class Example02 {
	public static void main(String[] args) {
		String grade = "B";
		
		int score = switch (grade) {
						case "A" -> score = 100;
						case "B" -> {
							int result = 100 - 20;
							yield result;
						}
						default -> score = 60;
						};
						
		System.out.println(score);
	}
}
