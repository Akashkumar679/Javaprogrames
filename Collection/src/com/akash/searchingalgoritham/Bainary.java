package com.akash.searchingalgoritham;

public class Bainary {
	public static void main(String[] args) {
		int[] a = { 2, 5, 7, 9, 12, 14, 16, 18, 20 };
		int search = 12;
		int loweIndex = 0;
		int higherIndex = a.length - 1;
		int middleIndex = (loweIndex + higherIndex) / 2;

		while (loweIndex <= higherIndex) {
			if (a[middleIndex] == search) {
				System.out.println("Element is" + middleIndex);
			} else if (a[middleIndex] < search) {
				loweIndex = middleIndex + 1;
			} else {
				higherIndex = middleIndex - 1;
			middleIndex = (loweIndex + higherIndex) / 2;
			}
		}
		if (loweIndex > higherIndex) {
			System.out.println("Element Not found");
		}
	}
}
