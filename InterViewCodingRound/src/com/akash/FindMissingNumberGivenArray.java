package com.akash;

public class FindMissingNumberGivenArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,10};
		
		int sum=(10*11)/2;
		
		int findnum=0;
		
		for (int i = 0; i < arr.length; i++) {
			findnum=findnum+arr[i];
		}
		System.out.println("missing number is:"+ (sum-findnum));
	}

}
