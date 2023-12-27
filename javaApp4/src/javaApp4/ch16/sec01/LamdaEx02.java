package javaApp4.ch16.sec01;

public class LamdaEx02 {

	public static void main(String[] args) {
		//"����" ----> ������б� "��õ" ----->��õ���б�

		//��� 1 : colleage<String> s1 = (name) -> { return name + "���б�"; };
		//��� 2 : colleage<String> s1 = (name) -> name + "���б�";
		colleage<String> s1 = name -> name + "���б�"; //�Ű����� ���� 1���̸� ()�� ����
		System.out.println(s1.cName("����"));
		System.out.println(s1.cName("��õ"));
	
		//��� �缼��. �� �缼��
		Fruit<String> s2 = name -> name + "�缼��";
		System.out.println(s2.fName("���"));
		System.out.println(s2.fName("��"));
		
		//3000�� �̻��̸� ��ο�. �̸��̸� �ο�
		Money<Integer> s3 = name -> {
		 if(name >= 2000) return name + 10000;
		 else return name - 5000;
		};
	
		System.out.println(s3.mName(2000));
		System.out.println(s3.mName(5000));
	}

}

@FunctionalInterface
interface colleage<T> {
	T cName( T name );
	
}

@FunctionalInterface
interface Fruit<T> {
	T fName( T name);
}

@FunctionalInterface
interface Money<T> {
	T mName(T name);
}