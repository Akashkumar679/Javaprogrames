package com.jsp.Stringclass;

public class Substring {
	/*
	 * public String substring(int beginIndex, int endIndex) { int length =
	 * length(); checkBoundsBeginEnd(beginIndex, endIndex, length); if (beginIndex
	 * == 0 && endIndex == length) { return this; } int subLen = endIndex -
	 * beginIndex; return isLatin1() ? StringLatin1.newString(value, beginIndex,
	 * subLen) : StringUTF16.newString(value, beginIndex, subLen); }
	 */

	public static void main(String[] args) {
		String b = "Akashbehera";
		System.out.println(b.length());
		System.out.println(b.substring(0, 5));
		System.out.println(b.substring(5, 11));
	}
}
