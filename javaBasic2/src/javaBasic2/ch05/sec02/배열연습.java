package javaBasic2.ch05.sec02;

public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// �迭 : ������ �ڷ���� ����, �����ؼ� ����Ǿ� �ִ�.
		// �迭 ���� ���� : ���� 100���� ����ؾ� �Ѵٸ� ���� 100���� �������� �迭�� �����Ѵ�.
		// �迭 ����� ���? 1���� 2���� 3����
		 int[] arr = new int[] {1,2,3,4,5};
		 String[] sArr   = new String[] {"a","b"};
		 double[] dArr = new double[] {1.1, 2.2, 3.3}; 
		 boolean[] bArr = new boolean[] {true, false};
		
		  byte[] by = new byte[] {1,2,3};
		  short[] sr = new short[] {6,7};
		 float[] fl = new float[] {1.1f,2.2f};
		
		 
		 
		 //arr�迭�� [0]�� �� 1�� ����Ϸ���
		 System.out.println(arr[0]);
		 //"b"�� ����ϱ�
		 System.out.println(sArr[1]);
		 //3.3 ���
		 System.out.println(dArr[2]);
		 
		 //arr �迭�� [0]�� �� 1�� 10���� ����
		 arr[0] = 10;
		 
		 //���2) �� �迭�� ����� ���߿� �� �ֱ�
		 int[] intArr = new int[3];
		 double[] doubleArr2 = new double[5];
		 
		 intArr[0] = 3;
		 intArr[1] = 5;
		 intArr[2] = 7;
		 
		 //���ڿ� 4���� �ִ� �� �迭 �����
		 //������ "a","b","c","d",�� �־��ֱ�
		 String[] sg = new String[4];
		 
		 sg[0] = "a";
		 sg[1] = "b";
		 sg[2] = "c";
		 sg[3] = "d";
		
		 
		 int[] intArr3 = new int[100];
		 for( int i=0; i<100; i++) {intArr3[i] = i+1;}
		 for(int i=0; i<100; i++) {System.out.println(intArr3[i]);}
		 
		 int[] intArr10 = null; //null���� �ּҰ� �ȵ�� ���� ������
		 
		/* //p.166
		 int[] score = new int[] {100, 90, 87, 90, 100};
		 //int sum = 0;
		 for(int i = 0; i<5; i++ ) { sum += score[i];};
		 int avg = sum/5;
		 System.out.println("�հ�� " + sum);
		 System.out.println("����� " + avg);
		 
		 //�迭�� ���� �迭��.length
		 System.out.println(score.length);
		 

		 //score[5]=60;
		 //score[6]=90;*/
		 
		
		
		
		
		
		
		String[] season = { "Spring", "Summer" , "Fall" , "Winter"};
		
		System.out.println("season[0] :  " + season[0]);
		System.out.println("season[1] :  " + season[1]);
		System.out.println("season[2] :  " + season[2]);
		System.out.println("season[3] :  " + season[3]);
		
	
		season[1] = "����";
		System.out.println("season[1] :  " + season[1]);
		System.out.println();
		
		//int[] scores = new int[] { 83, 90, 87};
		//int[] scores = { 83, 90, 87}; //���� ���İ� ���� new int[] ����
		
		
		int sum = 0;
		//for(int i=0; i<3; i++) {sum += scores[i]; }
		
		 System.out.println("�հ�� " + sum);
		 double evg = (double) sum / 3;
		 System.out.println("����� " + evg);
		
		 String[] names = new String[30];
		 
		 //���޸� �����ȿ� �ڷ����� �⺻������ �ڵ� ���õ�
		 // ���ø޸� ������ �ʱⰪ�� �ڵ����� �ȵ�. �����ڰ� �ʱⰪ �־��־����
		
		 String[] names2 = {"ȫ�浿", "�����" ,"�̰���"};
		 int[] scores2 = {100, 95, 85};
		 
		 for( int i=0; i< names2.length ; i++) {System.out.println(names2[i]+"" + scores2[i]);}
		 
		 
		String[] names3 = {"������" , "���� �Ѿ�" , "�ε���" ,"�Һο���" , "��ȯ�Ⱓ9(��)" , "�����Ա�"	}
		String[] names4 = {"��Ÿ��" , "�ڶ���"}
		
		int[] scores3 = {35000000, 15000000,
		
		
		
		
	}

}
