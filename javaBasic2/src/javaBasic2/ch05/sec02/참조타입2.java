package javaBasic2.ch05.sec02;

public class ����Ÿ��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AŬ������ ���޸𸮿� �ø����� �������� aAddr
		A aAddr = new A(); // 5���� ����
	
		//ȫ�浿 �Է�
		aAddr.name = "ȫ�浿";
		aAddr.kor = 100;
		//5���� �ּҾȿ� �ִ� ������ �ּҿ� 100���Է�
		aAddr.avg = 3.5;
	
		A aAddr2 = new A();
		//new�� �ݺ��ҽ� �ι� ����
		
		System.out.println( aAddr == aAddr2 ); //����� false 10������ ���� 
		
		
		A aAddr3 = aAddr2; //10������ aAddr3�̶�� ������ �־��
		System.out.println( aAddr3 == aAddr2 );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
