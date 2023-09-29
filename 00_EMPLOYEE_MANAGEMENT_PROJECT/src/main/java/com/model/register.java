package com.model;

public class register {
	private int empID;
	private String empNAME;
	private String empSALARY;
	private String empMOBILE;
	private String empLOC;

	public register(int empID, String empNAME, String empSALARY, String empMOBILE, String empLOC) {
		super();
		this.empID = empID;
		this.empNAME = empNAME;
		this.empSALARY = empSALARY;
		this.empMOBILE = empMOBILE;
		this.empLOC = empLOC;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpNAME() {
		return empNAME;
	}

	public void setEmpNAME(String empNAME) {
		this.empNAME = empNAME;
	}

	public String getEmpLOC() {
		return empLOC;
	}

	public void setEmpLOC(String empLOC) {
		this.empLOC = empLOC;
	}

	public String getEmpSALARY() {
		return empSALARY;
	}

	public void setEmpSALARY(String empSALARY) {
		this.empSALARY = empSALARY;
	}

	public String getEmpMOBILE() {
		return empMOBILE;
	}

	public void setEmpMOBILE(String empMOBILE) {
		this.empMOBILE = empMOBILE;
	}

}
