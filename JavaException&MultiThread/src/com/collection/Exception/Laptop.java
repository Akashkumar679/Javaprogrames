package com.collection.Exception;

public class Laptop {
private int modelNo;
private String barnd;
private int storage;
private String Ram;
public Laptop(int modelNo, String barnd, int storage, String ram) {
	this.modelNo = modelNo;
	this.barnd = barnd;
	this.storage = storage;
	Ram = ram;
}
public int getModelNo() {
	return modelNo;
}
public void setModelNo(int modelNo) {
	this.modelNo = modelNo;
}
public String getBarnd() {
	return barnd;
}
public void setBarnd(String barnd) {
	this.barnd = barnd;
}
public int getStorage() {
	return storage;
}
public void setStorage(int storage) {
	this.storage = storage;
}
public String getRam() {
	return Ram;
}
public void setRam(String ram) {
	Ram = ram;
}
@Override
public String toString() {
	return "Laptop [modelNo=" + modelNo + ", barnd=" + barnd + ", storage=" + storage + ", Ram=" + Ram + "]";
}

}
