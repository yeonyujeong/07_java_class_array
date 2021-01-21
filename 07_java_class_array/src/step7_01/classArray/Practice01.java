package step7_01.classArray;

class Fruit0 {
	
	private String red;
	private String yellow;
	
	void setRed(String red) {
		this.red = red;
	}
	
	String getRed() {
		return this.red;
	}
	
	void setYellow(String yellow) {
		this.yellow = yellow;
	}
	
	String getYellow() {
		return this.yellow;
	}
	
}
class Car {
	
	private int carNum;
	private String carName;
	
	void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	int getCarNum() {
		return this.carNum;
	}
	
	void setCarName(String carName) {
		this.carName = carName;
	}
	
	String getCarName() {
		return this.carName;
	}
	
}

class Dog {
	
	private String white;
	private String black;
	
	void setWhite (String white) {
		this.white = white;
	}
	
	String getWhite() {
		return this.white;
	}
	
	void setBlack(String black) {
		this.black = black;
	}
	String getBlack () {
		return this.black;
	}
	
	
	
}
	

public class Practice01 {

	public static void main(String[] args) {
		
		Fruit0 fruit = new Fruit0();
		
		fruit.setRed("apple");
		System.out.println(fruit.getRed());
		
		fruit.setYellow("banana");
		System.out.println(fruit.getYellow());
		
		Car c = new Car();
		
		c.setCarName("morning");
		c.setCarNum(8214);
		
		System.out.println(c.getCarName());
		System.out.println(c.getCarNum());
		
		Dog d = new Dog();
		
		d.setWhite("coco");
		d.setBlack("tan");
		System.out.println(d.getBlack());
		System.out.println(d.getWhite());
		
	}

}
