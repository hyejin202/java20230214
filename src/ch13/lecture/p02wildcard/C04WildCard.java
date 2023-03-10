package ch13.lecture.p02wildcard;

public class C04WildCard {
	
	public static void main(String[] args) {
		MyClass04<Number> o1 = new MyClass04<>();
		printItem(o1);
		
		MyClass04<Integer> o2 = new MyClass04<>();
		printItem(o2);
		
		MyClass04<Double> o3 = new MyClass04<>();
		printItem(o3);
	}
	
	public static void printItem(MyClass04<? extends Number> param) {
		// in 값이 들어옴
		Number num = param.getItem();
		Object oo = param.getItem();		//Number또는 그 하위타입들이니까 Number이상 타입에 대입 가능
		System.out.println(num.doubleValue() * num.doubleValue());
	}
}

class MyClass04<T> {
	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}
