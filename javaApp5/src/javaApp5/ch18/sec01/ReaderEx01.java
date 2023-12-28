package javaApp5.ch18.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderEx01 {

	public static void main(String[] args) {
		// 입력 스트림
		try {
			InputStream is = new FileInputStream("D:\\a1\\study\\JAVA study\\data\\핑크퐁.jpg");
			OutputStream os = new FileOutputStream("D:\\a1\\study\\JAVA study\\data\\핑크퐁_copy.jpg");
			
	
			while(true ) {
			int data = is.read();			 // 1byte씩 읽는다.
			if(data == -1 )break;            // -1은 데이터 끝이라는 의미
				os.write(data);
			
			}
			
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
