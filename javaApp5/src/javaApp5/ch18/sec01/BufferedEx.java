package javaApp5.ch18.sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedEx {

	public static void main(String[] args) {
		// ������� ������ ���� �ְ� ���� ��� Buffered ~ ���� ��Ʈ�� Ŭ������ ����Ѵ�.
		
		
		try {
			InputStream is = new FileInputStream("D:\\a1\\study\\JAVA study\\data\\test3.txt");
			 BufferedInputStream bis = new BufferedInputStream(is); //������Ʈ��
			 
			 OutputStream os = new FileOutputStream("D:\\a1\\study\\JAVA study\\data\\test3.txt");
			 BufferedOutputStream bos = new BufferedOutputStream(os);
			 
			 
			 long startTime = System.nanoTime();
			 
			 while( true ) {
				int data = bis.read();
				if(data == -1) break;
				bos.write(data);
			 }
				
				long stopTime = System.nanoTime();
				
			 
			 bos.flush();
			 bos.close();
			 os.close();
			 bis.close();
			 is.close();
			 
			 System.out.println("���� �а� ���µ� �ɸ� �ð���? (������)" + (stopTime - startTime));
			 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
