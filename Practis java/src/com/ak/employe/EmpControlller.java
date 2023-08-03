package com.ak.employe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpControlller {

	public static void main(String[] args) {
		List<Employe> list = new ArrayList<>();
		list.add(new Employe(1, "Akash", "Production", "java"));
		list.add(new Employe(2, "Rakesh", "Testing", "java"));
		list.add(new Employe(3, "Suresh", "Designing", "Ui"));
		list.add(new Employe(4, "Akash", "DataBase", "sql"));
		list.add(new Employe(5, "Mukesh", "Devloper", "java"));
		
		Map<String, Long> empMap=list.stream().collect(Collectors
				.groupingBy(Employe::getDepartment,Collectors.counting()));
		System.out.print(empMap);
	}
}
