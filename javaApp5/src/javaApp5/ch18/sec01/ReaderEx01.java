package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		// �Է� ��Ʈ��
		try {
			InputStream is = new FileInputStream("D:\\a1\\study\\JAVA study\\data\\��ũ��.jpg");
			OutputStream os = new FileOutputStream("D:\\a1\\study\\JAVA study\\data\\��ũ��_copy.jpg");
			
	
			while(true ) {
			int data = is.read();			 // 1byte�� �д´�.
			if(data == -1 )break;            // -1�� ������ ���̶�� �ǹ�
				os.write(data);
			
			}
			
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
