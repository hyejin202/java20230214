package ch12.lecture.p01object;

import java.util.*;

public class C24HashCodeEquals {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new MyClass24(1, "kim"));
		set.add(new MyClass24(2, "edman"));
		set.add(new MyClass24(1, "kim"));
		
		System.out.println(set.size()); //2   //hashCode와 equals를 재정의하지 않았다면 사이즈는 각 다른 객체이므로 3,
	}
}
class MyClass24 {
	private int id;
	private String name;
	
	public MyClass24(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//id와 name이 같으면 같은 원소로 만들고 싶음
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass24 other = (MyClass24) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
}