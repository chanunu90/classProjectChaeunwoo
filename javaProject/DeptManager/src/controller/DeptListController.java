package controller;

import java.util.List;

import dao.DeptDao;
import domain.Dept;
import service.DeptListService;

// Controller 클래스는 사용자의 요청을 처리할 service를 결정하고 요청
// 요청의 결과를 받아서 사용자에게 결과를 출력해준다.
public class DeptListController  implements Controller{
	
	DeptListService listService;
	
	private DeptListController(){
		this.listService = DeptListService.getInstance();
	}
	
	private static DeptListController controller = new DeptListController();
	
	public static DeptListController getInstance() {
		return controller;
	}
	
	public void process() {
		// 사용자의 요청 분석
		// 요청을 처리할 서비스를 이용해서 결과 데이터를 받는다.
		List<Dept> result = listService.getDeptList();
		
		// 사용자에 응답할 포맷(템플릿 ,뷰) 결정  -> 결과 데이터를 공유
		printResult(result);
	}
	
	void printResult(List<Dept> list) {
		
		System.out.println("부서리스트====================");
		System.out.println("부서번호 \t 부서이름 \t 위치");
		System.out.println("===========================");
		
		for(Dept l : list) {
			System.out.printf("%10d \t%12s \t%12s\n" , l.getDeptno() , l.getDname() , l.getLoc());
		}
		
	}
	
//	public static void main(String[] args) {
//		DeptListController asd = new DeptListController();
//		asd.process();
//	}
	
	
}
