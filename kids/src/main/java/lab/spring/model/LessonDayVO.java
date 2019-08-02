package lab.spring.model;

public class LessonDayVO {
	private String lessonId; //시설 id
	private String key;
	private String ag3_lsn_dcnt;//3세 수업일수
	private String ag4_lsn_dcnt;//4세 수업일수
	private String ag5_lsn_dcnt; //5세 수업일수
	private String mix_age_lsn_dcnt; //혼합연령수업일수
	private String spcl_lsn_dcnt; //조리실,특수학급수업일수
	private String afsc_pros_lsn_dcnt; //방과후과정수업일수
	private String ldnum_blw_yn; //법정일수이하여부
	private String fdtn_kndr_yn; //신설유치원여부
	
	public LessonDayVO() {
		super();
	}

	public String getLessonId() {
		return lessonId;
	}

	public void setLessonId(String lessonId) {
		this.lessonId = lessonId;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAg3_lsn_dcnt() {
		return ag3_lsn_dcnt;
	}

	public void setAg3_lsn_dcnt(String ag3_lsn_dcnt) {
		this.ag3_lsn_dcnt = ag3_lsn_dcnt;
	}

	public String getAg4_lsn_dcnt() {
		return ag4_lsn_dcnt;
	}

	public void setAg4_lsn_dcnt(String ag4_lsn_dcnt) {
		this.ag4_lsn_dcnt = ag4_lsn_dcnt;
	}

	public String getAg5_lsn_dcnt() {
		return ag5_lsn_dcnt;
	}

	public void setAg5_lsn_dcnt(String ag5_lsn_dcnt) {
		this.ag5_lsn_dcnt = ag5_lsn_dcnt;
	}

	public String getMix_age_lsn_dcnt() {
		return mix_age_lsn_dcnt;
	}

	public void setMix_age_lsn_dcnt(String mix_age_lsn_dcnt) {
		this.mix_age_lsn_dcnt = mix_age_lsn_dcnt;
	}

	public String getSpcl_lsn_dcnt() {
		return spcl_lsn_dcnt;
	}

	public void setSpcl_lsn_dcnt(String spcl_lsn_dcnt) {
		this.spcl_lsn_dcnt = spcl_lsn_dcnt;
	}

	public String getAfsc_pros_lsn_dcnt() {
		return afsc_pros_lsn_dcnt;
	}

	public void setAfsc_pros_lsn_dcnt(String afsc_pros_lsn_dcnt) {
		this.afsc_pros_lsn_dcnt = afsc_pros_lsn_dcnt;
	}

	public String getLdnum_blw_yn() {
		return ldnum_blw_yn;
	}

	public void setLdnum_blw_yn(String ldnum_blw_yn) {
		this.ldnum_blw_yn = ldnum_blw_yn;
	}

	public String getFdtn_kndr_yn() {
		return fdtn_kndr_yn;
	}

	public void setFdtn_kndr_yn(String fdtn_kndr_yn) {
		this.fdtn_kndr_yn = fdtn_kndr_yn;
	}

	@Override
	public String toString() {
		return "LessonDayVO [lessonId=" + lessonId + ", key=" + key + ", ag3_lsn_dcnt=" + ag3_lsn_dcnt
				+ ", ag4_lsn_dcnt=" + ag4_lsn_dcnt + ", ag5_lsn_dcnt=" + ag5_lsn_dcnt + ", mix_age_lsn_dcnt="
				+ mix_age_lsn_dcnt + ", spcl_lsn_dcnt=" + spcl_lsn_dcnt + ", afsc_pros_lsn_dcnt=" + afsc_pros_lsn_dcnt
				+ ", ldnum_blw_yn=" + ldnum_blw_yn + ", fdtn_kndr_yn=" + fdtn_kndr_yn + "]";
	}
	
	
	
	
	
	
	
}
