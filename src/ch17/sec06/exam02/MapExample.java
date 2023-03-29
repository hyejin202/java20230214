package ch17.sec06.exam02;

import java.util.*;
import java.util.stream.*;

public class MapExample {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
			.asDoubleStream()   //double타입으로 변환
			.forEach(System.out::println);
		
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
			.boxed()   //Integer 타입으로 변환
			.forEach(obj -> System.out.println(obj.intValue()));
	}
}
