package ch15.sec05.exam04;

import java.util.*;

public class ComparatorExample {
	public static void main(String[] args) {
		// 비교자를 제공한 treeSet컬렉션 생성
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>((x, y) - > x.price - y.price);   //람다로 작성
		
		//객체 저장
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		//객체를 하나씩 가졍기
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name + ":" + fruit.price);
		}
		
		
	}
}
