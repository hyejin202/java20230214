package ch15.lecture.p07treeset;

import java.util.*;

public class C03Comparator {
	public static void main(String[] args) {
		TreeSet<Book> set = new TreeSet<>((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("glory"));
		
		//natural ordering 적용 X - comparable 불가, treeSet만들때 사용하는 생성자 중 comparator제공하는 생성자 사용하기
		
		System.out.println(set);
		
		
		
	}
}

class Book {
	private String title;

	//getter/setter, constructor, toString, hashCode/equals
	
	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	 @Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	
	
}