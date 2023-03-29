package ch17.lecture.p03intermediate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> list = List.of(
				new Car("genesis", 7000),
				new Car("avante", 2500),
				new Car("tesla", 5000),
				new Car("morning", 1500)
				);
		//기본 정렬 (가격 순, 오름차순)
		list.stream()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println();
		//이름 순
		list.stream()
			.sorted((a, b) -> a.getName().compareTo(b.getName()))
			.forEach(System.out::println);
		
		System.out.println();
		//가격 순 (내림차순)
		list.stream()
			.sorted((a, b) -> b.getPrice() - a.getPrice())
			.forEach(System.out::println);
		
		//reverseOrder 이용 - 가격 내림차순
		System.out.println();
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
		
		
		
	}
}
class Car implements Comparable<Car> {
	private String name;
	private int price;
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Car o) {
		return this.getPrice() - o.price;
	}
}
