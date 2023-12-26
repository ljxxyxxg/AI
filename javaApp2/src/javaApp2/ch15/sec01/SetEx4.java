package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
		// Board Ŭ������ ��üȭ �ϱ�
		Board b1 = new Board("ȫ�浿", "�ڹ�", "��ƴ�");
		Board b2 = new Board("�̼���", "���̽�", "����");
		Board b3 = new Board("ȫ�浿", "������", "���� �ȹ����");
		Board b4 = new Board("ȫ�浿", "������", "���� �ȹ����");
		Board b5 = new Board("�̼���", "�Ǵٽ�", "���� �ȹ����");
		
		//set ��üȭ �ϱ�
		Set<Board> bSet = new HashSet<Board>();
		
		bSet.add(b1);
		bSet.add(b2);
		bSet.add(b3);
		bSet.add(b4);
		bSet.add(b5);
		
		System.out.println(bSet.size());
		
		//��ü ����ϱ�
		Iterator<Board> it = bSet.iterator();
		while( it.hasNext()) {
			System.out.println(it.next().toString());
		
		}
	}

}


class Board {


String name;
String title;
String content;


public Board(String name, String title, String content) {
	super();
	this.name = name;
	this.title = title;
	this.content = content;
	
	
}

@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + title.hashCode();
	}


@Override
	public boolean equals(Object obj) {
		if( obj instanceof Board) {
			Board b = (Board) obj;
			if( title.equals(b.title) && ( name.equals(b.name)))
				return true;
		}
		
		return false;
	}







@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + title + " " + content;
	}
	
	
	
}


