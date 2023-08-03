package com.jsp.Stringclass;

public class WithOutStringMethod {

	public static void main(String[] args) {
      String s1="Akaskumar is goodboy";
      String s2="";
      char []a=s1.toCharArray();
      int i=a.length-1;int j=a.length-1;
      while (i>-1) {
           while(i>-1 && a[i]!=' ') i--;

			String temp="";
			int k=i+1;
			while(k<=j) {
				temp+=a[k];
				k++;
			}
			s2+=temp;
			if (i>-1) s2+=" ";
			i--;
			j=i;
           }
	
      System.out.println(s2);

}
}