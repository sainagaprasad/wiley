import java.io.FileNotFoundException;

public class main {
	public static void main(String[] args) throws FileNotFoundException {
		//calculator
		calculator c=new calculator();
		c.execute();
		c.div(10,2);
		
		//exception throw demo throws demo
		exceptiondemo e=new exceptiondemo();
		e.method(10);
		
		//user defined exception
		int salary=1000;
		try {
		if(salary<8000) {
			throw new userdefinedexception();
		}}catch(userdefinedexception e1) {
			System.out.println(e1.getMessage());
		}
	}
}
