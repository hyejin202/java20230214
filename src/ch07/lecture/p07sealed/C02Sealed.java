package ch07.lecture.p07sealed;

public class C02Sealed {

}

sealed class Super02 permits Sub021 {}

//final class Sub021 extends Super02 {} (O)

//상속받은 클래스는 다시 sealed로 선언 가능
sealed class Sub021 extends Super02 permits Sub0211{}

final class Sub0211 extends Sub021 {}