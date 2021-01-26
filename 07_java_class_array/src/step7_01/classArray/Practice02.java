package step7_01.classArray;

import java.util.ArrayList;

class Apple {
	
	String name;
	String color;
	int price;
	
	Apple(String name, String color, int price){
		this.color = color;
		this.name = name;
		this.price = price;
	}
	
}

public class Practice02 {

	public static void main(String[] args) {

		ArrayList<Apple> list = new ArrayList<>();
		
		list.add(new Apple("airpod" , "white" , 10000));
		list.add(new Apple("macbook" , "silver" , 300000));
		list.add(new Apple("watch" , "black" , 50000));
		
		for (Apple apple : list) {
			System.out.println("name  : " + apple.name);
			System.out.println("color : " + apple.color);
			System.out.println("price : " + apple.price);
			System.out.println();
		}
		System.out.println("=============================\n");
		
		list.set(2, new Apple("ipad" , "white", 2000));
		list.add(0, new Apple("iphone" , "green" , 6000));
		
		for (Apple apple : list) {
			System.out.println("name  : " + apple.name);
			System.out.println("color : " + apple.color);
			System.out.println("price : " + apple.price);
			System.out.println();
		}
		
		System.out.println(list.get(2).color);
		System.out.println(list.size());
		
		
		
	}

}
