package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Demo4 {
	public static void main(String[] args) {
			try(FileWriter fw=new FileWriter(new File("first.txt"),true);){
				fw.write(" I am adding the text into file");
				System.out.println("line added");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
