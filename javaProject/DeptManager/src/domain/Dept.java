package domain;

//DTO : java Beans
// 모든 변수가 private , getter/setter, 기본생성자가 반드시 존재!
public class Dept {
	
	private int deptno; //컬럼 이름과 동일하게!!!
	private String dname;
	private String loc;
	
	//기본 생성자
	public Dept() {
		
	}

	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	
	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
}
