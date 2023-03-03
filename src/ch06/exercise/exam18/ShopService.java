package ch06.exercise.exam18;

public class ShopService {

	private static ShopService ins = new ShopService();
	
	
	//외부에서 접근 불가능하게 만듦
	private ShopService() {
		
	}
   //static: 인스턴스 없이 생성가능  //메소드명(상관X)
	public static ShopService getInstance() {
		return ins;
	}
}
