package ch17.lecture.p03intermediate;

import java.util.*;

public class C11Map {
	public static void main(String[] args) {
		List<Book> list = List.of(
				new Book("slamdunk", 3000),
				new Book("avatar", 4000),
				new Book("the glory", 5000),
				new Book("avengers", 2000));
		
		int sum = list.stream()
			.map(Book::getPrice)   //price만 매핑해서
			.reduce(Integer::sum)  //합계를 구하고
			.get();               //값을 가져옴
		System.out.println(sum);
		
		double avg = list.stream()
					.mapToInt(Book::getPrice)  //기본타입 int로 매핑(변환)해주는 메소드
					.average()   //평균을 구하는 메소드(IntStream)
					.getAsDouble(); //double타입으로 가져옴
		System.out.println(avg);
		
	}
}
class Book {
	private String title;
	private int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
}
