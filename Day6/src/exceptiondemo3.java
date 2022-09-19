import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exceptiondemo3 {
	public void processfil() {
		File f=new File("sai");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		//try with resource
		try(FileInputStream b=new FileInputStream(f);){
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
