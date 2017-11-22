package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  Wrapper 클래스 type 을 사용할 때
		 *  기본 데이터 type 을 사용하듯이 사용해도 무방핟.
		 */
		
		int num1= 10;
		int num2= 20;
		int result= num1+num2;
		
		Integer num3= 10;
		Integer num4= 20;
		// 기본 데이터 type 으로 취급하고 산술연산 가능
			//객체형을 쓴다 한들 기본 데이터 type 쓰듯이 써도 무방해. 신경쓸 게 없어
			//단지 이거의 type 이 객체형이구나 이것만 알면 돼
		int result2= num3+num4;
		Integer result3= num3+num4;
	}
}
