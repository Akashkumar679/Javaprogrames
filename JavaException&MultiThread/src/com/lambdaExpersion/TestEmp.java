package com.lambdaExpersion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestEmp {

	public static void main(String[] args) {
		List<Employe> list = new ArrayList<>();
		list.add(new Employe("1", "Akash", "backend", 26));
		list.add(new Employe("2", "mukesh", "fortn", 26));
		list.add(new Employe("3", "abhi", "server", 26));
		list.add(new Employe("4", "Akash", "network", 26));
		list.add(new Employe("5", "mukesh", "design", 26));
		list.add(new Employe("6", "rakesh", "backend", 26));
		Map<String, Long>newMap = list.stream().collect
				(Collectors.groupingBy(Employe:: getDept,Collectors.counting()));
		System.out.println(newMap);
	}

}
