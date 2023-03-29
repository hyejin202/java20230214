package ch13.lecture.p01generic;

public class C09Inherit {
	public static void main(String[] args) {
		
	}
}
//제네릭 타입 상속
class Super09<T> {}
class Sub09<T> extends Super09<T> {}

class Super10<T, U> {}
class Sub10<T, U> extends Super10<T, U> {}

class Super11<T> {}
class Sub11 extends Super11<String> {}    //구체적으로 타입 명시됐으면 타입명시 생략 가능

class Super12<T, U> {}
class Sub12<T> extends Super12<T, String> {}

class Super13<T> {}
class Sub13<T, U> extends Super13<T> {}

class Super14<T extends Number> {}
class Sub14<T extends Integer> extends Super14<T> {}   //Number보다 하위타입으로 명시해야 함