package ch17.lecture.p01stream;

import java.util.stream.*;

public class C07Stream {
	public static void main(String[] args) {
		// IntStream
		//일반 Stream에는 없는데, IntStream에는 있는 메소드
		// range : 범위 (시작값, 종료값) - 시작값은 포함되지만 종료값은 포함X
		IntStream stream1 = IntStream.range(0,  10);  // 0 ~ 9
		System.out.println(stream1.count()); //10
		
		//rangeClosed(시작값, 종료값) - 종료값 포함 O
		IntStream stream2 = IntStream.rangeClosed(0, 10);  // 0~10
		System.out.println(stream2.count());  //11
	}
}
