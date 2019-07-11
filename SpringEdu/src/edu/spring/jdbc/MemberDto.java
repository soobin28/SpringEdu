package edu.spring.jdbc;

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String creDate;

	/* 모든 멤버변수 getter, setter 메소드 작성 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreDate() {
		return creDate;
	}
	public void setCreDate(String creDate) {
		this.creDate = creDate;
	}
}