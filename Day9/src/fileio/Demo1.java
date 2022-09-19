package fileio;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
		File f = new File("d:\\first.txt");
		try {
			if (f.exists()) {
				f.createNewFile();// creates an exception as compiler is unaware of the file
				System.out.println("New file generated");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/*
 * Byte hierarchy 
 * character hierarchy
 * 
 */