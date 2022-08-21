package com.Aurionpro.model;

//import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StudentTest {

	public static void main(String[] args) throws IOException {
//		int ch;
//		FileReader fr=null;
//		try {
//			fr=new FileReader("./lib/test.txt");
//		}catch(FileNotFoundException fe){
//			System.out.println("file not found");
//		}
//		while((ch=fr.read())!=-1)
//			System.out.println((char)ch);
//		fr.close();
//		
		Files.lines(Paths.get("./lib/test.txt")).forEach(n->System.out.println(n));
	}

}
