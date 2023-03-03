package com.puppycafe.root.Dto;



public class ReservedDto {
	private int rnum; // 예약번호
	private String rid; // 예약할 아이디
	private String rdate; // 예약할 날짜
	private int rhour; // 예약 시간 
	
	public ReservedDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReservedDto(int rnum, String rid, String rdate, int rhour) {
		super();
		this.rnum = rnum;
		this.rid = rid;
		this.rdate = rdate;
		this.rhour = rhour;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getRhour() {
		return rhour;
	}
	public void setRhour(int rhour) {
		this.rhour = rhour;
	}
	
	
}
