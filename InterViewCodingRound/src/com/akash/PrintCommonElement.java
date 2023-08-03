package com.akash;

import java.util.HashSet;
import java.util.Set;

public class PrintCommonElement {

	public static void printIntersection(int arr1[], int arr2[]) {
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (s.contains(arr2[i])) {
				System.out.println(arr2[i] + " ");
			}
		}
	}

	public static void Union(int arr1[], int arr2[]) {
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}

		for (int i = 0; i < arr1.length; i++) {
			s.add(arr2[i]);
		}
		System.out.println(s);

	}

	public static void main(String[] args) {

		int arr1[] = { 12, 23, 10, 20, 40 };
		int arr2[] = { 40, 4, 10, 23, 12 };

		printIntersection(arr1, arr2);
	}

}
