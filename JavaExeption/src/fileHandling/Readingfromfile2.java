package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Readingfromfile2 {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\DELL\\Desktop\\FileHandling\\myfile2.txt");
		if(file.canExecute()) {
			try {
				FileInputStream stream=new FileInputStream(file);
				int i=0;
				while((i=stream.read())!=-1);
				System.out.print((char)i);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
