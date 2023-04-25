package controller;

import main.DeptManagerMain;
import service.DeptInsertService2;

public class DeptInsertController implements Controller{
		
		//Service
		private DeptInsertService2 insertService;
	
		private DeptInsertController() {
			this.insertService = new DeptInsertService2();
		}
		
		private static DeptInsertController controller = new DeptInsertController();
		
		public static DeptInsertController getInstance() {
			return controller;
		}
		
		public void insertDept() {
	
			// view : 검색할 부서번호 사용자로부터 받는 화면
			int deptno = getDeptNo();
			String dname = getDname();
			String loc = getLoc();
	
			// 처리 결과
			int dept = insertService.insertDept(deptno , dname  , loc);
			
			// 결과 View 지정
			printData(dept);
	
		}
		
		//결과를 출력하는 화면
		public void printData(int dept) {
			System.out.println("입력이 완료 되었습니다.");
		}
		//사용자로부터 번호를 입력받는 화면
		public int getDeptNo() {
			System.out.print("입력을 시작합니다.");
			System.out.print("부서를 입력하세요>>");
			
			String num = DeptManagerMain.sc.nextLine();
			
			return Integer.parseInt(num);
		}
		
		public String getDname() {
			System.out.print("이름을 입력하세요>>");
			
			String str = DeptManagerMain.sc.nextLine();
			
			return str;
		}
		
		public String getLoc() {
			System.out.print("지역을 입력하세요>>");
			
			String str = DeptManagerMain.sc.nextLine();
			
			return str;
		}

		@Override
		public void process() {
			// TODO Auto-generated method stub
			
		}
		
	

}
