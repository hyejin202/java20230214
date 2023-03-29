package ch13.lecture.p02wildcard;

public class C05WildCard {
	public static void main(String[] args) {
		MyClass05<Object> o1 = new MyClass05<>();
		addItem(o1);
		
		MyClass05<Number> o2 = new MyClass05<Number>();
		addItem(o2);
		
		MyClass05<Integer> o3 = new MyClass05<>();
//		addItem(o3);  /X   //addItem메소드 파라미터 타입 Number이상이어야 함
		
	}
	
	public static void addItem(MyClass05<? super Number> param) {  //int, double..을 안전빵으로 사용하려면 Number또는 그 상위이어야 함
		param.setItem(3);
		param.setItem(3.14);
	}
}

class MyClass05<T> {
	private T item;
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
}