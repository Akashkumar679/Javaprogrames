package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingtoFile2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("C:\\Users\\DELL\\Desktop\\FileHandling\\myfile.txt");
		FileOutputStream stream=new FileOutputStream(file);
		try {
			stream.write(97);
			stream.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
