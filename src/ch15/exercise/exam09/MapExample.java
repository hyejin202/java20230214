package ch15.exercise.exam09;

import java.util.*;
import java.util.Map.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("whilte", 92);
		
		String name = null;   //최고 점수를받은 아이디를 저장하는 변수
		int maxScore = 0;   //최고 점수를 저장하는 변수
		int totalScore = 0;  //점수 합계를 저장하는 변수
		
		//여기에 코드 작성
	
//		Set<String> keys = map.keySet();   //키 set 얻기, key들을 원소로 같는 set
//		for(String key : keys) {
//			totalScore += map.get(key);
//			if(map.get(key) > maxScore) {
//				maxScore = map.get(key);
//				name = key;
//			}
//		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			Integer v = entry.getValue();
			
			totalScore += v;
			
			if (v > maxScore) {
				name = k;
				maxScore = v;
			}
		}
		
		int avg = totalScore / map.size();
		System.out.println("평균 점수: " + avg);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);
		
			
		
	}
}
