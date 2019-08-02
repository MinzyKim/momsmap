package lab.spring.model;

public class SchoolBusVO {
	private String busId; //시설 id
	private String key;
	private String vhcl_oprn_yn;// 차량운영여부
	private String opra_vhcnt;// 운행차량수
	
	private String dclr_vhcnt; // 신고차량수
	private String psg9_dclr_vhcnt; //9인승신고차량수
	private String psg12_dclr_vhcnt; //12인승신고차량수
	private String psg15_dclr_vhcnt; //15인승신고차량수
	public String getKindername() {
		return kindername;
	}

	public void setKindername(String kindername) {
		this.kindername = kindername;
	}


	private String kindername;	//유치원이름
	

	
	public SchoolBusVO() {
		super();
	}

	public String getBusId() {
		return busId;
	}


	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getVhcl_oprn_yn() {
		return vhcl_oprn_yn;
	}


	public void setVhcl_oprn_yn(String vhcl_oprn_yn) {
		this.vhcl_oprn_yn = vhcl_oprn_yn;
	}


	public String getOpra_vhcnt() {
		return opra_vhcnt;
	}


	public void setOpra_vhcnt(String opra_vhcnt) {
		this.opra_vhcnt = opra_vhcnt;
	}


	public String getDclr_vhcnt() {
		return dclr_vhcnt;
	}


	public void setDclr_vhcnt(String dclr_vhcnt) {
		this.dclr_vhcnt = dclr_vhcnt;
	}


	public String getPsg9_dclr_vhcnt() {
		return psg9_dclr_vhcnt;
	}


	public void setPsg9_dclr_vhcnt(String psg9_dclr_vhcnt) {
		this.psg9_dclr_vhcnt = psg9_dclr_vhcnt;
	}


	public String getPsg12_dclr_vhcnt() {
		return psg12_dclr_vhcnt;
	}


	public void setPsg12_dclr_vhcnt(String psg12_dclr_vhcnt) {
		this.psg12_dclr_vhcnt = psg12_dclr_vhcnt;
	}


	public String getPsg15_dclr_vhcnt() {
		return psg15_dclr_vhcnt;
	}


	public void setPsg15_dclr_vhcnt(String psg15_dclr_vhcnt) {
		this.psg15_dclr_vhcnt = psg15_dclr_vhcnt;
	}	
	
	
}
