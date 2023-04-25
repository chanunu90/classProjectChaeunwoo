package controller;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptInsertService;

public class DeptInsertController2 implements Controller {

	DeptInsertService deptInsertService = null;
	
	private DeptInsertController2() {
		deptInsertService = DeptInsertService.getInstance();
	}
	
	private static DeptInsertController2 controller = new DeptInsertController2();
	
	public static DeptInsertController2 getInstance () {
		return controller;
	}
	
		
	public void process() {
		// 1. 사용자 입력 처리 -> Dept 타입의 객체를 반환
		Dept dept = inputDept();
		// 2. Dept 객체를 Service로 전달 = > 결과 반환(1 or 0)
		int result = 0;
		try {
			result = deptInsertService.insertDept(dept);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 3. 결과를 출력하는걸 만듬
		printData(result);
	}
		
	
	private void printData(int result) {
		if(result>0) {
			System.out.println("입력되었습니다.");
		}else{
			System.out.println("입력 실패.(입력값을 확인해주세요.)");
		}
	}

	//사용자 입력 처리 화면(View)
	private Dept inputDept() {
		
		
		System.out.println("부서 정보 입력을 시작합니다");
		System.out.println("부서 번호를 입력하세요.>>");
		
		int deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());
		System.out.println("부서 이름을 입력하세요 .>>>");
		String dname = DeptManagerMain.sc.nextLine();
		System.out.println("부서 위치를 입력하세요 .>>>");
		String loc = DeptManagerMain.sc.nextLine();
		
		
		
		
		return new Dept( deptno , dname , loc);
		
		
		
	}
}
