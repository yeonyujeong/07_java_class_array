// 2021. 1. 22  12:43 - 1:16
package step7_01.classArray;

//# ArrayList 클래스의 기능을 직접 구현해보자!

class MyList {
	
	int[] arr;
	int elementCnt;
	
	void print() {
		
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(arr[i]);
			if(i != elementCnt - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	void add(int value) {
		if(elementCnt == 0) {
			arr = new int[elementCnt+1];
		}
		else if(elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt+1];
			for (int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[elementCnt] = value;
		elementCnt+=1;
	}
	
	void add(int index, int value) {
		int[] temp = arr;
		arr = new int[elementCnt + 1];
		int j = 0;
		for (int i = 0; i < elementCnt+1; i++) {
			if(i != index) {
				arr[i] = temp[j++];
			}
		}
		arr[index] = value;
		elementCnt += 1;
		temp = null;	
	}
	
	void remove(int index) {
		int[] temp = arr;
		arr = new int[elementCnt - 1];
		for (int i = 0; i < index; i++) {
			arr[i] = temp[i];
		}
		for (int i = index; i < elementCnt - 1 ; i++) {
			arr[i] = temp[i+1];
		}	
		elementCnt -= 1;
		temp = null;
	}
	
	int size() {
		return elementCnt;
	}
	
	int get(int index) {
		return arr[index];
	}
	
	void set (int index, int value) {	
		arr[index] = value;
	}
	
	void clear() {
		arr = null;
	}
	
	
}



public class ClassArrayEx22_풀어보기 {

	public static void main(String[] args) {

		// 직접 구현한 ArrayList
		MyList list = new MyList();

		// 추가하기
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.print();
		
		// 삽입하기
		list.add(2, 5);
	
		// 출력하기
		list.print();
		
		// (index로)삭제하기
		list.remove(2);
		list.print();
		
		// 길이 구하기
		System.out.println(list.size());

		// (index로)값 꺼내오기
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		// 특정 위치의 값 수정하기
		list.set(2, 50);
		list.print();
		
		// 모든 데이터를 제거하기
		list.clear();

	}

}
