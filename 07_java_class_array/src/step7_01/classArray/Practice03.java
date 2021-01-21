package step7_01.classArray;

import java.util.HashMap;

class Samsung {
	
	String name;
	String color;
	int price;
	
	Samsung(String name, String color, int price){
		this.name = name;
		this.color = color;
		this.price = price;

	}
	
}
public class Practice03 {
	public static void main(String[] args) {
	
		HashMap<String, Samsung> list = new HashMap<>();
		
		list.put("phone", new Samsung("galaxy1" , "white", 10000));
		list.put("watch", new Samsung("smart" , "black", 5000));
		list.put("earphone", new Samsung("buds" , "blue", 2000));
		
		System.out.println(list.size());
		System.out.println(list.keySet());
		System.out.println(list.get("phone").name);
		
		list.remove("watch");
		System.out.println();
		
		list.put("notebook", new Samsung("galaxybook" , "gray" , 35000));
		
		for (String key : list.keySet()) {
			System.out.println("name : " + list.get(key).name);
			System.out.println("color : " + list.get(key).color);
			System.out.println("price : " + list.get(key).price);
			System.out.println();
		}
		
		System.out.println(list.keySet());
		
		System.out.println(list.get("phone").price);
		
		
		
	}
}
