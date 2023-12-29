package javaApp5.ch18.sec02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ObjectStreamEx {

	public static void main(String[] args) {
		//Member Ŭ������ ���¸� ��Ʈ������ ���� �ܺη� ������
		 try {
//			OutputStream os = new FileOutputStream("D:\\a1\\study\\JAVA study\\data\\member3.dat");
//			BufferedOutputStream bos = new BufferedOutputStream(os);
//			ObjectOutputStream oos = new ObjectOutputStream(bos);//��ü�� ��Ʈ������ ������ִ� ���� ��Ʈ��
//			//ObjectOutputStream�� �Ϸ��� Member ��ü�� implements Seriallzable �ؾ��Ѵ�
//			
//			Member m1 = new Member("fall", "��ǳ��", 10);
//			
//			oos.writeObject(m1);
//			oos.flush();
//			oos.close();
			
			//�ܺ������� �о
			InputStream is = new FileInputStream("D:\\a1\\study\\JAVA study\\data\\member2.dat");
			// ����(�ӵ�) ��� ���Ѽ�
			BufferedInputStream bis = new BufferedInputStream(is);
			// ��Ʈ���� ��ü�� ����
			ObjectInputStream ois = new ObjectInputStream(bis);
			//�о�ͼ�
			Member iM = (Member) ois.readObject();
			//����غ���
			System.out.println( iM);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}

class Member implements Serializable { //������ȭ�� ��ü�� ������ȭ �Ҵ� Member ��ü�� �ʵ尡 �ٲ�� �ȵȴ�.�� serialVersionUID ����ڰ� ������ش�.
	
	private static final long serialVersionUID = -5413711528933648809L;
	
	
	String id;
	String name;
	int age;
	int point;
	
	
	public Member(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name + " " + age;
		
	}
	

	
	
}