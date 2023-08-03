package com.akash.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;



public class TreeMaping  {

	public static void main(String[] args) {
		Map<String, Integer> treeMap = new TreeMap();
		treeMap.put("Sujata", 100);
		treeMap.put("Kumar", 457);
		treeMap.put("c", 101);
		java.util.Set<String> set = treeMap.keySet();
		Iterator<String>itr=set.iterator();
		while (itr.hasNext()) {
			Object keyObject=itr.next();
			Object value=treeMap.get(keyObject);
			System.out.println(keyObject+""+value);
		}
		
	}

}
