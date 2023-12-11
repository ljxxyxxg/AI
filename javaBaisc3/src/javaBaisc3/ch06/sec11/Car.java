package javaBaisc3.ch06.sec11;

public class Car {

	String model = "그랜저";
	String company ="현대자동차";
	
	boolean start = true;
	
	public Car(String model, String company, boolean start, int speed, int maxspeed,) {
		super();
		this.model = model;
		this.company = company;
		this.start = start;
		this.speed = speed;
		
	}
	
	public Car(String model, String company, boolean start, int speed, String color) {
		super();
		this.model = model;
		this.company = company;
		this.start = start;
		this.speed = speed;
	
	
	
	
	public Car(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public Car() {
		this("현대자동차","소나타");
	}
	public Car(String model, String company) {
		this("검정", 350, 0);
		this.model = model;
		this.company = company;
		
	}
	
	
	
	
	public Car(String color, int maxSpeed, int speed) {
		
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
}
