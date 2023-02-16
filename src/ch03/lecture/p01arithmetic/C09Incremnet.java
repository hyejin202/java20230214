package ch03.lecture.p01arithmetic;

public class C09Incremnet {
	public static void main(String[] args) {
		//증가 연산자 (++)
		//감소 연산자 (--)
		
		int x = 1;
		int y = 1;
		
		x++;  //2
		++x;  //3
		
		y--;  //0
		--y;  //-1
		
		System.out.printf("%d %d%n", x, y);  // x : 3, y : -1
		
		int z = x++ + 10;  //13
		int w = ++y + 10;  //10
		
		System.out.printf("%d %d%n", z, w);
		
		
		
	}
}
