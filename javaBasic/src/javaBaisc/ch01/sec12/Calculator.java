package javaBaisc.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String name = "ȫ�浿";
		
			
		   int basicPay=50000; //�޿�
		   String phoneNumber = "010-3333-4444"; //��ȭ��ȣ
		   String accountNumber = "���� 123-1111-1234"; //���¹�ȣ
		   String dept = "�˹ٻ�"; //����
		   boolean sex = true; //���� ����
		   double tex = 0.03; //���� ����
		   
		   System.out.println("1�� �˹� ���� : "+ name + "  " + basicPay + "  " + phoneNumber);
		   System.out.println(accountNumber + "  " + dept + "  " + sex + "  " + tex);
		   
	
		  // TODO Auto-generated method stub
				  
		   String name2 = "�̼���";
				
					
				   
		   int basicPay2=20000; //�޿�
		   String phoneNumber2 = "010-2222-4444"; //��ȭ��ȣ
		   String accountNumber2 = "�츮 321-32-7878"; //���¹�ȣ
		   String dept2 = "������"; //����
		   boolean sex2 = true; //���� ����
		   double tex2 = 0.02; //���� ����
				   
		   System.out.println("2�� �˹� ���� : "+ name2 + "  " + basicPay2+ "  " + phoneNumber2);
		   System.out.println(accountNumber2 + "  " + dept2 + "  " + sex2 + "  " + tex2);
		
		   
		   
		   String name3 = "�̹���";
			
			
		   
		   int basicPay3=15000; //�޿�
		   String phoneNumber3 = "010-987-7456"; //��ȭ��ȣ
		   String accountNumber3 = "���� 123-555-7878"; //���¹�ȣ
		   String dept3 = "����"; //����
		   boolean sex3 = false; //���� ����
		   double tex3 = 0.015; //���� ����
				   
		   System.out.println("3�� �˹� ���� : "+ name3 + "  " + basicPay3+ "  " + phoneNumber3);
		   System.out.println(accountNumber3 + "  " + dept3 + "  " + sex3 + "  " + tex3);
		   
		   
		   String name4 = "������";
			
			
		   
		   int basicPay4=10000; //�޿�
		   String phoneNumber4 = "010-8744-3334"; //��ȭ��ȣ
		   String accountNumber4 = "���� 555-65-8989"; //���¹�ȣ
		   String dept4 = "����"; //����
		   boolean sex4 = false; //���� ����
		   double tex4 = 0.025; //���� ����
				   
		   System.out.println("4�� �˹����� : "+ name4 + "  " + basicPay4 + "  " + phoneNumber4);
		   System.out.println(accountNumber4 + "  " + dept4  + "  " + sex4 + "  " + tex4);

		   
		   String name5 = "�ּ���";
			
			
		   
		   int basicPay5=9800; //�޿�
		   String phoneNumber5 = "010-333-7777"; //��ȭ��ȣ
		   String accountNumber5 = "īī�� 777-454-1231"; //���¹�ȣ
		   String dept5 = "��������"; //����
		   boolean sex5 = false; //���� ����
		   double tex5 = 0.005; //���� ����
				   
		   System.out.println("5�� �˹����� : "+ name5 + "  " + basicPay5+ "  " + phoneNumber5);
		   System.out.println(accountNumber5 + "  " + dept5 + "  " + sex5 + "  " + tex5);

	      
	       int sum1 = 10 * basicPay;
	       
	       double texCal = sum1 * tex; //�̰��� ���� ����	   
	       
	       //�Ǽ��ɾ��� ����Ѵ�/
	       double salary = sum1 - texCal;
	    		   
	       System.out.println( sum1 +  "  " + texCal + "  " + salary );
	       
	       
           
	       int sum2 = 10 * basicPay;
	       
	       double texCal2 = sum2 * tex2; //�̰��� ���� ����	   
	       
	       //�Ǽ��ɾ��� ����Ѵ�/
	       double salary2 = sum2 - texCal2;
	    		   
	       System.out.println( sum2 +  "  " + texCal2 + "  " + salary2 );
	
	
           
	       int sum3 = 10 * basicPay;
	       
	       double texCal3 = sum3 * tex3; //�̰��� ���� ����	   
	       
	       //�Ǽ��ɾ��� ����Ѵ�/
	       double salary3 = sum3 - texCal3;
	    		   
	       System.out.println( sum3 +  "  " + texCal3 + "  " + salary3 );
	}


}


