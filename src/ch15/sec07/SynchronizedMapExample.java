package ch15.sec07;

import java.util.*;

public class SynchronizedMapExample {
	public static void main(String[] args) {

		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());

		Thread tA = new Thread() {
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		Thread tB = new Thread() {
			public void run() {

				for (int i = 1001; i < 2000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		try {
			tA.join();
			tB.join();
		} catch (Exception e) {

		}
		int size = map.size();
		System.out.println("총 객체 수 : " + size);
	}
}
