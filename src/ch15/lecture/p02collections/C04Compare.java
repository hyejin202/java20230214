package ch15.lecture.p02collections;

import java.util.*;

public class C04Compare {
	public static void main(String[] args) {
		var list = new ArrayList<Person04>();
		list.add(new Person04("kang", "20230315"));
		list.add(new Person04("seo", "20220222"));
		list.add(new Person04("chae", "20201217"));
		list.add(new Person04("song", "19980103"));
		list.add(new Person04("jung", "20001211"));
		
		//나이순 정렬(나이가 어릴수록 작은 index에)
		Collections.sort(list);
//		Collections.sort(list, (a, b)-> b.getBirth().compareTo(a.getBirth()));
		
		
		Collections.reverse(list);
		System.out.println(list);
		
	}
}
class Person04 implements Comparable<Person04>{
	private String name;
	private String birth;
	
	//toString
	@Override
	public String toString() {
		return "Person04 [name= " + name + ", birth= " + birth + "]";
	}
	//constructor

	public Person04(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	
	//getter/setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	@Override
	public int compareTo(Person04 o) {
		
		return this.getBirth().compareTo(o.getBirth());
//		return o.getBirth().compareTo(this.getBirth());
	}
	
}
