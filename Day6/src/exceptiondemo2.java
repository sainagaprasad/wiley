import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptiondemo2 {
	public void excep() {
		try {
			throw new NullPointerException();
		}catch(Exception e)
		{
			if(e instanceof ArithmeticException) {
				System.out.println("arithmetic exception occured");
			}
			if(e instanceof NullPointerException) {
				System.out.println("Nullpointer exception");
			}
		}
		try {
			File f=new File("");
			FileInputStream fis=new FileInputStream(f);
		}catch(ArithmeticException | FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
