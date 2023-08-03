package fileHandling;

import java.io.File;
import java.io.IOException;

public class Cretaingfile {

	public static void main(String[] args) {
    File file=new File("C:\\Users\\DELL\\Desktop\\Handaler");
    try {
    	System.out.println(file.createNewFile());
    }
    catch(IOException e){
    	e.printStackTrace();
    }
	}

}
