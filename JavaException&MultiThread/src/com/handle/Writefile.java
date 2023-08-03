package com.handle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
public static void main(String[] args) {
	File file=new File("E:\\FileHandle\\sel.txt");
	try {
		FileWriter write=new FileWriter(file);
		write.write("Hi i am Akash from Odisha");
		write.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
