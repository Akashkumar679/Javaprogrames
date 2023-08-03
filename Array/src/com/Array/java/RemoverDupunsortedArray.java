package com.Array.java;

import java.util.HashSet;

public class RemoverDupunsortedArray {

	public static void main(String[] args) {
		int a[]= {9,1,2,4,5,3,6,1,2,5,5,9,3,2,2,6};
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer n : set) {
			System.out.println(n+" ");
		}
	}

}
