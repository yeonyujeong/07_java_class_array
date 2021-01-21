package step7_01.classArray;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {

		int[] arr = new int[10];
	
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println(Arrays.toString(arr));
		
		arr[0] = 0;
		arr[1] = 0;
		System.out.println(Arrays.toString(arr));
		
		arr = null;
		
		
	}

}
