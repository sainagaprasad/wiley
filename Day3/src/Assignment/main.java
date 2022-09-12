package Assignment;

public class main {
	public static void main(String[] args) {
		Coffee arabica = Coffee.Blackbeans;
		arabica.amount();
		
		circle c = new circle(5.5);
		c.calculateArea();
		
		fibonacci f = new fibonacci(1,233);
		f.calculateFibonacci();
		
		Date d = new Date();
		d.displayDate();
	}
}
