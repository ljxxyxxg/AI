package javaApp5.ch18.sec01;

import java.io.*;

public class ReaderEx02 {
	//�ֽ�Ʈ�� ��� ���� ���� : �ڹٷ� �Է� ���� FileInputStream FileOutputStream    ���ڸ� ���� Reader Writer
	//������Ʈ�� 
	public static void main(String[] args) {
		
	try {
		
		char[] cArr = new char[100];
		Reader r = new FileReader("D:\\a1\\study\\JAVA study\\data\\test3.txt");
		while( true ) {
		int data = r.read( cArr );
		if( data == -1) break;
		for( int i=0; i<data; i++) {
			System.out.print( (char)cArr[i] );//������ ����ϱ�
		
			}
		
		}
		r.close();
		
		Writer w = new FileWriter("D:\\a1\\study\\JAVA study\\data\\test5.txt");
				
				w.write("abcdef");
				w.write(65); //65�� �����ڵ�� �빮�� A�� ���� ��, �����ڵ� �� 65�� ���ش�.
				
				w.flush();
				w.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
