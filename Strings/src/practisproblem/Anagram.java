package practisproblem;

public class Anagram {

	public static boolean anagram(String s,String s1) {
	
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		while (true) {
			if (s.length()!=s1.length())
				return false;
			char c=s.charAt(0);
			s=s.replace(c+"","");
			s1=s1.replace(c+"", "");
			if (s.length()==0 && s1.length()==0) {
				return true;
			}
		}
	}
	
	public static void main(String[] args) {
		String s="listen";
		String s1="silent";
		System.out.println(anagram(s, s1));
	}

}
