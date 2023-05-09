package member.domain;

public class MemberDTO {
	
	private int idx;
	private String uid;
	private String uname;
	
	private String pw;
	private String uuid;
	private String uphoto;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(int idx, String uid, String uname, String uphoto) {
		this.idx = idx;
		this.uid = uid;
		this.uname = uname;
		this.uphoto = uphoto;
	}


	public MemberDTO(int idx, String uid, String uname, String pw, String uuid, String uphoto) {
		this.idx = idx;
		this.uid = uid;
		this.uname = uname;
		this.pw = pw;
		this.uuid = uuid;
		this.uphoto = uphoto;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	@Override
	public String toString() {
		return "MemberDTO [idx=" + idx + ", uid=" + uid + ", uname=" + uname + ", pw=" + pw + ", uuid=" + uuid
				+ ", uphoto=" + uphoto + "]";
	}
	
}
