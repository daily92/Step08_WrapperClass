package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  Wrapper Ŭ���� type �� ����� ��
		 *  �⺻ ������ type �� ����ϵ��� ����ص� ������.
		 */
		
		int num1= 10;
		int num2= 20;
		int result= num1+num2;
		
		Integer num3= 10;
		Integer num4= 20;
		// �⺻ ������ type ���� ����ϰ� ������� ����
			//��ü���� ���� �ѵ� �⺻ ������ type ������ �ᵵ ������. �Ű澵 �� ����
			//���� �̰��� type �� ��ü���̱��� �̰͸� �˸� ��
		int result2= num3+num4;
		Integer result3= num3+num4;
	}
}