package strings.java;

public class RemoveDuplicateString{
	public static  String unique(String s) {
		String str="";
		int len=s.length();
		for (int i = 0; i <len; i++) {
			char c=s.charAt(i);
			if (str.indexOf(c)<0) {
				str+=c;
			}
		}
		return str;
	}
	public static void main(String[] args) {
		String s="aAkashkuama";
		System.out.println(unique(s));
	}
}