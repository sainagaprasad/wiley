import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptiondemo {
	public void method(int i) {
		if(i<15) {
			throw new NullPointerException();
		}
	}
	public void processfile(String s) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(s);
	}
}
