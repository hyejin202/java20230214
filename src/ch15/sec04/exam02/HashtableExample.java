package ch15.sec04.exam02;

import java.util.*;
import java.util.concurrent.*;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
//		Map<String, Integer> map = new ConcurrentHashMap<>();
		
		Thread tA = new Thread() {
			public void run() {
				for(int i=1; i<= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		Thread tB = new Thread() {
			public void run() {
				for(int i=1001; i<=2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		tA.start();
		tB.start();
		
		try {
			tA.join();
			tB.join();
		}catch(Exception e) {
		}
		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
		System.out.println();
	}
}
