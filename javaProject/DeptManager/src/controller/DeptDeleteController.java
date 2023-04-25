package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import main.DeptManagerMain;
import service.DeptDeleteService;
import service.DeptListService;
import service.DeptSearchService;
import service.DeptUpdateService;

public class DeptDeleteController implements Controller{

	DeptListService listService;
	DeptSearchService searchService;
	DeptDeleteService deleteService;
	
	private DeptDeleteController() {
		this.listService = DeptListService.getInstance();
		this.searchService = DeptSearchService.getInstance();
		this.deleteService = DeptDeleteService.getInstance();
	}
	
	private static DeptDeleteController controller = new DeptDeleteController();
	
	public static DeptDeleteController getInstance() {
		return controller;
	}
	
	
	public void process() {
		
		// 1. 사용자로부터 삭제할 부서번호를 받는다.
		int num = inputdeleteDept();
		// 2. 부서번호를 Service 전달해서 삭제요청 -> 삭제 결과 ( 0 or 1 )
		int result = deleteService.deleteDept(num);
		//dept = 부서번호 제외하고 싺다 다시 입력된 변수가 된다.
//		deleteService.deleteDept(inputdeleteDept());
		// 3. 삭제후 결과 출력
		printData(result);
		
	}
	
	private void printData(int result) {
		if(result>0) {
			System.out.println("삭제 되었습니다.");
		}else {
			System.out.println("삭제 실패 . (입력시 데이터를 확인후 입력해주세요.)");
		}
	}
	
	private int inputdeleteDept() {
		
		Dept dept = null;
		// 1. 수정하고자 하는 부서번호를 입력하세요.
		System.out.println("부서정보 삭제를 시작합니다.");
		//   전체리스트 출력
		System.out.println();
		
		List<Dept> list = listService.getDeptList();
		
		System.out.println("----------------------------------------------------------");
		for(Dept l : list) {
			System.out.println(l.getDeptno() + "\t" + l.getDname() + "\t" + l.getLoc());
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("삭제하고자 하는 부서번호를 입력하세요. >>>");
		
		// 사용자가 삭제할 부서번호를 입력
		int deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());
	
		
		return deptno;
	}
	
	public static void main(String[] args) {
		
		DeptDeleteController controller = new DeptDeleteController();
		int dept = controller.inputdeleteDept();
		System.out.println(dept);
		
	}		

}
