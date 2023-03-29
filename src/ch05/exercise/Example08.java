package ch05.exercise;

public class Example08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		int count = 0;
		/*
		for(int i=0; i<array.length; i++) {
			count += array[i].length;
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
			}
		}
		*/
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				count++;
			}
		}
		double avg = (double) sum / count;
		
		System.out.println("배열 항목의 전체 합: " + sum + ", 평균: " + avg);
		
	}
}
