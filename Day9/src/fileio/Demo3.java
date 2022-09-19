package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) {
		//Different methods of initialising files
//		File f=new File("First.txt");
//		FileInputStream fis=new FileInputStream(f);
//		FileInputStream fis1=new FileInputStream("first.txt");
//		FileInputStream fis2=new FileInputStream(new File("first.txt")); more readable and best method to use
		try(FileInputStream fis3=new FileInputStream("first.txt");){
			int i=0;
			while((i=fis3.read())!=-1) {
				System.out.println((char)i);
			}
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
