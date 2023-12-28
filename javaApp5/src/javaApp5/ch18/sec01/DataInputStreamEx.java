package javaApp5.ch18.sec01;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("D:\\a1\\study\\JAVA study\\data\\p.db");
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF("홍길동"); //한글을 저장하려고
			dos.writeDouble(95.5);
			dos.writeInt(1);
			
			dos.writeUTF("김자반");
			dos.writeDouble(90.3);
			dos.writeInt(2);
			
			dos.flush();
			dos.close();
			
			InputStream is = new FileInputStream("D:\\a1\\study\\JAVA study\\data\\p.db");
			BufferedInputStream bis = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(is);
			
			String name = dis.readUTF();
			double score = dis.readDouble();
			int no = dis.readInt();
			System.out.println(name + " " + score + " " + no);
			
			
			name = dis.readUTF();
			score = dis.readDouble();
			no = dis.readInt();
			System.out.println(name + " " + score + " " + no);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
