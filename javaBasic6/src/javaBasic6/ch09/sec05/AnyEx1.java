package javaBasic6.ch09.sec05;

public class AnyEx1 {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.bM();
		
		
		//BŬ������ �ڽ�Ŭ������ �ʿ���. �ֳ��� bM()�������ؼ� ����Ϸ���
		 B bb = new B() {
			 
			 int b = 20;
			 
			 @Override
			void bM() {
				System.out.println("�ڽĸ޼ҵ� + b");
			}
			
			
		};
		
		bb.bM();
		//�θ�Ŭ������ new�ϰ� �ٷεڿ� { }�� �Ἥ �ڽ��� Ŭ������ ������ �� �ִ� ��
		
	}

}


class B {
	void bM() {
		System.out.println("�θ�޼ҵ�");
	}
	
}