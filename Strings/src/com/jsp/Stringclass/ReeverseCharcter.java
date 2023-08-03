package com.jsp.Stringclass;

public class ReeverseCharcter {

	public static void reverse(char[] str) {
		int i = 0;
		int j = str.length - 1;

		while (i < j) {
			if (!Character.isLetter(str[i]))
				i++;
			else if (!Character.isLetter(str[j])) {
				j--;
			} else {
				char temp = str[i];
				str[i] = str[j];
				str[j] = temp;
				i++;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		String str = "A&kas$h";
		char[] c = str.toCharArray();
		System.out.println("InputString:" + str);
		reverse(c);
		String rev = new String(c);
		System.out.println("reverse String:" + rev);
	}

}
