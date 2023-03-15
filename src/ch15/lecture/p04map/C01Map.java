package ch15.lecture.p04map;

import java.util.*;

public class C01Map {
	public static void main(String[] args) {
		// map
		// (key, value) 쌍 entry를 저장
		//key는 중복되지 않음
		
		Map<String, String> map = new HashMap<>();
		
		//entry 추가
		map.put("kang", "slamdunk");
		map.put("serly", "avatar");
		map.put("maverick", "topgun");
		
		//entry 수
		int size = map.size();
		System.out.println(size);  //3
		
		map.put("kang", "baseball");  // 예전값은 새로운 값으로 대체
		System.out.println(map.size()); //3
		
		//key로 value얻기
		String v1 = map.get("serly");
		System.out.println(v1);  //avatar
		System.out.println(map.get("kang"));  //baseball
		
		//entry 지우기
		System.out.println(map);
		map.remove("kang");
		System.out.println(map.size()); //2
		System.out.println(map);
		
		
		//전체탐색
		
		System.out.println("keySet 사용 @@@@@@@@@@@@@@@@@@@@@");
		Set<String> keys = map.keySet();   //키 set 얻기, key들을 원소로 같는 set
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("forEach 메소드 %%%%%%%%%%%%%%%%%%%%%%%");
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		System.out.println("entrySet 메소드$$$$$$$$$$$$$$$$$$$$");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}	
		
	}
}
