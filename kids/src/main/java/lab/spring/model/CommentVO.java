package lab.spring.model;

import java.sql.Date;

public class CommentVO {
	
	private int cmid;
	private String kdid;
	private String writer;
	private String idate;
	private String contents;
	private String score;
	
	
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public int getCmid() {
		return cmid;
	}
	public void setCmid(int cmid) {
		this.cmid = cmid;
	}
	public String getKdid() {
		return kdid;
	}
	public void setKdid(String kdid) {
		this.kdid = kdid;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	
	
	public String getIdate() {
		return idate;
	}
	public void setIdate(String idate) {
		this.idate = idate;
	}
	
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	

	
	
	
	
	
}
