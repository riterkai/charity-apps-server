package com.example.bean;

public class UserHdBean {
	private String uname1;
	private String uavatar;
	private int hdid;
	private String hdname;
	private double hdlon;
	private double hdlat;
	private String startdate;
	private String enddate;
	private String hdImg;
	private String hdcontent;
	private int hdsuid;
	private String address;
	private String creattime;
	public UserHdBean() {
		super();
	}
	
	public UserHdBean(String uavatar, int hdid, String hdname,
			double hdlon, double hdlat, String startdate, String enddate,
			String hdImg, String hdcontent, int hdsuid) {
		super();
		this.uavatar = uavatar;
		this.hdid = hdid;
		this.hdname = hdname;
		this.hdlon = hdlon;
		this.hdlat = hdlat;
		this.startdate = startdate;
		this.enddate = enddate;
		this.hdImg = hdImg;
		this.hdcontent = hdcontent;
		this.hdsuid = hdsuid;
	}
	
	
	
	
	public UserHdBean(String uname, String uavatar, int hdid, String hdname,
			double hdlon, double hdlat, String startdate, String enddate,
			String hdImg, String hdcontent, int hdsuid) {
		super();
		this.uname1 = uname;
		this.uavatar = uavatar;
		this.hdid = hdid;
		this.hdname = hdname;
		this.hdlon = hdlon;
		this.hdlat = hdlat;
		this.startdate = startdate;
		this.enddate = enddate;
		this.hdImg = hdImg;
		this.hdcontent = hdcontent;
		this.hdsuid = hdsuid;
	}
	
	public UserHdBean(String uname, String uavatar, int hdid, String hdname,
			double hdlon, double hdlat, String startdate, String enddate,
			String hdImg, String hdcontent, int hdsuid,String address) {
		super();
		this.uname1 = uname;
		this.uavatar = uavatar;
		this.hdid = hdid;
		this.hdname = hdname;
		this.hdlon = hdlon;
		this.hdlat = hdlat;
		this.startdate = startdate;
		this.enddate = enddate;
		this.hdImg = hdImg;
		this.hdcontent = hdcontent;
		this.hdsuid = hdsuid;
		this.address = address;
	}
	
	public UserHdBean(String uname, String uavatar, int hdid, String hdname,
			double hdlon, double hdlat, String startdate, String enddate,
			String hdImg, String hdcontent, int hdsuid,String address,String creattime) {
		super();
		this.uname1 = uname;
		this.uavatar = uavatar;
		this.hdid = hdid;
		this.hdname = hdname;
		this.hdlon = hdlon;
		this.hdlat = hdlat;
		this.startdate = startdate;
		this.enddate = enddate;
		this.hdImg = hdImg;
		this.hdcontent = hdcontent;
		this.hdsuid = hdsuid;
		this.address = address;
		this.creattime = creattime;
	}
	
	public String getUname() {
		return uname1;
	}
	public void setUname(String uname) {
		this.uname1 = uname;
	}
	public String getUavatar() {
		return uavatar;
	}
	public void setUavatar(String uavatar) {
		this.uavatar = uavatar;
	}
	public int getHdid() {
		return hdid;
	}
	public void setHdid(int hdid) {
		this.hdid = hdid;
	}
	public String getHdname() {
		return hdname;
	}
	public void setHdname(String hdname) {
		this.hdname = hdname;
	}
	public double getHdlon() {
		return hdlon;
	}
	public void setHdlon(double hdlon) {
		this.hdlon = hdlon;
	}
	public double getHdlat() {
		return hdlat;
	}
	public void setHdlat(double hdlat) {
		this.hdlat = hdlat;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getHdImg() {
		return hdImg;
	}
	public void setHdImg(String hdImg) {
		this.hdImg = hdImg;
	}
	public String getHdcontent() {
		return hdcontent;
	}
	public void setHdcontent(String hdcontent) {
		this.hdcontent = hdcontent;
	}
	public int getHdsuid() {
		return hdsuid;
	}
	public void setHdsuid(int hdsuid) {
		this.hdsuid = hdsuid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCreattime() {
		return creattime;
	}
	public void setCreattime(String creattime) {
		this.creattime = creattime;
	}

}
