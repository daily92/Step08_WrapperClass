package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 됩니다.");
		// 기본 데이터 type
		byte num1= 10;
			//num1. 해봐야 아무 것도 안 떠 
			//=> 참조값 아니므로, 그냥 값만 들어있고, field, method 없어
		
		// 참조 데이터 type (객체형)
			//Byte => Wrapper Class
			//기본 데이터 type 에 참조 데이터 type 형이 존재함 
		Byte num2= 10;
			//num2. 하면 이것저것 떠
			//heap 영역에 값(10) 가진 기본 데이터 type 을 wrapping 해서
			//참조값(999) 갖고, 그것을 stack 영역에 num2 변수에 참조값(999)를 담음
			//new 할 필요 없이 알아서 객체 만들어줘
		short num3= 11;
		Short num4= 11;
		
		int num5= 12;
		Integer num6= 12;
		
		long num7= 13;
		Long num8= 13l;  //뒤에 알파벳 소문자 l 붙인 거!
		
		float num9= 14.1f;
		Float num10= 14.1f;
		
		double num11= 15.2;
		Double num12= 15.2;
		
		char ch1= '가';
		Character ch2= '가';
		
		boolean isWait= true;
		Boolean canRun= false;
	}
}
