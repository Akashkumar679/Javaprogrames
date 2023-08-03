package com.jsp.Stringclass;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class RegularExpression1 {

	public static void main(String[] args) {
     Pattern p=Pattern.compile("[ab]{2,5}");
/*index no( 0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 ,15)
 *          l | e | n | x | y | a | b | e | f | g | h  | a  | g |  a  | b |           
        */                    
     
     Matcher m= p.matcher("abef46ghagb53babba446");
     while(m.find()) {
    	 System.out.println(m.start()+"," + m.end()+","+m.group());
     }
	}

}
