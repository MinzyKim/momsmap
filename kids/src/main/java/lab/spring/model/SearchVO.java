package lab.spring.model;

public class SearchVO {
	private String kinderinfoId;
	private String officeedu;
	private String subofficeedu;
	private String kindername;
	private String establish;
	private String edate;
	private String odate;
	private String addr;
	private String telno;
	private String hpaddr;
	private String opertime;
	private String POINT_Y;
	private String POINT_X;
	
	////////////////////////안전 정보
	private String fire_avd_dt;
	private String gas_ck_dt;
	private String fire_safe_dt;
	private String elect_ck_dt;
	private String plyg_ck_dt;
	private String cctv_ist_in;
	///////////////////////위생 정보
	private String sanitaryid;
	private String ARQL_CHK_DT;
	private String FXTM_DSNF_CHK_DT;
	private String MDST_CHK_DT;
	private String ILMN_CHK_DT;
	////////////////////////////
	public String getKinderinfoId() {
		return kinderinfoId;
	}
	public void setKinderinfoId(String kinderinfoId) {
		this.kinderinfoId = kinderinfoId;
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
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getHpaddr() {
		return hpaddr;
	}
	public void setHpaddr(String hpaddr) {
		this.hpaddr = hpaddr;
	}
	public String getOpertime() {
		return opertime;
	}
	public void setOpertime(String opertime) {
		this.opertime = opertime;
	}
	public String getPOINT_Y() {
		return POINT_Y;
	}
	public void setPOINT_Y(String pOINT_Y) {
		POINT_Y = pOINT_Y;
	}
	public String getPOINT_X() {
		return POINT_X;
	}
	public void setPOINT_X(String pOINT_X) {
		POINT_X = pOINT_X;
	}
	public String getFire_avd_dt() {
		return fire_avd_dt;
	}
	public void setFire_avd_dt(String fire_avd_dt) {
		this.fire_avd_dt = fire_avd_dt;
	}
	public String getGas_ck_dt() {
		return gas_ck_dt;
	}
	public void setGas_ck_dt(String gas_ck_dt) {
		this.gas_ck_dt = gas_ck_dt;
	}
	public String getFire_safe_dt() {
		return fire_safe_dt;
	}
	public void setFire_safe_dt(String fire_safe_dt) {
		this.fire_safe_dt = fire_safe_dt;
	}
	public String getElect_ck_dt() {
		return elect_ck_dt;
	}
	public void setElect_ck_dt(String elect_ck_dt) {
		this.elect_ck_dt = elect_ck_dt;
	}
	public String getPlyg_ck_dt() {
		return plyg_ck_dt;
	}
	public void setPlyg_ck_dt(String plyg_ck_dt) {
		this.plyg_ck_dt = plyg_ck_dt;
	}
	public String getCctv_ist_in() {
		return cctv_ist_in;
	}
	public void setCctv_ist_in(String cctv_ist_in) {
		this.cctv_ist_in = cctv_ist_in;
	}
	public String getSanitaryid() {
		return sanitaryid;
	}
	public void setSanitaryid(String sanitaryid) {
		this.sanitaryid = sanitaryid;
	}
	public String getARQL_CHK_DT() {
		return ARQL_CHK_DT;
	}
	public void setARQL_CHK_DT(String aRQL_CHK_DT) {
		ARQL_CHK_DT = aRQL_CHK_DT;
	}
	public String getFXTM_DSNF_CHK_DT() {
		return FXTM_DSNF_CHK_DT;
	}
	public void setFXTM_DSNF_CHK_DT(String fXTM_DSNF_CHK_DT) {
		FXTM_DSNF_CHK_DT = fXTM_DSNF_CHK_DT;
	}
	public String getMDST_CHK_DT() {
		return MDST_CHK_DT;
	}
	public void setMDST_CHK_DT(String mDST_CHK_DT) {
		MDST_CHK_DT = mDST_CHK_DT;
	}
	public String getILMN_CHK_DT() {
		return ILMN_CHK_DT;
	}
	public void setILMN_CHK_DT(String iLMN_CHK_DT) {
		ILMN_CHK_DT = iLMN_CHK_DT;
	}
	@Override
	public String toString() {
		return "SearchVO [kinderinfoId=" + kinderinfoId + ", officeedu=" + officeedu + ", subofficeedu=" + subofficeedu
				+ ", kindername=" + kindername + ", establish=" + establish + ", edate=" + edate + ", odate=" + odate
				+ ", addr=" + addr + ", telno=" + telno + ", hpaddr=" + hpaddr + ", opertime=" + opertime + ", POINT_Y="
				+ POINT_Y + ", POINT_X=" + POINT_X + ", fire_avd_dt=" + fire_avd_dt + ", gas_ck_dt=" + gas_ck_dt
				+ ", fire_safe_dt=" + fire_safe_dt + ", elect_ck_dt=" + elect_ck_dt + ", plyg_ck_dt=" + plyg_ck_dt
				+ ", cctv_ist_in=" + cctv_ist_in + ", sanitaryid=" + sanitaryid + ", ARQL_CHK_DT=" + ARQL_CHK_DT
				+ ", FXTM_DSNF_CHK_DT=" + FXTM_DSNF_CHK_DT + ", MDST_CHK_DT=" + MDST_CHK_DT + ", ILMN_CHK_DT="
				+ ILMN_CHK_DT + "]";
	}
	
}
