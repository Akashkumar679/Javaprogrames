package com.handle;

import java.io.File;
import java.io.IOException;

public class CreatingNewFile {

	public static void main(String[] args) {
		File file=new File("E:\\FileHandle\\sel.txt");
		try {
			System.out.println(file.createNewFile());
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

}
