package javaBaisc3.ch06.sec12;

public class Calculator {
	
	//�޼ҵ� ���� ~�Ѵ�, ~�ϱ� ����, ���ڱ�, ���, ����ϱ�
	//���� [ ���������� ] ����Ÿ�� �޼ҵ�� ([�Ű�����..]) { }
	//���Ŀ��� [ ] �������� ... ������
	
	
	//void �������� �ʴ´�
	
	void powerOn() {
		System.out.println("������ �մϴ�.");
		
		
	};
	
	void poweroff() {
		
		System.out.println("������ ���ϴ�.");
		
	};
	
	
	int plus (int x, int y, int z) {
		int result = x+y+z;
		return result;
		
		
	};
	
	int plus (int x, int y) {
		int result = x+y; //result int �� �ٸ� ������� ���� �Ҹ�
		return result; //return�� �޼ҵ带 ȣ���� ���� ���� result ���� �ǵ��� �־��
		
		
	};
	
	double divide(int x, int y) {
		double result = (double) x / (double ) y; //���� result�� �ٸ� ����
		return result;
		
		
	};
	
	
	

}
