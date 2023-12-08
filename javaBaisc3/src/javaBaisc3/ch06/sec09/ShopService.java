package javaBaisc3.ch06.sec09;

public class ShopService {
	
	
		
		private static ShopService shopService = new ShopService();
		
		private ShopService() {
						
			
			
			
		};
		
		public static ShopService getInstance() {
			return shopService;
			
			
			
			
			
		};
		
		
	

}
