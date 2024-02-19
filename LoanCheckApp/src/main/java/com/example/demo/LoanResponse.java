package com.example.demo;

public class LoanResponse {
	int approvedStatus;
	int status;
	public int getApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(int approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoanResponse [approvedStatus=" + approvedStatus + ", status=" + status + "]";
	}
	public LoanResponse(int approvedStatus, int status) {
		super();
		this.approvedStatus = approvedStatus;
		this.status = status;
	}
}
