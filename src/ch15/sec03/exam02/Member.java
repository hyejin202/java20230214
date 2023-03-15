package ch15.sec03.exam02;

import java.util.*;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;   //name과 age 값이 같으면 동알한 hasgCode 리턴
	}
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member target) {    //name과 age 값이 같으면 true리턴
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;

		}
	}

}
