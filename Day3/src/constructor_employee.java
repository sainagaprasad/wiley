
public class constructor_employee {
	int empid;
	String empfirstname,emplastname;
	
	public constructor_employee() {
		this.empid=101;
		this.empfirstname="John";
		this.emplastname="abraham";
	}
	public constructor_employee(int empid,String empfirstname,String emplastname) {
		this.empid=empid;
		this.empfirstname=empfirstname;
		this.emplastname=emplastname;
	}
	public void print() {
		System.out.println(empid);
		System.out.println(empfirstname);
		System.out.println(emplastname);
	}
}
