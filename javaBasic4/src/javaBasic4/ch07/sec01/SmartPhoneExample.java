package javaBasic4.ch07.sec01;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//���� �︳�ϴ�
		Phone p = new Phone();
		p.bell();
		
		p.sendVoice("�� ���!");
		p.receiveVoive("�� ��� �ʵ� �� ���?");
		
		SmartPhone sp = new SmartPhone();
		sp.sendVoice("���� ���� �ž�?");
		sp.receiveVoive("������ �����Ұž�");
		sp.hangUp();
		
		SmartPhone sp2 = new SmartPhone("������", "���" );
		//������ ����ϱ�
		System.out.println(sp2.model);
		sp2.setWifi(false);
		if(sp2.wifi) {
			System.out.println(sp2.model + "�� �������̰� �˴ϴ�.");
		} else {
			System.out.println(sp2.color + "�ڵ����� �������̰� �ȵ˴ϴ�.");
		}
		//�������� ����̰� ���� �︳�ϴ�.
		//�������� �޼����� �Խ��ϴ�. "�ڱ� : �ڵ��� ���?"
		
		System.out.print(sp2.model + "�� " + sp2.color + "�̰�");
		sp.bell();
		
		System.out.println(sp2.model + "�� �޼����� �Խ��ϴ�");
		sp2.sendVoice("�ڵ��� ���?");
		
		//�θ�Ŭ�������� wifi �ʵ� ��G�ϱ�
		//�θ� Ŭ�������� �ڽ��� ������� �� �� ����.
//		p.wifi = true;
//		
//		p.setwifi(true);
//		
//		p.internet();

	};

}
