package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class employeetest {
public static void main(String[] args) {
	Employee e1=new Employee(101,"justen",35000);
	try(FileOutputStream fos=new FileOutputStream(new File("employee.dat"),true);) {//open file in write mode so as to write anything into  it
		ObjectOutputStream oos=new ObjectOutputStream(fos); //create object output stream to pass object as output
		oos.writeObject(e1);
		System.out.println("object serialized");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	
	try(FileInputStream fis=new FileInputStream(new File("employee.dat"));) {
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee retrived=(Employee) ois.readObject();
		System.out.println("retrived employee");
		System.out.println(retrived.toString());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
