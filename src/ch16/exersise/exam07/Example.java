package ch16.exersise.exam07;

public class Example {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(Operator operator) {
		int res = scores[0];
		for (int score : scores) {
			res = operator.apply(res, score);
		}
		return res;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((x, y) -> Math.max(x, y));
		/*
		 * int max = maxOrMin(x, y) -> { 
		 * if ((x > y) { return x; } else { return y; }
		 * });
		 */

		System.out.println("최대값 : " + max);
		// 최솟값 얻기
		int min = maxOrMin((x, y) -> Math.min(x, y));
		System.out.println("최소값 : " + min);
	};

}
