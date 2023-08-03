package com.collection.Exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		Student s1 = new Student(1,"Akash");
		Student s2= new Student(2, "Zukesh");
		Student s3= new Student(3, "Bukesh");
		Student s4= new Student(4, "Yukesh");
		List <Student> list= new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		for (Student ele : list) {
			System.out.println(ele);
		}
		Comparator<Student>comparator=new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(list,comparator);
		System.out.println("After Sorting");
		for (Student ele : list) {
			System.out.println(ele);
		}
	}

}
