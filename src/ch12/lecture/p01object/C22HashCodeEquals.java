package ch12.lecture.p01object;

import java.util.*;

public class C22HashCodeEquals {
	public static void main(String[] args) {
		Object o1 = new MyClass22(1, "kim", "seoul", false);
		Object o2 = new MyClass22(1, "kim", "seoul", false);
		Object o3 = new MyClass22(1, "kim", "seoul", true);
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
		System.out.println(o1.equals(o2));  //true 서로 다른객체이지만 문자열이 같아서(재정의)
		System.out.println(o1.equals(o3));  //false
		
		System.out.println(System.identityHashCode(o1));  //서로 다른 객체이기 때문에 다름
		System.out.println(System.identityHashCode(o2));
	}
}

class MyClass22 {
	private int id;
	private String name;
	private String address;
	private boolean married;
	
	public MyClass22(int id, String name, String address, boolean married) {
		//super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.married = married;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, married, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass22 other = (MyClass22) obj;
		return Objects.equals(address, other.address) && id == other.id && married == other.married
				&& Objects.equals(name, other.name);
	}
	
	
}