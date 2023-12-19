package javaBasic6.ch09.sec05;

public class Any2Ex {

	public static void main(String[] args) {
		CImpl ci = new CImpl();
		ci.cM();
		
		C c12 = new CImpl(); //������
		c12.cM();
		
		//�͸�����ü
		C c13 = new C() {
			
			@Override
			public void cM() {
				System.out.println("�͸���Ŭ������ �޼ҵ�");
				
			}
			
		}; //�������̽��� new �� �� ����. new ��ü() {} -->�̰��͸��̴�.
		
		
		c13.cM();
	}

}


interface C {
	abstract void cM(); //�߻�޼ҵ�
	
}

class CImpl implements C {

	@Override
	public void cM() {
		System.out.println("����Ŭ���� (�ڽ�) �޼ҵ�");
		
	}
	
}