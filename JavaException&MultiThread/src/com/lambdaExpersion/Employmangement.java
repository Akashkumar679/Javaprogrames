package com.lambdaExpersion;

public class Employmangement {
private int Empid;
private String EmpName;
private String Procces;
private int Ram;
public Employmangement(int empid, String empName, String procces, int ram) {
	Empid = empid;
	EmpName = empName;
	Procces = procces;
	Ram = ram;
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
public String getProcces() {
	return Procces;
}
public void setProcces(String procces) {
	Procces = procces;
}
public int getRam() {
	return Ram;
}
public void setRam(int ram) {
	Ram = ram;
}
@Override
public String toString() {
	return "Employmangement [Empid=" + Empid + ", EmpName=" + EmpName + ", Procces=" + Procces + ", Ram=" + Ram + "]";
}

}
