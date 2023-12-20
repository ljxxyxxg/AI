
package javaApp1.ch12.sec04;

import java.util.StringTokenizer;

public class StringTokenizerEx { //���Ⱥκ� - ���� , ���� �ڹ� ��� - ���� �м� ����(����) ����

	public static void main(String[] args) {
		String data1 = "ȫ�浿&�̼�ȫ, �ڿ���"; //���ȭ�� ȫ�浿 �̼�ȫ �ڿ���
		//���1) String Ŭ���� split() ���
		//���2) StringTokenizer Ŭ���� ���
		
		//���1
		String[] arr = data1.split("&|, ");
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		//���� for ��
		for(String i : arr) {
			System.out.println(i);
		}
		
		
		//���2
		String data2 = "ȫ�浿/�̼�ȫ/�ڿ���/�̼���/�ּ���";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	
		String data3 = "���-��-��-�ٳ���";
		StringTokenizer sr = new StringTokenizer(data3, "-");
		while(sr.hasMoreTokens()) {
			System.out.println(sr.nextToken());
		}
		
		
		String data4 = "�ڹ�*+���̽�*+����Ŭ*+�ټ��÷ξ�";
		StringTokenizer sa = new StringTokenizer(data4, " *+ ");
		while(sa.hasMoreTokens()) {
			System.out.println(sa.nextToken());
		}
		

	}

}
