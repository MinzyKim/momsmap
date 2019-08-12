package lab.spring.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lab.spring.model.CommentVO;
import lab.spring.model.BuildingVO;
import lab.spring.model.KinderInfoVO;
import lab.spring.model.MealVO;
import lab.spring.model.SafetyVO;
import lab.spring.model.TeacherVO;
import lab.spring.model.UserVO;

@Repository
public class DataDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int addComment(CommentVO comment) {
		return sqlSession.insert("lab.mybatis.user.UserMapper.addComment",comment);		
	}
	
	public UserVO login(String uid, String upwd) {
		
		Object vo = null;
		HashMap<String, String> hm = new HashMap<String, String>(); 
		hm.put("uid", uid);
		hm.put("upwd", upwd);
		vo=sqlSession.selectOne("lab.mybatis.user.UserMapper.login", hm);
		
		return (UserVO)vo;
	}
	
	public List<KinderInfoVO> findKinderList(){
		return sqlSession.selectList("lab.mybatis.user.UserMapper.getKinderList");
	}
	
	public List<SafetyVO> findSafety(List<String> safety_arr){
		return sqlSession.selectList("lab.mybatis.user.UserMapper.findSafety");
	}
	
	Connection con = null;
	Properties prop = new Properties();
	Statement stat = null;
	PreparedStatement pstat = null;
	ResultSet rs;

	public Connection dbCon() {

		try {
			prop.load(new FileInputStream("C:\\Workspace\\kidssssssssss\\dbinfo.properties"));
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

	public int insertMeal (MealVO vo) {
	      int rsint = 0;
	      String sql = "insert into Meal values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,? )";
	      
	      try {
	         con = dbCon();
	         pstat = con.prepareStatement(sql);
	         
	         pstat.setString(1, vo.getClassid());
	         pstat.setString(2, vo.getKey());
	         pstat.setString(3, vo.getMlsr_oprn_way_tp_cd());
	         pstat.setString(4, vo.getCons_ents_nm());
	         pstat.setString(5, vo.getAl_kpcnt());
	         pstat.setString(6, vo.getMlsr_kpcnt());
	         pstat.setString(7, vo.getNtrt_tchr_agmt_yn());
	         pstat.setString(8, vo.getSnge_agmt_ntrt_thcnt());
	         pstat.setString(9, vo.getCprt_agmt_ntrt_thcnt());
	         pstat.setString(10, vo.getCkcnt());
	         pstat.setString(11, vo.getCmcnt());
	         pstat.setString(12, vo.getMas_mspl_dclr_yn());
	         pstat.setString(13, vo.getKindername());
	      
	      
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
		String sql = "insert into BUILDING values(?,?,?,?,?,?)";
		
		//values(concat('GN', to_char(kinder_seq.nextval, '009')),?,?,?,?,?)";
		
		try {
			con = dbCon();
			pstat = con.prepareStatement(sql);
			
			pstat.setString(1, vo.getBUILDINGID());
			// 여기서 키값 변경?

			pstat.setString(2, vo.getKey());
			pstat.setString(3, vo.getArchyy());
			pstat.setString(4, vo.getFloorcnt());
			pstat.setString(5, vo.getBldgprusarea());
			pstat.setString(6, vo.getGrottar());
		
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
	
	public int insertComment(CommentVO form) {
		System.out.println("insert 호출");
		StringBuffer sql = null;
		int cnt = -1;
		Connection con = null;
		PreparedStatement stat = null;
		sql = new StringBuffer();
		sql.append("insert into KD_COMMENT (cmid, kdid, writer,").append("idate, contents, score)")
				.append(" values (comment_seq.nextval, ?, ?, sysdate, ").append(" ?, ?)");
		// request.getRemoteAddr
		System.out.println(form.getKdid());
		System.out.println(form.getWriter());
		System.out.println(form.getContents());
		System.out.println(form.getScore());

		
		try {
			con = dbCon();
			stat = con.prepareStatement(sql.toString());
			stat.setString(1, form.getKdid());
			stat.setString(2, form.getWriter());
			stat.setString(3, form.getContents());
			stat.setString(4, form.getScore());
			System.out.println("DAO안에서");
			System.out.println(form.getKdid());
			System.out.println(form.getWriter());
			System.out.println(form.getContents());
			System.out.println(form.getScore());
			
			cnt = stat.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(con, stat, null);
		}
		return cnt;

	}
	
	public List<CommentVO> findCommentList(){
		return sqlSession.selectList("lab.mybatis.user.UserMapper.getCommentList");
	}
	
}
