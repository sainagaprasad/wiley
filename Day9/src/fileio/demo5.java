package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo5 {
	public static void main(String[] args) {
		BufferedReader r=null;
		try(FileReader fr=new FileReader(new File("first.txt"));) {
			r=new BufferedReader(fr);
			System.out.println(r.readLine());
			String line;
			while((line=r.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
