package com.js.rectangle;

public class StringRevreseWOutChngSpcCHar {
	public static void rev(char s[], int left, int right)
    {
        for (int i = left; i < right / 2; i++) {
            char temp = s[i];
            s[i] = s[right - 1 - i];
            s[right - 1 - i] = temp;
        }
    }
    public static void reverse(char s[])
    {
        char[] temp = new char[s.length];
        int x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                temp[x] = s[i];
                x++;
            }
        }
 
        rev(temp, 0, x);
 
        x = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] >= 'a' && s[i] <= 'z'
                || s[i] >= 'A' && s[i] <= 'Z') {
                s[i] = temp[x];
                x++;
            }
        }
 
        String revStr = new String(s);
        System.out.println("reversed string is: " + revStr);
    }
 
	public static void main(String[] args) {
		String str = "*A&KASH!";
        char[] charArray = str.toCharArray();
        reverse(charArray);
	}

}
