package com.akash.map;

import java.util.HashMap;
import java.util.Map;

public class Maping {
	public static void main(String[] args) {
		Map<Integer, String> s = new HashMap<Integer, String>();
		System.out.println(s.put(101,"java"));
		System.out.println(s.put(102,"sql"));
		System.out.println(s.put(103, "java"));
		System.out.println("size=" + s.size());
	}
}
