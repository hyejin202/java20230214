package ch14.exercise.exam02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		for(int i=0; i<3; i++) {
			System.out.println("메인 쓰레드!!");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
	}
}
//총 3개의 쓰레드 동시 진행