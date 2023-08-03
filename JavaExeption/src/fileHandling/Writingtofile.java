package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writingtofile {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\DELL\\Desktop\\FileHandling\\myfile2.txt");
		FileWriter writer=new FileWriter(file);
		writer.write("My name is Akash");
		writer.close();
	}

}
