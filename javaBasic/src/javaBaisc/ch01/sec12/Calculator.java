package javaBaisc.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String name = "홍길동";
		
			
		   int basicPay=50000; //급여
		   String phoneNumber = "010-3333-4444"; //전화번호
		   String accountNumber = "국민 123-1111-1234"; //계좌번호
		   String dept = "알바생"; //직급
		   boolean sex = true; //성별 남자
		   double tex = 0.03; //세금 비율
		   
		   System.out.println("1번 알바 정보 : "+ name + "  " + basicPay + "  " + phoneNumber);
		   System.out.println(accountNumber + "  " + dept + "  " + sex + "  " + tex);
		   
	
		  // TODO Auto-generated method stub
				  
		   String name2 = "이순신";
				
					
				   
		   int basicPay2=20000; //급여
		   String phoneNumber2 = "010-2222-4444"; //전화번호
		   String accountNumber2 = "우리 321-32-7878"; //계좌번호
		   String dept2 = "정직원"; //직급
		   boolean sex2 = true; //성별 남자
		   double tex2 = 0.02; //세금 비율
				   
		   System.out.println("2번 알바 정보 : "+ name2 + "  " + basicPay2+ "  " + phoneNumber2);
		   System.out.println(accountNumber2 + "  " + dept2 + "  " + sex2 + "  " + tex2);
		
		   
		   
		   String name3 = "이민정";
			
			
		   
		   int basicPay3=15000; //급여
		   String phoneNumber3 = "010-987-7456"; //전화번호
		   String accountNumber3 = "신한 123-555-7878"; //계좌번호
		   String dept3 = "팀장"; //직급
		   boolean sex3 = false; //성별 여자
		   double tex3 = 0.015; //세금 비율
				   
		   System.out.println("3번 알바 정보 : "+ name3 + "  " + basicPay3+ "  " + phoneNumber3);
		   System.out.println(accountNumber3 + "  " + dept3 + "  " + sex3 + "  " + tex3);
		   
		   
		   String name4 = "정현희";
			
			
		   
		   int basicPay4=10000; //급여
		   String phoneNumber4 = "010-8744-3334"; //전화번호
		   String accountNumber4 = "국민 555-65-8989"; //계좌번호
		   String dept4 = "사장"; //직급
		   boolean sex4 = false; //성별 여자
		   double tex4 = 0.025; //세금 비율
				   
		   System.out.println("4번 알바정도 : "+ name4 + "  " + basicPay4 + "  " + phoneNumber4);
		   System.out.println(accountNumber4 + "  " + dept4  + "  " + sex4 + "  " + tex4);

		   
		   String name5 = "최수연";
			
			
		   
		   int basicPay5=9800; //급여
		   String phoneNumber5 = "010-333-7777"; //전화번호
		   String accountNumber5 = "카카오 777-454-1231"; //계좌번호
		   String dept5 = "비정규직"; //직급
		   boolean sex5 = false; //성별 여자
		   double tex5 = 0.005; //세금 비율
				   
		   System.out.println("5번 알바정도 : "+ name5 + "  " + basicPay5+ "  " + phoneNumber5);
		   System.out.println(accountNumber5 + "  " + dept5 + "  " + sex5 + "  " + tex5);

	      
	       int sum1 = 10 * basicPay;
	       
	       double texCal = sum1 * tex; //이것은 에러 난다	   
	       
	       //실수령액을 계산한다/
	       double salary = sum1 - texCal;
	    		   
	       System.out.println( sum1 +  "  " + texCal + "  " + salary );
	       
	       
           
	       int sum2 = 10 * basicPay;
	       
	       double texCal2 = sum2 * tex2; //이것은 에러 난다	   
	       
	       //실수령액을 계산한다/
	       double salary2 = sum2 - texCal2;
	    		   
	       System.out.println( sum2 +  "  " + texCal2 + "  " + salary2 );
	
	
           
	       int sum3 = 10 * basicPay;
	       
	       double texCal3 = sum3 * tex3; //이것은 에러 난다	   
	       
	       //실수령액을 계산한다/
	       double salary3 = sum3 - texCal3;
	    		   
	       System.out.println( sum3 +  "  " + texCal3 + "  " + salary3 );
	}


}



