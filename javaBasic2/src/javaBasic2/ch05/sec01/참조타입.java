package javaBasic2.ch05.sec01;

import java.util.Scanner;

public class ����Ÿ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;// ���ð���
		
		Scanner sc = new Scanner(System.in); //new ���޸𸮿� ScannerŬ������ �÷��ּ���.
		//sc=Scanner��� �ּ��� ���� Ÿ��	
  	
		//���޸𸮿� �ּҸ� ���ð����� ������ �����ؾ��Ѵ�.
	
		System.out.println( n );
		
		//���� ���� �ڷ��� ������;
		Student st  = new Student();
		//Class�� �ڵ带 �ۼ� - ���赵 ----> ����Ϸ��� �޸𸮿� �÷� ����(new) �ڷ� ����ϱ�
		//new��ɾ� ���� ���޸𸮿� �ö� --> ���޸𸮿� �ö󰡸� �ּ� ���� ---> ���ð������� ���� ����(�ּҰ� ����ִ� ����)�� �����ϰ� �־� �־�� �Ѵ�.
		
		// Teacher Ŭ������ ����Ϸ��� ���޸𸮿� �÷��־���Ѵ�
		Teacher th = new Teacher();
		//Teacher ��� Ŭ������ th�� �ּ�
		
		
		//Person Ŭ������ ����� ���޸𸮿� �÷��ּ���.�ּҸ� per ������ �־��ּ���.
		Person per = new Person();
		//Person �̶�� Ŭ������ per�� �ּ�
	
		//Guide Ŭ������ ����� ���޸𸮿� �ø���
		Guide gud = new Guide();
		
		//Stuck Ŭ������ ����� ���޸𸮿� �ø���
		Stuck su = new Stuck();
	
	
	
	
	
	
	
	
	
	
	
	}

}
