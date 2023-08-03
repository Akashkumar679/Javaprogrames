package com.ak.employe;

public class Employe {

	private int Empid;
	private String EmpName;
	private String Department;
	private String JobRoll;
	
	public Employe() {
	}
	public Employe(int empid, String empName, String department, String jobRoll) {
		Empid = empid;
		EmpName = empName;
		Department = department;
		JobRoll = jobRoll;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getJobRoll() {
		return JobRoll;
	}
	public void setJobRoll(String jobRoll) {
		JobRoll = jobRoll;
	}
	@Override
	public String toString() {
		return "Employe [Empid=" + Empid + ", "
				+ "EmpName=" + EmpName + ", "
				+ "Department=" + Department + ", "
				+ "JobRoll=" + JobRoll + "]";
	}
	
	
	
}
