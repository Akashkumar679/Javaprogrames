package strings.java;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s1="Gunniah";
		String []s2=s1.split(" ");
		String revrse="";
		for (int i = 0; i < s2.length; i++) {
			String word=s2[i];
			String rev="";
			for (int j = word.length()-1; j >=0; j--) {
				rev+=word.charAt(j);
			}
			revrse+=rev+"";
		}
		System.out.println(s1);
		System.out.println(revrse);
	}

}
