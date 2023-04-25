package main;

import java.util.Scanner;

import controller.DeptDeleteController;
import controller.DeptInsertController;
import controller.DeptInsertController2;
import controller.DeptListController;
import controller.DeptSearchController;
import controller.DeptUpdateController;
import controller.FrontController;

public class DeptManagerMain {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		FrontController fc = new FrontController();
		
		// Controller:view -> Service -> Dao -> service -> Controller:view
		
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 검색");
			System.out.println("3. 부서 입력");
			System.out.println("4. 부서 수정");
			System.out.println("5. 부서 삭제");
			System.out.println("6. 프로그램 종료");
			
			int menu = Integer.parseInt(sc.nextLine());
			if(menu==6) {
				System.out.println();
				System.out.println("프로그램 종료");
				return;
			}
			fc.menu.get(menu).process();
			
			
//			switch (menu) {
//			case 1:
//				DeptListController.getInstance().process();
//				break;
//				
//			case 2:
//				DeptSearchController.getInstance().process();
//				break;
//				
//			case 3:
//				DeptInsertController2.getInstance().process();
//				break;
//				
//			case 4:
//				DeptUpdateController.getInstance().process();
//				break;
//			
//			case 5:
//				DeptDeleteController.getInstance().process();
//				break;
//				
//			case 6:
//				System.out.println();
//				System.out.println("프로그램 종료");
//				return;
//			}

		}
		
	}

}
