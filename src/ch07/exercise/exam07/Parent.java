package ch07.exercise.exam07;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");   //this다른 생성자/메소드 불러올때, this(string)이므로 Parent(String nation)불러옴
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
