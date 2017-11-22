package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String strNum= "999";
		// 문자열을 정수로 바꾸기
			//Integer => int 의 객체 타입 class (wrapper class) !
		int result= Integer.parseInt(strNum);
		
		String strNum2= "10.1";
		// 문자열을 실수로 바꾸기
		double result2= Double.parseDouble(strNum2);
	}
}
