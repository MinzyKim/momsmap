package lab.spring.model;

public class BuildingVO {
	private String BUILDINGID; //시설 id
	private String key;
	private String archyy;//건축년도
	private String floorcnt;//건물층수
	private String bldgprusarea; //건물전용면적
	private String grottar; //대지총면적
	
	public BuildingVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBUILDINGID() {
		return BUILDINGID;
	}

	public void setBUILDINGID(String bUILDINGID) {
		BUILDINGID = bUILDINGID;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getArchyy() {
		return archyy;
	}

	public void setArchyy(String archyy) {
		this.archyy = archyy;
	}

	public String getFloorcnt() {
		return floorcnt;
	}

	public void setFloorcnt(String floorcnt) {
		this.floorcnt = floorcnt;
	}

	public String getBldgprusarea() {
		return bldgprusarea;
	}

	public void setBldgprusarea(String bldgprusarea) {
		this.bldgprusarea = bldgprusarea;
	}

	public String getGrottar() {
		return grottar;
	}

	public void setGrottar(String grottar) {
		this.grottar = grottar;
	}

	@Override
	public String toString() {
		return "BuildingVO [BUILDINGID=" + BUILDINGID + ", key=" + key + ", archyy=" + archyy + ", floorcnt=" + floorcnt
				+ ", bldgprusarea=" + bldgprusarea + ", grottar=" + grottar + "]";
	}
	
	
	
	
}
