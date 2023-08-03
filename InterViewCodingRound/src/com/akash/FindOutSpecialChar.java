package com.akash;

public class FindOutSpecialChar {

	public static void main(String[] args) {
		String s="Akash@&21";
		
		int count=0;
		String removespec="";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
				&& !Character.isWhitespace(s.charAt(i))	) {
				
				count++;
			}
			else {
				removespec+=s.charAt(i);
			}
		}
		if (count==0) {
			System.out.println("there is no special charcter");
		}else {
			System.out.println("special Charcter found:"+count);
		}
		System.out.println("Removed special:"+removespec);
	}

}
