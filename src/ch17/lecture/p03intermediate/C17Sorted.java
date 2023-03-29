package ch17.lecture.p03intermediate;

import java.util.*;

public class C17Sorted {
	public static void main(String[] args) {
		List<Movie> movie = List.of(
				new Movie("avatar", 10000),
				new Movie("slamdunk", 9000),
				new Movie("avengers", 7000),
				new Movie("titanic", 15000)
				);
		movie.stream()
			.sorted((a, b) -> a.getPrice() - b.getPrice())  //가격이 싼거부터 비싼거 순으로
			.forEach(System.out::println);
		
		System.out.println();
		movie.stream()
			.sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
			.forEach(System.out::println);
	}
}
class Movie {
	private String title;
	private int price;
	public Movie(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	 
	@Override
	public String toString() {
		return title + " " + price;
	}
}
