package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import main.DeptManagerMain;
import service.DeptListService;
import service.DeptSearchService;
import service.DeptUpdateService;

public class DeptUpdateController implements Controller {

	DeptListService listService;
	DeptSearchService searchService;
	DeptUpdateService updateService;
	
	private DeptUpdateController() {
		this.listService = DeptListService.getInstance();
		this.searchService = DeptSearchService.getInstance();
		this.updateService = DeptUpdateService.getInstance();
	}
	
	private static DeptUpdateController controller = new DeptUpdateController();
	
	public static DeptUpdateController getInstance() {
		return controller;
	};
	
	public void process() {
		
		// 1. 수정하고자 하는 데이터를 사용자로 부터 받아서 -> Dept 객체에 각각 넣어준다.
		int newDept = inputUpdateDept();
		// 2. Service에 Dept 전달해서 수정 => 결과 반환 ( 1 or 0 )
		int result = newDept;
		// 3. 결과 값에 따른 결과 출력
		printData(result);
		
	}
	
	private void printData(int result) {
		if(result > 0) {
			System.out.println("수정 되었습니다.");
		} else {
			System.out.println("수정 실패 . (입력시 데이터를 확인후 입력해주세요.)");
		}
	}
	
	private int inputUpdateDept() {
		
		Dept dept = null;
		// 1. 수정하고자 하는 부서번호를 입력하세요.
		System.out.println("부서정보 수정을 시작합니다.");
		//   전체리스트 출력
		System.out.println();
		
		List<Dept> list = listService.getDeptList();
		System.out.println("----------------------------------------------------------");
		for(Dept l : list) {
			System.out.println(l.getDeptno() + "\t" + l.getDname() + "\t" + l.getLoc());
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("수정하고자 하는 부서번호를 입력하세요. >>>");
		
		
		// 사용자가 부서번호를 입력
		int deptno = Integer.parseInt(DeptManagerMain.sc.nextLine());
//		System.out.println("새로운 부서이름을 입력하세요.");
//		String dname = DeptManagerMain.sc.nextLine();
//		System.out.println("새로운 위치를 입력하세요.");
//		String loc = DeptManagerMain.sc.nextLine();

		// 2. 해당 부서번호의 데이터를 가져와서 보여준다.
		dept = searchService.searchDept(deptno);
		System.out.println("-------------------------------------------------");
		System.out.println(dept.getDeptno() + dept.getDname() + dept.getLoc());
		System.out.println("-------------------------------------------------");
		
		// 3. 수정할 데이터를 입력 받아 = > dept 로 잘 넣어준다.
		System.out.println(deptno + " 번 부서의 정보 수정을 시작합니다.");
		System.out.println("새로운 부서의 이름을 입력하세요.");
		String newDname = DeptManagerMain.sc.nextLine();
		dept.setDname(newDname);
		
		System.out.println("새로운 위치정보를 입력하세요.");
		String newLoc = DeptManagerMain.sc.nextLine();
		dept.setLoc(newLoc);
		
		//dept = 부서번호 제외하고 싺다 다시 입력된 변수가 된다.
		updateService.updateDept(dept);
		
		
		return updateService.updateDept(dept);
	}
	
	public static void main(String[] args) {
		
		DeptUpdateController controller = new DeptUpdateController();
//		Dept dept = controller.inputUpdateDept();
//		System.out.println(dept);
		
	}		

}
