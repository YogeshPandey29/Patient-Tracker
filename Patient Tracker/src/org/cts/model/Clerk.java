package org.cts.model;

public class Clerk {
	
	private String clerkName;
	private int clerkAge;
	private String clerkAddress;
	private String clerkPassword;
	private String clerkDOJ;
	private String clerkContactNo;
	private String clerkEmailId;
	private String clerkId;
	
	/**
	 * @param clerkName
	 * @param clerkAge
	 * @param clerkAddress
	 * @param clerkPassword
	 * @param clerkDOJ
	 * @param clerkContactNo
	 * @param clerkEmailId
	 */
	public Clerk(String clerkName, int clerkAge, String clerkAddress, String clerkPassword, String clerkDOJ,
			String clerkContactNo, String clerkEmailId, String clerkId) {
		super();
		this.clerkName = clerkName;
		this.clerkAge = clerkAge;
		this.clerkAddress = clerkAddress;
		this.clerkPassword = clerkPassword;
		this.clerkDOJ = clerkDOJ;
		this.clerkContactNo = clerkContactNo;
		this.clerkEmailId = clerkEmailId;
		this.clerkId = clerkId;
	}

	public String getClerkName() {
		return clerkName;
	}

	public void setClerkName(String clerkName) {
		this.clerkName = clerkName;
	}

	public int getClerkAge() {
		return clerkAge;
	}

	public void setClerkAge(int clerkAge) {
		this.clerkAge = clerkAge;
	}

	public String getClerkAddress() {
		return clerkAddress;
	}

	public void setClerkAddress(String clerkAddress) {
		this.clerkAddress = clerkAddress;
	}

	public String getClerkPassword() {
		return clerkPassword;
	}

	public void setClerkPassword(String clerkPassword) {
		this.clerkPassword = clerkPassword;
	}

	public String getClerkDOJ() {
		return clerkDOJ;
	}

	public void setClerkDOJ(String clerkDOJ) {
		this.clerkDOJ = clerkDOJ;
	}

	public String getClerkContactNo() {
		return clerkContactNo;
	}

	public void setClerkContactNo(String clerkContactNo) {
		this.clerkContactNo = clerkContactNo;
	}

	public String getClerkEmailId() {
		return clerkEmailId;
	}

	public void setClerkEmailId(String clerkEmailId) {
		this.clerkEmailId = clerkEmailId;
	}
	
	public String getClerkId() {
		return clerkId;
	}
	
	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}
	
	
}
