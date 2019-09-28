package com.ust.model;

public class VendorContact {
	private int vendorId; 
	private String vendorName; 
	private String vendorAdd; 
	private String vendorLoc; 
	private String vendorSer; 
	private String vendorPin;
	private int isActive;
	private int staffId;
	private String staffName;
	private String staffDept; 
	private String staffEmail; 
	private String satffPhno;
	public VendorContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VendorContact(int vendorId, String vendorName, String vendorAdd,
			String vendorLoc, String vendorSer, String vendorPin, int isActive,
			int staffId, String staffName, String staffDept, String staffEmail,
			String satffPhno) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAdd = vendorAdd;
		this.vendorLoc = vendorLoc;
		this.vendorSer = vendorSer;
		this.vendorPin = vendorPin;
		this.isActive = isActive;
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffEmail = staffEmail;
		this.satffPhno = satffPhno;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAdd() {
		return vendorAdd;
	}
	public void setVendorAdd(String vendorAdd) {
		this.vendorAdd = vendorAdd;
	}
	public String getVendorLoc() {
		return vendorLoc;
	}
	public void setVendorLoc(String vendorLoc) {
		this.vendorLoc = vendorLoc;
	}
	public String getVendorSer() {
		return vendorSer;
	}
	public void setVendorSer(String vendorSer) {
		this.vendorSer = vendorSer;
	}
	public String getVendorPin() {
		return vendorPin;
	}
	public void setVendorPin(String vendorPin) {
		this.vendorPin = vendorPin;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDept() {
		return staffDept;
	}
	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}
	public String getSatffPhno() {
		return satffPhno;
	}
	public void setSatffPhno(String satffPhno) {
		this.satffPhno = satffPhno;
	}
	@Override
	public String toString() {
		return "VendorContact [vendorId=" + vendorId + ", vendorName="
				+ vendorName + ", vendorAdd=" + vendorAdd + ", vendorLoc="
				+ vendorLoc + ", vendorSer=" + vendorSer + ", vendorPin="
				+ vendorPin + ", isActive=" + isActive + ", staffId=" + staffId
				+ ", staffName=" + staffName + ", staffDept=" + staffDept
				+ ", staffEmail=" + staffEmail + ", satffPhno=" + satffPhno
				+ "]";
	} 
	

}


	