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
			System.out.println("db connect¼º°ø");
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

	public int insertPractice(SanitaryVO vo) {

		int rsint = 0;
		String sql = "insert into practice values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
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
}
