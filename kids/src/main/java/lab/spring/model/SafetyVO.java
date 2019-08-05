package lab.spring.model;

public class SafetyVO {
   private String fire_avd_yn; //소방대피훈련여부
   private String fire_avd_dt; //소방대피훈련일자
   private String gas_ck_yn; //가스점검여부
   private String gas_ck_dt; //가스점검일자
   private String fire_safe_yn; //소방안전점검여부
   private String fire_safe_dt; //소방안전점검일자
   private String elect_ck_yn; //전기설비점검여부
   private String elect_ck_dt; //전기설비점검일자
   private String plyg_ck_yn; //놀이시설 안전검사 대상여부     
   private String plyg_ck_dt; //놀이시설 안전검사 점검일자
   private String plyg_ck_rs_cd; //놀이시설 안전검사 점검결과
   private String cctv_ist_yn; //CCTV 설치여부
   private String cctv_ist_total; // CCTV 총 설치수
   private String cctv_ist_in; //CCTV 건물 안 설치수
   private String cctv_ist_out;
   public String getFire_avd_yn() {
      return fire_avd_yn;
   }
   public void setFire_avd_yn(String fire_avd_yn) {
      this.fire_avd_yn = fire_avd_yn;
   }
   public String getFire_avd_dt() {
      return fire_avd_dt;
   }
   public void setFire_avd_dt(String fire_avd_dt) {
      this.fire_avd_dt = fire_avd_dt;
   }
   public String getGas_ck_yn() {
      return gas_ck_yn;
   }
   public void setGas_ck_yn(String gas_ck_yn) {
      this.gas_ck_yn = gas_ck_yn;
   }
   public String getGas_ck_dt() {
      return gas_ck_dt;
   }
   public void setGas_ck_dt(String gas_ck_dt) {
      this.gas_ck_dt = gas_ck_dt;
   }
   public String getFire_safe_yn() {
      return fire_safe_yn;
   }
   public void setFire_safe_yn(String fire_safe_yn) {
      this.fire_safe_yn = fire_safe_yn;
   }
   public String getFire_safe_dt() {
      return fire_safe_dt;
   }
   public void setFire_safe_dt(String fire_safe_dt) {
      this.fire_safe_dt = fire_safe_dt;
   }
   public String getElect_ck_yn() {
      return elect_ck_yn;
   }
   public void setElect_ck_yn(String elect_ck_yn) {
      this.elect_ck_yn = elect_ck_yn;
   }
   public String getElect_ck_dt() {
      return elect_ck_dt;
   }
   public void setElect_ck_dt(String elect_ck_dt) {
      this.elect_ck_dt = elect_ck_dt;
   }
   public String getPlyg_ck_yn() {
      return plyg_ck_yn;
   }
   public void setPlyg_ck_yn(String plyg_ck_yn) {
      this.plyg_ck_yn = plyg_ck_yn;
   }
   public String getPlyg_ck_dt() {
      return plyg_ck_dt;
   }
   public void setPlyg_ck_dt(String plyg_ck_dt) {
      this.plyg_ck_dt = plyg_ck_dt;
   }
   public String getPlyg_ck_rs_cd() {
      return plyg_ck_rs_cd;
   }
   public void setPlyg_ck_rs_cd(String plyg_ck_rs_cd) {
      this.plyg_ck_rs_cd = plyg_ck_rs_cd;
   }
   public String getCctv_ist_yn() {
      return cctv_ist_yn;
   }
   public void setCctv_ist_yn(String cctv_ist_yn) {
      this.cctv_ist_yn = cctv_ist_yn;
   }
   public String getCctv_ist_total() {
      return cctv_ist_total;
   }
   public void setCctv_ist_total(String cctv_ist_total) {
      this.cctv_ist_total = cctv_ist_total;
   }
   public String getCctv_ist_in() {
      return cctv_ist_in;
   }
   public void setCctv_ist_in(String cctv_ist_in) {
      this.cctv_ist_in = cctv_ist_in;
   }
   public String getCctv_ist_out() {
      return cctv_ist_out;
   }
   public void setCctv_ist_out(String cctv_ist_out) {
      this.cctv_ist_out = cctv_ist_out;
   } //CCTV 건물 밖 설치수
   
   
   
}