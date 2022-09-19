package serialize;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empid;
	private String empname;
	private int salary;
	public Employee(int empid, String empname, int salary) {
		// TODO Auto-generated constructor stub
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
}
