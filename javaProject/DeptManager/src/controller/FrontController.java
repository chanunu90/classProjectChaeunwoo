package controller;

import java.util.HashMap;
import java.util.Map;

public class FrontController {
	
	// 역할 : 모든 요청을 받아서 실행 Controller에 실행 요청
	// 실행 Controller 모두 가지고 있어야 한다!
	
	// 저장 키 => 사용자가 선택하는 번호 ,저장 데이터는 Controller의 구현체 
	public Map<Integer , Controller> menu;
//	Controller[] menus;
//	ArrayList<Controller> menus1;
	
	public FrontController() {
		// hashMap 생성
		menu = new HashMap<>();
		menu.put( 1 , DeptListController.getInstance()   );
		menu.put( 2 , DeptSearchController.getInstance() );
		menu.put( 3 , DeptInsertController2.getInstance());
		menu.put( 4 , DeptUpdateController.getInstance() );
		menu.put( 5 , DeptDeleteController.getInstance() );
	}
	
}
