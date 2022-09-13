
public class employee implements Cloneable{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public employee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	public String toString() {
		return this.empid+","+this.empname;
	}
	public boolean equals(Object o) {
		employee e=(employee)o;
		if(this.empid==e.empid)
			return true;
		return false;
	}
	public int hashCode() {
		return this.empid*8;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
/*
 * marker interfaces are the interfaces which does not have any methods into it.
 * it just marks the object for some funtionality approval given for runtime
 */