package ch16.sec02.exam02;

//700(lambda) -> 420(anonymous) -> 412(concrete class)
public class ButtonExample {
	public static void main(String[] args) {
		//ok버튼 객체 생성
		Button btnOk = new Button();
		
		//ok버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		
		//Ok버튼 클릭하기
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
	
		
		btnCancel.click();
	}
}
