package strings.java;

public class ReverseString {

	public static void main(String[] args) {
		String s1 = "Akashbehera";
		int n = s1.length() - 1;
		String rev = "";
		for (int i = n; i >= 0; i--) {
			rev += s1.charAt(i);
		}
		System.out.println(rev);
		

	}

}
