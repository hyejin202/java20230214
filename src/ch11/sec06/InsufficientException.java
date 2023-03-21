package ch11.sec06;

public class InsufficientException  extends Exception{
	public InsufficientException() {
		
	}
	public InsufficientException(String message) {   //메세지 주고 싶을 때 추가 작성
		super(message);
	}
}
