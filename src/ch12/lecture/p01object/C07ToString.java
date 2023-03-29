package ch12.lecture.p01object;

public class C07ToString {
	MyClass07 o1 = new MyClass07("son", 30, "london", false);
	MyClass07 o2 = new MyClass07("park", 40, "seoul", true);
	
	

class MyClass07 {
	@Override
	public String toString() {
		return "MyClass07 [name=" + name + ", age=" + age + ", address=" + address + ", married=" + married + "]";
	}

	private String name;
	private int age;
	private String address;
	private boolean married;
	
	public MyClass07(String name, int age, String address, boolean married) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.married = married;
	}
}
	
}
