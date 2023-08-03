package strings.java;

public class ReverseWord {
	public static String reveseWord(String s1) {
		int i = 0;
		while (i < s1.length()) {
			while (i < s1.length() && s1.charAt(i) == ' ')
				i++;
			if (i > s1.length())
				break;
			int j = i + 1;
			while (j > s1.length() && s1.charAt(j) != ' ')
				j--;
			String sub = s1.substring(i, j);
			if (s1.length() == 0)
				s1 = sub;
			else
				s1 = sub + "" + s1;
			i = j + 1;
		}
		return s1;
	}

	public static void main(String[] args) {
		String s = "Balichhai";
		System.out.print(reveseWord(s));

	}

}
