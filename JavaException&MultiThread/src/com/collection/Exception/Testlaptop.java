package com.collection.Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testlaptop {

	public static void main(String[] args) {
		Laptop s1=new Laptop(1536, "Dell", 500, "4GB");
		Laptop s2=new Laptop(4236, "Hp", 420, "5GB");
		Laptop s3=new Laptop(6538, "Accer", 510, "8GB");
		Laptop s4=new Laptop(2456, "Lenovo", 550, "3GB");
		Laptop s5=new Laptop(1500, "Apple", 1000, "2GB");
		List<Laptop> list2=new ArrayList<>();
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		list2.add(s4);
		list2.add(s5);
		for (Laptop ele : list2) {
			System.out.println(ele);
		}
		Comparator<Laptop>comparator=new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				return o1.getBarnd().compareToIgnoreCase(o2.getBarnd());
			}
		};
		Collections.sort(list2,comparator);
		System.out.println("After sorting");
		for (Laptop ele :list2) {
			System.out.println(ele);
		}
	}

}
