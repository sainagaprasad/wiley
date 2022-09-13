
public class main{
	public static void main(String[] args) throws CloneNotSupportedException{
		//employee
		employee e1=new employee(100, "sai");
		employee e2=new employee(100, "sai");
		if(e1.equals(e2)) {
			System.out.println("objects are equal");
		}
		else {
			System.out.println("objects are not equal");
		}
		System.out.println(e1.hashCode());
		//employee e3=e2.clone();//any predefined method which returns you object, has the return type of object class type
		//subclass ref=new superclass();
		employee e4=(employee)e2.clone();//shallow copying
		e2.setEmpname("rupesh");
		System.out.println(e2);
		System.out.println(e4);
		
		//array
		array a =new array();
		System.out.println(a.arr);//never print as such
		a.print();
		
		//Wrapper
		wrapper w=new wrapper();
		w.checkValue(20);
	}
}
/*
 * y to have deep copying when we have shallow copying??
 * 
 * 
 * reflection is process where you can get information of object at run time.
 * it gives us the information of class.
 */
/*
 * object class: cosmic super class of all classes
 * toString(): string representation of object
 * 
 */