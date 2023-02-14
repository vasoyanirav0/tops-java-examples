package com.file;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderDemo {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("tops2.txt");
		String s="This is file writer/reader example";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("File Writen Successfully");
		
		FileReader fr=new FileReader("tops2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
