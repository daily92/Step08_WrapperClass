package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
		// �⺻ ������ type
		byte num1= 10;
			//num1. �غ��� �ƹ� �͵� �� �� 
			//=> ������ �ƴϹǷ�, �׳� ���� ����ְ�, field, method ����
		
		// ���� ������ type (��ü��)
			//Byte => Wrapper Class
			//�⺻ ������ type �� ���� ������ type ���� ������ 
		Byte num2= 10;
			//num2. �ϸ� �̰����� ��
			//heap ������ ��(10) ���� �⺻ ������ type �� wrapping �ؼ�
			//������(999) ����, �װ��� stack ������ num2 ������ ������(999)�� ����
			//new �� �ʿ� ���� �˾Ƽ� ��ü �������
		short num3= 11;
		Short num4= 11;
		
		int num5= 12;
		Integer num6= 12;
		
		long num7= 13;
		Long num8= 13l;  //�ڿ� ���ĺ� �ҹ��� l ���� ��!
		
		float num9= 14.1f;
		Float num10= 14.1f;
		
		double num11= 15.2;
		Double num12= 15.2;
		
		char ch1= '��';
		Character ch2= '��';
		
		boolean isWait= true;
		Boolean canRun= false;
	}
}
