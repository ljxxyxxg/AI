package javaBaisc3.ch06.sec09;

public class Ȯ�ι���6��18�� {

	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
			
		}else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
			
			
		};
		
	//1. �����ڴ� private�Դϴ�. 2. �ʵ�� ��üȭ�ؼ� �������� �ּҸ� �����ϰ� private �մϴ�.
	//3. �޼ҵ��� getInstance()���� ���ϰ��� �������� �ּ��Դϴ�. ���������ڴ� public�Դϴ�.	
		
		
	}

}
