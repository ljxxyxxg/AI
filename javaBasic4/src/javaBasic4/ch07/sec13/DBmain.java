package javaBasic4.ch07.sec13;

public class DBmain {

	public static void main(String[] args) {
		 Connect myConnect = new Connect();
		
		//오라클
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
	
	//필드를 선언하는데 부모 타입 필드를 선언
	DB db;
	
	public void dbRun() {
		db.runDb();
		
	}v
	
	
}