package javaBaisc3.ch06.sec14;

public class Account {
	
	String 계좌번호;
	String 계좌주;
	int 초기입금액;
	int 잔고;
	
	//생성자 생성
	public Account() {
		
	};

	public Account(String 계좌번호, String 계좌주, int 초기입금액, int 잔고) {
	
		this.계좌번호 = 계좌번호;
		this.계좌주 = 계좌주;
		this.초기입금액 = 초기입금액;
		this.잔고 = 잔고;
		
	}

	public String get계좌번호() {
		return 계좌번호;
	}

	public void set계좌번호(String 계좌번호) {
		this.계좌번호 = 계좌번호;
	}

	public String get계좌주() {
		return 계좌주;
	}

	public void set계좌주(String 계좌주) {
		this.계좌주 = 계좌주;
	}

	public int get초기입금액() {
		return 초기입금액;
	}

	public void set초기입금액(int 초기입금액) {
		this.초기입금액 = 초기입금액;
	}

	public int get잔고() {
		return 잔고;
	}

	public void set잔고(int 잔고) {
		this.잔고 = 잔고;
	};
	
	
	
	
	
	
	
	
	
	
	
	
	

}
