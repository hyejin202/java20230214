package ch15.sec08.exam01;

import java.util.*;

public class ImmutableExample {
	public static void main(String[] args) {
		List<String> immutableList1 = List.of("A", "B", "C");
//		immutableList1.add("D");   (X)
		
		
		Set<String> immutableSet1 = Set.of("A", "B", "C");
//		immutableSet1.remove("A"); (X)
	
		
		Map<Integer, String> immutableMap1 = Map.of(
				1, "A",
				2, "B", 
				3, "C"
				);
//		immutableMap1.put(4, "D");   (X)
		
		//수정가능한 리스트로 만들기
		List<String> list2 = new ArrayList<>(immutableList1);
		list2.add("D"); // (O)
		//수정가능한 Set으로 만들기
		Set<String> set2 = new HashSet<>(immutableSet1);
		set2.add("D");  //(O)
		//수정가능한 Map으로 만들기
		Map<Integer, String> map2 = new HashMap<>(immutableMap1);
		map2.put(4,  "D");
		
		
		//List컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
	
		
		//Set컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSet2 = Set.copyOf(set);
		
		//Map컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2,  "B");
		map.put(3,  "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		//배열로부터 List불변 컬렉션 생성
		String[] arr = {"A", "B", "C"};
		List<String> immutableList3 = Arrays.asList(arr);
//		immutableList3.add("Z");  //(X)
		immutableList3.replaceAll(s -> s+s);  //교체는 가능, 수정불가능이라기 보다 사이즈가 고정
		
		Integer[] arr2 = {3, 4, 5};   //만약에 한다면 int가 아니라 Integer로 해야함 int로하면 X -> 자동 boxing되지 않음
		List<Integer> list4 = Arrays.asList(arr2);  
		
		
	}
}
