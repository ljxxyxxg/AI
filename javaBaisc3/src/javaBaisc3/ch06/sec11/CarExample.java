package javaBaisc3.ch06.sec11;

public class CarExample {

	public static void main(String[] args) {
		// Car Ŭ���� ��üȭ
	Car myCar = new Car();
	
	System.out.println("ȸ���: " + myCar.model);
	System.out.println("�õ�����: " + myCar.start);
	System.out.println("����ӵ�: " + myCar.speed);
	
	//�ʵ尪 ����
	myCar.speed = 60;
	System.out.println("������ �ӵ�: " + myCar.speed );
	
	//�����ڷ� �ʵ忡 �� �ֱ�
	Car sCar = new Car("�Ｚ�ڵ���", "sm3", "���", 370, 0);
	System.out.println("�𵨸�");
	

	System.out.println("ȸ���: " + sCar.company);
	System.out.println("�𵨺�: " + sCar.model);
	System.out.println("����ӵ�: " + sCar.speed);	
	
	//�ʵ� ���� 
	sCar.speed = 100;
	System.out.println("�Ｚ �ڵ��� ������ �ӵ�: " + sCar.speed);
	
	
	Car car3 = new Car();
	car3.setCompany("�����ڵ���");
	car3.setModel("BMW");
	car3.setMaxSpeed(300);
	car3.setcolor("������");
	car3.setSpeed(0);
	
	System.out.println("ȸ���: " + car3.getcompany());
	System.out.println("�𵨺�: " + car3.getModel(0));
	System.out.println("����: " + car3.getColor(0));	
	System.out.println("�𵨺�: " + car3.getMaxSpeed(0));
	System.out.println("����ӵ�: " + car3.getSpeed());	
	
	
		

	}

}
