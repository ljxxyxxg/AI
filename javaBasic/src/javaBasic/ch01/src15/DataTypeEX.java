package javaBasic.ch01.src15;

public class DataTypeEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub     
	   // �ڷ��� - �⺻��, ������
		
		
	   byte b1 = 30;
	   System.out.println( b1 );
	   
	   byte b2 = 10;
	   byte b3 = 20;
	   
	   int b23 = b2 + b3; // + ���ϱ� �����ڴ� int������ ó����  byte �� int �� byte ��
	   System.out.println( b23 );
	   
	   byte b4 = 20;
	   short s4= 30;
	   
	   int sumb4s4 = b4 + s4;
	   System.out.println( sumb4s4 );
	   
	   float f1 = 3.14f;
	   float f2 = 3.12345678f; // �Ҽ��� 7�ڸ����� ���
	   
	   System.out.println(f1 + "   " + f2);
	   
	   double d1 = 3.123456789012345; // 15�ڸ� ���� ��´�
	   System.out.println( d1 );
	   
	   //�Ǽ����� float : 4 byte �� double : 8 byte
	     //float�� �ڿ� f 
	     //double���� �Ǽ��� �⺻��
	   
	   float f3=10.23f;
	   float f4=2.45f;
	   float mulf3f4 = f3 * f4;
	   System.out.println( mulf3f4 );
	   
	   double resulf3f4d = f3 / f4; // float �ڷ����� double ������ ��ȯ (cast ����: �ڵ�����ȯ)
			
       int ii1 = 10;
       short ss1 = 20;
       
       float ff1 = ii1; // �Ǽ��� = ������
     
    
       //�Ǽ��� --> ������ 30�� ����Ʈ ---> 8�� ���� ������ ������. ������ �ս�
       //���� ������Ÿ�� ������ =(������ Ÿ��) �Ǽ��� ����
       
       double d10 = 3.14;
       int change10 = (int) d10; //�Ҽ��� .14�� �ս��Ѵ�
       System.out.println(d10 + "  " + change10);

       
       //����ȯ = ���� ����ȭ = down cast ���� ūŸ�� -> ����Ÿ������ �ٲ�
       //���� ������ Ÿ�� ������ =(������ Ÿ��) �Ǽ��� ����
       float f10 = 10.25f;
       byte changef10 = (byte) f10;
       
       int i10 = 3000;
       short chi10 = (short) i10;
       
       
       //�� ���������� ���� ���� ���� ���� �������� ���� ��������.
       int kor = 80;
       int mat = 90;
       int eng = 93;
       
       
       //�հ� ���ϱ�
       int sum1 = kor + mat + eng;
       
       //����ϱ�
       System.out.println("�հ��" + (sum1 / 3.0));
       // ���� / ���� �ϸ� ������ ���´�.
       //����� ���ϼ���
       double ave = sum1 / 3.0;
       double avg1 = (double)sum1 / 3;
       //���
      System.out.println("�����" + ave );      
      System.out.println("�����" + avg1 );
     
      
      
      //���� ������ �ŵ����� 80^2
      int matdouble = mat*mat;
      System.out.println("90 �ŵ�����" + mat*mat); 
      
      
      
      
      char ch1 = 'a';
      System.out.println((int) ch1);
      
      System.out.println( (char)ch1 + 3);
     // %c"�� ���������� ch1 + 3�� 100 �����ڵ� ���ڸ� ���������� ����ϱ�

     //Korea�� ����ϱ�
      System.out.printf("%c%c%c%c%c", 75, 111, 114, 101, 97 );
       
      
	}

}