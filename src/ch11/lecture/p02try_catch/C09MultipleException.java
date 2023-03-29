package ch11.lecture.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception이 발생 가능
		
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		} 
/*		catch (ArithmeticException | NumberFormatException | NullPointerException e) {  //X
			e.printStackTrace();           //ArithmeticException은 runtimeException(실행예외)이고, 
											//NumberFormatException과 NullPointerException은 exception(일반예외)임
		} */
		
		//o
		try {
		//여러 exception이 발생 가능	
		}  catch(Exception e) {
			e.printStackTrace();
		}
	}
}
