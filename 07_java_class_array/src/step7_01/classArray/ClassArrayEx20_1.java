package step7_01.classArray;

import java.util.HashMap;

class Tv2 {
	
	String name;
	String brand;
	int price;
	
	Tv2(String name, String brand, int price){
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}


public class ClassArrayEx20_1 {

	public static void main(String[] args) {

		HashMap<String, Tv2> list = new HashMap<String, Tv2>();
		
		list.put("삼성", new Tv2("TV", "삼성" , 1000));
		list.put("엘지", new Tv2("시그니처TV", "엘지" , 2000));
		list.put("애플", new Tv2("스마트TV", "애플" , 3000));
		
		for (String key : list.keySet()) {
			System.out.println("[ key : " + key + " ]");
			System.out.println("name : " + list.get(key).name);
			System.out.println("brand : " + list.get(key).brand);
			System.out.println("price : " + list.get(key).price);
			System.out.println();
		}
		
		System.out.println(list.keySet());
		System.out.println();
		
		list.put("삼성", new Tv2("TVVV" ,  "삼성" , 5000));
		list.remove("엘지");
		list.put("메롱", new Tv2("에어팟" , "애플" , 321231));
		list.put("바보", new Tv2("에어팟" , null , 0));
		
		System.out.println(list);
		System.out.println();
		
		for (String key : list.keySet()) {
			System.out.println("[ key : " + key + " ]");
			System.out.println("name : " + list.get(key).name);
			System.out.println("brand : " + list.get(key).brand);
			System.out.println("price : " + list.get(key).price);
			System.out.println();
		}
		
		System.out.println(list.size());
		System.out.println(list.keySet());
		
		
	}

}
