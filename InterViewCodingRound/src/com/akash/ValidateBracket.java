package com.akash;

import java.util.Stack;

public class ValidateBracket {

	private static boolean ValidataStringbracket(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (ch=='}') {
				if (stack.peek()=='{') {
					stack.pop();
				}else {
					return false;
				}
			}
			else if (ch==')') {
				if (stack.peek()=='(') {
					stack.pop();
				}else {
					return false;
				}
			}
			else if (ch==']') {
				if (stack.peek()=='[') {
					stack.pop();
				}else {
					return false;
				}
			}
			else {
				stack.push(ch);
			}
			
		}
		if (stack.size()==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String s = "{}()[]";
		boolean staus = ValidataStringbracket(s);
		System.out.println(s);
		System.out.println(staus);
	}

}
