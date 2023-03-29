package cho2.lecture.p02type;

public class C12Casting {
	public static void main(String[] args) {
		//정수끼리, 실수끼리
		//큰 타입-> 작은 타입 : 강제 형변환(casting)
		int i1;   //4bytes
		long l1;  //8bytes
		
		l1 = 30;
//		i1 = l1;   //오류!!
		i1 = (int)l1;  //강제 형변환(casting)
		System.out.println(i1);
		
		l1 = 3000000000L;
		i1 = (int)l1;
		System.out.println(l1);
		System.out.println(i1);
		
		short s1;
		byte b1;
		
		s1 = 20000;    //
		b1 = (byte)s1;
		System.out.println(s1);
		System.out.println(b1);
		
		
		//실수 -> 정수 : 강제 형변환(casting)
		double d2;
		int i2;
		
		d2 = 3.14;
//		i2 = d2; //오류!!
		i2 = (int)d2; //강제 형변환, 소수점 아래 버려짐
		System.out.println(d2);
		System.out.println(i2);
		
		
		
		
	}

}
