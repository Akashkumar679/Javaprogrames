package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Readingfromfile {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\DELL\\Desktop\\FileHandling\\myfile2.txt");
		if(file.canExecute()) {
			try {
				FileReader filereader=new FileReader(file);
				int i=0;
				while(true) {
					            //while((i=filereader.read())!=-1);
		            i=filereader.read();
					System.out.print((char)i);
					if (i==-1)break;
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
