package ch06.exercise.exam15;

public class MemberService {

	boolean login(String id, String pw) {
		if (id.equals("hong") && pw.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}


}
