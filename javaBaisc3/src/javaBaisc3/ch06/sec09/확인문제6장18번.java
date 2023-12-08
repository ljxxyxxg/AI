package javaBaisc3.ch06.sec09;

public class 확인문제6장18번 {

	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		System.out.println(obj1);
		System.out.println(obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
			
		}else {
			System.out.println("다른 ShopService 객체입니다.");
			
			
		};
		
	//1. 생성자는 private입니다. 2. 필드는 객체화해서 생성자의 주소를 저장하고 private 합니다.
	//3. 메소드인 getInstance()에서 리턴값을 생성자의 주소입니다. 접근제한자는 public입니다.	
		
		
	}

}
