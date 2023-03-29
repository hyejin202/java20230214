package ch14.lecture.p01thread;

public class C07Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread() {  //Thread는 Runnable 인터페이스를 구현하고 있음
			public void run() {
				while(true) {
					System.out.println("##작업 쓰레드##");
				}
			}
		};
		t1.start();
		while(true) {
			System.out.println("@@@@@@@@ main thread @@@@");
		}
	}
}
