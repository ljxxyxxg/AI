package javaApp5.ch18.sec03;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) throws Exception {
		
		
		File dir = new File("D:\\a1\\study\\JAVA study\\data\\def\\abc");
		File file1 = new File("D:\\a1\\study\\JAVA study\\data\\file1.txt");
		File file2 = new File("D:\\a1\\study\\JAVA study\\data\\file2.txt");
		File file3 = new File("D:\\a1\\study\\JAVA study\\data\\file3.txt");
		
		if( dir.exists()==false) {dir.mkdirs();} //�ش� ��ο� ���� ������(���丮)�� ��� ����� �ش�.
		if( file1.exists()==false) { file1.createNewFile(); };
		if( file1.exists()==false) { file1.createNewFile(); };
		if( file1.exists()==false) { file1.createNewFile(); };
		

	}

}
