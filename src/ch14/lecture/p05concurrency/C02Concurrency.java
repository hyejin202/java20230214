package ch14.lecture.p05concurrency;

public class C02Concurrency {
	// synchronized 블럭 (동기화 블럭)
	
	static int field = 0;
	
	public static void main(String[] args) {
		//획득해야 하는 객체
		// intrinsic lock
		// monitor lock
		// monitor
		// lock
		Object o = new Object();      //공통으로 획득할 수 있는 객체를 하나 만들어야 함
//		Object o1 = new Object();
		Thread a = new Thread(() -> {
			for(int i=0; i<100000; i++) {
				synchronized(o) {			
					field++;
				}
			}
		});
		Thread b = new Thread(() -> {
			for(int i=0; i<100000; i++) {	
				synchronized(o) {		  //synchronized를 실행하려면 o객체를 먼저 획득해야 함, //획득 -실행 -반납	
					field++;
				}
			}
		});
		a.start();
		b.start();
		try {
			a.join();
			b.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(field);
	}
}
