package javaBasic5.ch08.sec02;


//������ �߻�޼ҵ�� �����Ѵ�.
public interface RemoteControl {
	
	//��� = ������ �ʴ� ��, ������ �ٲ��� ���ϴ� ��
	
	final static int MAX_VOLUM = 10; //�������̽��� ����� �Է°���
	final static int MIN_VOLUM = 0;
	
	//�߻�޼ҵ� ���� abstract ������ �� �ִ�.
	void turnOn();
	void turnoff();
	void setVolume(int volume);
	//void qrRead();
	
	//�ڹٰ� ������ �Ǹ鼭 �߰� �� �޼ҵ��
	//����Ʈ�޼ҵ�
	
	default void defaultM( ) {
		int sum = 0;
		System.out.println("QR�ڵ� �Է� �ޱ�");
		for(int i=0; i<10; i++) {
			sum += privateM(i);
		}
		
		System.out.println(sum);
	}
	
	
	//�����޼ҵ�
	
	static void staticM( ) {
		
		System.out.println("īī���� �����ޱ�");
		
	}
	
	//private �޼ҵ� �������̽������� ����� �� �ִ� �޼ҵ�
	private int privateM(int i ) {
		return i+10;
	}
	
	//private �޼ҵ�
	
	
	
	
	

	
	
	
	
	
}
