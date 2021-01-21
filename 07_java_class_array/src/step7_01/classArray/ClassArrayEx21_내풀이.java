// 2021.1.21	1:30 - 1:46
package step7_01.classArray;

import java.util.ArrayList;

class Tv  {
	String name;
	String brand;
	int price;
	
	Tv(String name, String brand, int price){
		this.name = name;
		this.brand = brand;
		this.price = price;
		
	}
}

//////////////////////////////////////////////////////

class TvList {
	
	Tv[] arr;
	int elementCount;
	
	void add(Tv tv) {
		if(elementCount == 0) {
			arr = new Tv[elementCount + 1];
		}
		else  if(elementCount > 0) {
			Tv[] temp = arr;
			
			arr = new Tv[elementCount  + 1];
			for (int i = 0; i < elementCount; i++) {
				arr[i] = temp[i];
			}
		}
		arr[elementCount] = tv;
		elementCount++;
	}
	
	int size() {
		return elementCount;
	}
	
	void remove(int index) {
		if(elementCount == 1) {
			arr = null;
			elementCount = 0;
		}
		else if(elementCount > 1) {
			Tv[] temp = arr;
			arr = new Tv[elementCount - 1];
			int j = 0;
			for (int i = 0; i < elementCount; i++) {
				
				if(i != index) { arr[j++] = temp[i];}
			}
			
		}
		elementCount--;
	}
	
	Tv get(int index) {
		return arr[index];
	}
	
	
}

public class ClassArrayEx21_내풀이 {

	public static void main(String[] args) {
		
		ArrayList<Tv> list = new ArrayList<Tv>();
		
		list.add( new Tv("TV" ,  "삼성" , 1000) );
		
		Tv temp =  new Tv("시그니처TV" , "엘지" , 2000);
		list.add(temp);
		
		temp =  new Tv("스마트TV" , "애플" , 3000);
		list.add(temp);
		
		for (Tv tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		
		System.out.println("==============================================");
			
		TvList myList = new TvList();
		
		temp = new Tv("TV" , "삼성" , 1000);
		myList.add(temp);
		
		temp =  new Tv("시그니처TV" , "엘지" , 2000);
		myList.add(temp);
		
		temp =  new Tv("스마트TV" , "애플" , 3000);
		myList.add(temp);
		
		for (Tv tv : myList.arr) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		
		
	}

}
