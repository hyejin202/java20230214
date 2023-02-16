package ch03.exercise;

public class Example05 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		//1
		double area1 = (lengthTop + lengthBottom) * height / 2.0;
		//2 
		double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2.0;
		//3
		double area3 = (double)(lengthTop + lengthBottom) * height / 2;
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		//4
		double area4 = (double) ((lengthTop + lengthBottom) * height / 2);
		System.out.println(area4);
	}
}
