package javaBaisc3.ch06.sec07;

public class MemberService {


		boolean login( String id, String password) {
			if( id.equals("Hong") && password.equals("12345"))
				return true;
			else return false;
			
		};
		
		void logout (String id) {
			System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�");
			
			
		};
		


}
