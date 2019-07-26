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
	Statement stat=null;
	PreparedStatement pstat = null;
	ResultSet rs;
	public Connection dbCon() {	
		
		try {
			prop.load(new FileInputStream("C:/Users/±è¹ÎÁö/eclipse-workspace/momsmap/dbinfo.properties"));
			Class.forName(prop.getProperty("driver"));
			con=DriverManager.getConnection(
			prop.getProperty("url"),
			prop.getProperty("user"),
			prop.getProperty("pwd"));
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
	
	public int insertSafety(String[] safetyInfo) {
		
		int rsint = 0;
		String sql = "insert into safety values(safety_seq.nextval, null, null, ?, null, ?, null, ?, null, ?, null, ?, null, ?, null, null, ?, ?,?,? )";
		try {
			pstat = con.prepareStatement(sql);
			
			pstat.setString(1, safetyInfo[0]);
			pstat.setString(2, safetyInfo[1]);
			pstat.setString(3, safetyInfo[2]);
			pstat.setString(4, safetyInfo[3]);
			pstat.setString(5, safetyInfo[4]);
			pstat.setString(6, safetyInfo[5]);
			pstat.setString(7, safetyInfo[6]);
			pstat.setInt(8, Integer.parseInt(safetyInfo[7]));
			pstat.setInt(9, Integer.parseInt(safetyInfo[8]));
			pstat.setInt(10, Integer.parseInt(safetyInfo[9]));
			rsint = pstat.executeUpdate();
			if(rsint > 0) {
				return 1;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			dbClose(con, pstat, rs);
		}
		
		return 0;
	}
}
