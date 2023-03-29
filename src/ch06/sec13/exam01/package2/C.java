package ch06.sec13.exam01.package2;    //패키지가 다름
 
import ch06.sec13.exam01.package1.*;

public class C {
	
	//필드 선언
//	A a;    //X    //A클래스 접근 불가(컴파일 에러). A클래스 default :같은 패키지만 접근 가능
	B b;   //O
}
