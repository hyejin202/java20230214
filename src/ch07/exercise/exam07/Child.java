package ch07.exercise.exam07;

public class Child extends Parent {
	public String  name;
	
	public Child() {
		this("홍길동");       // 가장 위에 있어야 함, this다른 생성자/메소드 불러올때, this(string)이므로 Child(String name)불러옴
		System.out.println("Child() call");
	}
	public Child(String name) {
//		super();  //상위클래스 (파라미터 없는)생성자 호출
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
