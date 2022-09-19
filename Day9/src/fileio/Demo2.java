package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) {
		//opening file into write mode
		try(FileOutputStream fis=new FileOutputStream("first.txt",true);) {
			//true makes sure that appending takes place instead of creating a new file and placing it there
			byte[] data="  we are learning IO".getBytes();
			fis.write(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
