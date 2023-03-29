package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {   //float타입 쓰지 말것 -정확X
			System.out.println(x);
		}
	}
}
