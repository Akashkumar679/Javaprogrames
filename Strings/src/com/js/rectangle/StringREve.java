package com.js.rectangle;

public class StringREve {
	public static void main(String[] args) {

		String s = "*A&KASH!";

		System.out.println("MY STRING" + s);

		s = new StringREve().reverseString(s);

		System.out.println("Reve String : " + s);
	}

	public String reverseString(String str) {

		char[] arr = str.toCharArray();

		for (int i = 0, j = str.length() - 1; i < j;) {

			if (alphaCheck(arr[i]) && alphaCheck(arr[j])) {
				char tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			} else if (!alphaCheck(arr[i])) {
				i++;
			} else if (!alphaCheck(arr[j])) {
				j--;
			}

		}
		return String.valueOf(arr);
	}
	public boolean alphaCheck(char ch) {
		if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			return true;
		else
			return false;

	}


}
