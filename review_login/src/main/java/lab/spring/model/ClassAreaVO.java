package lab.spring.model;

public class ClassAreaVO {
	private String classId; //시설 id
	private String key;
	private String crcnt;//교실수
	private String clsrarea;//체육장
	private String phgrindrarea; //건물전용면적
	private String hlsparea; //보건,위생공간
	private String ktchmssparea; //조리실,급식공간
	private String otsparea; //기타공간
	
	
	
	public ClassAreaVO() {
		super();
	}
	
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getCrcnt() {
		return crcnt;
	}
	public void setCrcnt(String crcnt) {
		this.crcnt = crcnt;
	}
	public String getClsrarea() {
		return clsrarea;
	}
	public void setClsrarea(String clsrarea) {
		this.clsrarea = clsrarea;
	}
	public String getPhgrindrarea() {
		return phgrindrarea;
	}
	public void setPhgrindrarea(String phgrindrarea) {
		this.phgrindrarea = phgrindrarea;
	}
	public String getHlsparea() {
		return hlsparea;
	}
	public void setHlsparea(String hlsparea) {
		this.hlsparea = hlsparea;
	}
	public String getKtchmssparea() {
		return ktchmssparea;
	}
	public void setKtchmssparea(String ktchmssparea) {
		this.ktchmssparea = ktchmssparea;
	}
	public String getOtsparea() {
		return otsparea;
	}
	public void setOtsparea(String otsparea) {
		this.otsparea = otsparea;
	}
	@Override
	public String toString() {
		return "ClassAreaVO [classId=" + classId + ", key=" + key + ", crcnt=" + crcnt + ", clsrarea=" + clsrarea
				+ ", phgrindrarea=" + phgrindrarea + ", hlsparea=" + hlsparea + ", ktchmssparea=" + ktchmssparea
				+ ", otsparea=" + otsparea + "]";
	}
 

	
	
}
