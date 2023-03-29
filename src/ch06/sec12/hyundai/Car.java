package ch06.sec12.hyundai;

//import문으로 다른 패키지 클래스 사용을 명시
import ch06.sec12.hanook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

public class Car {
	//부품 필드 선언
	
	//import 안했기 때문에 풀네임 써야됨
	ch06.sec12.hanook.Tire tire1 = new ch06.sec12.hanook.Tire();  
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	
	//import했기 때문에 풀네임 안써도 됨
	SnowTire tire3 = new SnowTire();  
	AllSeasonTire tire4 = new AllSeasonTire();  
}
