package ch15.exercise.exam0506;

import java.util.*;

public class Exam0506 {
	public static void main(String[] args) {
		//6번 8번 
		//list이용
		//배열
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{8, 83, 93, 87, 88}
		};
		
		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88)
				);
		
		//문제6
		System.out.println(list.size());   //3
		System.out.println(list.get(2).size());  //5
		
		//문제8
		//전체합과 평균 구하기
		int sum = 0;
		int size = 0;
		for(List<Integer> li : list) {
			for(Integer s : li) {
				sum += s;
				size++;
			}
		}
		System.out.println("전체 합: " + sum);
		System.out.println("평균: " + (double) sum / size );
		
				
		System.out.println();
	}
}
