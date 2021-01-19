// 2021. 1. 19	2:05 - 2:15

package step7_01.classArray;

import java.util.Scanner;

class User2 {
	
	String id;
	int money;
	
}


public class ClassArrayEx05_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int MAX_NUM = 100;
		User2[] user2 = new User2[MAX_NUM];
		
		for (int i = 0; i < MAX_NUM; i++) {
			user2[i] =  new User2();
		}
		
		int usrCnt = 0;
		
		while(true) {
			
			System.out.print("1.회원가입");
			System.out.print("2.탈퇴");
			System.out.print("3.출력");
			System.out.print("4.종료");
			int sel =scan.nextInt();
			System.out.println();
			
			if(sel == 1) {
				System.out.print("이름을 입력하세요 : ");
				user2[usrCnt].id = scan.next();
				System.out.print("금액을 입력하세요 : ");
				user2[usrCnt].money = scan.nextInt();
				usrCnt++;
				System.out.println();
			}
			
			else if(sel == 2) {
				if(usrCnt == 0) {System.out.println("탈퇴할 아이디가 없습니다."); continue;}
				System.out.print("인덱스를 입력하세요 : ");
				int idx = scan.nextInt();
				
				for (int i = idx; i < usrCnt; i++) {
					user2[i] = user2[i+1];
					usrCnt--;
				}
				System.out.println();
			}
			
			else if(sel == 3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(user2[i].id + ":" + user2[i].money);
				}
				System.out.println();
			}
			else if(sel == 4) {
				System.out.println("종료");
				break;
			}
			
			
			
			
			
			
		}
		
		
		scan.close();

	
		
	}

}
