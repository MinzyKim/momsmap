package lab.java.data;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DataDAO {
	Connection con = null;
	Properties prop = new Properties();
	Statement stat = null;
	PreparedStatement pstat = null;
	ResultSet rs;

	public Connection dbCon() {

		try {
			prop.load(new FileInputStream("C:/Users/±è¹ÎÁö/momsmap/momsmap/dbinfo.properties"));
			Class.forName(prop.getProperty("driver"));
			System.out.println("driver load");
			con = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("pwd"));
			System.out.println("db connect success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void dbClose(Connection con, Statement stat, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stat != null)
				stat.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertMeal(MealVO vo) {

		int rsint = 0;
		String sql = "insert into sanitary(key,officeedu,subofficeedu,kindername,establish,mlsr_oprn_way_tp_cd,cons_ents_nm,al_kpcnt,mlsr_kpcnt, ntrt_tchr_agmt_yn,snge_agmt_ntrt_thcnt,cprt_agmt_ntrt_thcnt,ckcnt,cmcnt,mas_mspl_dclr_yn,page)"
				+ " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
		try {
			con = dbCon();
			pstat = con.prepareStatement(sql);

			pstat.setString(1, vo.getKey());
			pstat.setString(2, vo.getOfficeedu());
			pstat.setString(3, vo.getSubofficeedu());
			pstat.setString(4, vo.getKindername());
			pstat.setString(5, vo.getEstablish());
			pstat.setString(6, vo.getMas_mspl_dclr_yn());
			pstat.setString(7, vo.getCons_ents_nm());
			pstat.setString(8, vo.getAl_kpcntnul());
			pstat.setString(9, vo.getMlsr_kpcnt());
			pstat.setString(10, vo.getNtrt_tchr_agmt_yn());
			pstat.setString(11, vo.getSnge_agmt_ntrt_thcnt());
			pstat.setString(12, vo.getCprt_agmt_ntrt_thcnt());
			pstat.setString(13, vo.getCkcnt());
			pstat.setString(14, vo.getCmcnt());
			pstat.setString(15, vo.getMas_mspl_dclr_yn());
			pstat.setString(16, vo.getPage());
			rsint = pstat.executeUpdate();
			if (rsint > 0) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, pstat, rs);
		}

		return 0;
	}
	
	public int insertBuilding(BuildingVO vo) {
		int rsint = 0;
		String sql = "insert into establishment values(null, ?, ?, ?, null, ?, ?, ?, ?, ?, ?, null, null, null, null,null,"
				+ "null,null,null,null,null, null, null, null, null, null, null, null, null, null)";
		try {
			con = dbCon();
			pstat = con.prepareStatement(sql);
			
		  
			pstat.setString(1, vo.getKey());
			pstat.setString(2, vo.getOfficeedu());
			pstat.setString(3, vo.getSubofficeedu());
			pstat.setString(4, vo.getKindername());
			pstat.setString(5, vo.getEstablish());
			pstat.setString(6, vo.getArchyy());
			pstat.setString(7, vo.getFloorcnt());
			pstat.setString(8, vo.getBldgprusarea());
			pstat.setString(9, vo.getGrottar());
		
			rsint = pstat.executeUpdate();
			if (rsint > 0) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, pstat, rs);
		}

		return 0;
	}
	
	public int insertKinderInfo(KinderInfoVO vo) {
		int rsint = 0;
		String sql = "insert into kinderinfo values('DM'||to_char(kinder_seq.nextval,'FM009'),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			con = dbCon();
			pstat = con.prepareStatement(sql);
			
			
			pstat.setString(1, vo.getOfficeedu());
			pstat.setString(2, vo.getSubofficeedu());
			pstat.setString(3, vo.getKindername());
			pstat.setString(4, vo.getEstablish());
			pstat.setString(5, vo.getEdate());
			pstat.setString(6, vo.getOdate());
			pstat.setString(7, vo.getAddr());
			pstat.setString(8, vo.getTelno());
			pstat.setString(9, vo.getHpaddr());
			pstat.setString(10, vo.getOpertime());
			pstat.setString(11, vo.getClcnt3());
			pstat.setString(12, vo.getClcnt4());
			pstat.setString(13, vo.getClcnt5());
			pstat.setString(14, vo.getMixclcnt());
			pstat.setString(15, vo.getShclcnt());
			pstat.setString(16, vo.getPpcnt3());
			pstat.setString(17, vo.getPpcnt4());
			pstat.setString(18, vo.getPpcnt5());
			pstat.setString(19, vo.getMixppcnt());
			pstat.setString(20, vo.getShppcnt());
			
		
			rsint = pstat.executeUpdate();
			if (rsint > 0) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, pstat, rs);
		}

		return 0;
	}
	
	public int insertTeacher(TeacherVO vo) {
		int rsint = 0;
		String sql = "insert into teacher values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			con = dbCon();
			pstat = con.prepareStatement(sql);
			
			
			pstat.setString(1, vo.getTeacherId());
			pstat.setString(2, vo.getKey());
			pstat.setString(3, vo.getDrcnt());
			pstat.setString(4, vo.getAdcnt());
			pstat.setString(5, vo.getHdst_thcnt());
			pstat.setString(6, vo.getAsps_thcnt());
			pstat.setString(7, vo.getGnrl_thcnt());
			pstat.setString(8, vo.getSpcn_thcnt());
			pstat.setString(9, vo.getNtcnt());
			pstat.setString(10, vo.getNtrt_thcnt());
			pstat.setString(11, vo.getShcnt_thcnt());
			pstat.setString(12, vo.getIncnt());
			pstat.setString(13, vo.getOwcnt());
			pstat.setString(14, vo.getHdst_tchr_qacnt());
			pstat.setString(15, vo.getRgth_gd1_qacnt());
			pstat.setString(16, vo.getRgth_gd2_qacnt());
			pstat.setString(17, vo.getAsth_qacnt());
			pstat.setString(18, vo.getKindername());
			
		
			rsint = pstat.executeUpdate();
			if (rsint > 0) {
				return 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, pstat, rs);
		}

		return 0;
	}
}
