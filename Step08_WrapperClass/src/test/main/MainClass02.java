package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String strNum= "999";
		// ���ڿ��� ������ �ٲٱ�
			//Integer => int �� ��ü Ÿ�� class (wrapper class) !
		int result= Integer.parseInt(strNum);
		
		String strNum2= "10.1";
		// ���ڿ��� �Ǽ��� �ٲٱ�
		double result2= Double.parseDouble(strNum2);
	}
}
