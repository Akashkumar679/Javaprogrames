package com.handle;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Fileread {

	public static void main(String[] args) throws IOException {
		File file=new File("E:\\FileHandle\\sel.txt");
		if(file.canExecute()) {
		try {
			FileInputStream stream=new FileInputStream(file);
			int i=0;
			while ((i=stream.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}
	}

}
