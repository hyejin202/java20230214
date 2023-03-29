package ch02.lecture.p02type;

public class C03Short {

	public static void main(String[] args) {
		//short (2byte, 16bits)
		//가장 작은 값 : (1000 0000 0000 0000) -(2^15) (-32768)
		//가장 큰 값   : (0111 1111 1111 1111) 2^15-1  (32767)
		
		short s1;
		s1 = 0;
		s1 = 32767;
		s1 = -32768;
		
//		s1 = 32768;  // X
//		s1 = -32769;  // X
	}
}
