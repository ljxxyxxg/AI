package javaBasic4.ch07.sec13;

public class DBmain {

	public static void main(String[] args) {
		 Connect myConnect = new Connect();
		
		//����Ŭ
	//myConnect.db = new Oracle();
	//myConnect.dbRun();
	
		//MySQL
	//myConnect.db = new MySql();
	//myConnect.dbRun();

	  myConnect.db = new MongoDB();
	  myConnect.dbRun(); 
		
	}

}

class Connect {
	
	//�ʵ带 �����ϴµ� �θ� Ÿ�� �ʵ带 ����
	DB db;
	
	public void dbRun() {
		db.runDb();
		
	}v
	
	
}