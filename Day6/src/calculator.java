import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class calculator {
	public void execute() {
		int value1,value2;
		int data[]= {10};
		try {
			value1=data[0];
			value2=data[1];
			int div=value1/value2;
			System.out.println(div);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println("cant be divisible by 0");
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

	public void div(int i, int j) {
		System.out.println(i/j);
	}
	public void processfile() {
		File f=new File("a.txt");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(f);
			while(fis.read()!=-1) {
				System.out.println("output");
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
