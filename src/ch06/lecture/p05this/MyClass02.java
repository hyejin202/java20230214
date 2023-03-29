package ch06.lecture.p05this;

public class MyClass02 {

	// instance field
	String name;

	// instance method
	void printName() {
		String name = "park";

		System.out.println(name); // local variable
		System.out.println(this.name); // 인스턴스 필드에 있는 name을 가르킴

		
//		String localName = "park";

//		System.out.println(localName); // local variable
//		System.out.println(name); // 인스턴스 필드에 있는 name을 가르킴
	}
	
	void setName(String name) {
		//파라미터 name을 필드 name에 할당
		this.name = name;
	}

}
