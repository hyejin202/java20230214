package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no=  no;
		this.name = name;
	}
	public int getNo() {return no;}
	public String getName() {return name;}
	
	@Override                      //학생번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
	public int hashCode() {        // (번호와 이름이 같으면 동일한 해시코드)
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	@Override                           //재정의해서 Student객체인지 확인하고, 학생번호와 이름이 같으면 true를 리턴
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {  //문자열이 같으면 같은 해시코드
				return true;
			}
		}
		return false;
	}
	
	
}
