package com.jsp.String;



public class Emp {
    String name;
    public Emp(String name) {
    	this.name=name;
    }
    @Override
    public String toString() {
//    	return "["+name+"]";
    	return "Emp[name="+name+"]";
    }
}
