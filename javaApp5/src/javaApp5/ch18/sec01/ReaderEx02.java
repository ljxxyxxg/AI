package javaApp5.ch18.sec01;

import java.io.*;

public class ReaderEx02 {
	//주스트림 모든 파일 가능 : 자바로 입력 가능 FileInputStream FileOutputStream    문자만 가능 Reader Writer
	//보조스트림 
	public static void main(String[] args) {
		
	try {
		
		char[] cArr = new char[100];
		Reader r = new FileReader("D:\\a1\\study\\JAVA study\\data\\test3.txt");
		while( true ) {
		int data = r.read( cArr );
		if( data == -1) break;
		for( int i=0; i<data; i++) {
			System.out.print( (char)cArr[i] );//데이터 출력하기
		
			}
		
		}
		r.close();
		
		Writer w = new FileWriter("D:\\a1\\study\\JAVA study\\data\\test5.txt");
				
				w.write("abcdef");
				w.write(65); //65는 유니코드로 대문자 A를 말함 즉, 유니코드 값 65를 써준다.
				
				w.flush();
				w.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
