package com.lambdaExpersion;

import java.util.List;
import java.util.stream.Collectors;

public class TestFillter {

	public static void main(String[] args) {
		Employmangement e1 = new Employmangement(1, "asire", "Dell", 2);
		Employmangement e2 = new Employmangement(1, "raizon", "Hp", 6);
		Employmangement e3 = new Employmangement(1, "Obontu", "Apple", 3);
		Employmangement e4 = new Employmangement(1, "intel", "Redmi", 1);
		Employmangement e5 = new Employmangement(1, "blue", "thiem", 7);
		Employmangement e6 = new Employmangement(1, "gyjoe", "Sony", 4);

		List<Employmangement> list1= List.of(e1,e2,e3,e4,e5,e6);
		List<Employmangement> list2=list1.stream().filter(e -> e.getRam() <= 4)
				.collect(Collectors.toList());
			
	list2.forEach(System.out::println);
	}

}
