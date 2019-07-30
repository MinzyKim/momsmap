package lab.java.data;

public class BuildingVO {
	private String establishId; //시설 id
	private String key;
	private String officeedu; //교육청명
	private String subofficeedu;//교육지원청명
	private String kinderinfoId;//일반유치원 id
	private String kindername; //유치원명
	private String establish;//설립유형
	private String archyy;//건축년도
	private String floorcnt;//건물층수
	private String bldgprusarea; //건물전용면적
	private String grottar; //대지총면적
	public BuildingVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getEstablishId() {
		return establishId;
	}
	public void setEstablishId(String establishId) {
		this.establishId = establishId;
	}
	public String getOfficeedu() {
		return officeedu;
	}
	public void setOfficeedu(String officeedu) {
		this.officeedu = officeedu;
	}
	public String getSubofficeedu() {
		return subofficeedu;
	}
	public void setSubofficeedu(String subofficeedu) {
		this.subofficeedu = subofficeedu;
	}
	public String getKinderinfoId() {
		return kinderinfoId;
	}
	public void setKinderinfoId(String kinderinfoId) {
		this.kinderinfoId = kinderinfoId;
	}
	public String getKindername() {
		return kindername;
	}
	public void setKindername(String kindername) {
		this.kindername = kindername;
	}
	public String getEstablish() {
		return establish;
	}
	public void setEstablish(String establish) {
		this.establish = establish;
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
		return "BuildingVO [establishId=" + establishId + ", officeedu=" + officeedu + ", subofficeedu=" + subofficeedu
				+ ", kinderinfoId=" + kinderinfoId + ", kindername=" + kindername + ", establish=" + establish
				+ ", archyy=" + archyy + ", floorcnt=" + floorcnt + ", bldgprusarea=" + bldgprusarea + ", grottar="
				+ grottar + "]";
	}
	
	
}
