public class employee {
	private int empId,empBasicSalary;
	private double empGrossSalary;
	private String empName,empDept;
	public employee() {
		
	}
	public employee(int empid,String empName,String empDept,int empBasicSalary) {
		this.empId=empid;
		this.empName=empName;
		this.empDept=empDept;
		this.empBasicSalary=empBasicSalary;
	}
	public void calculateGrossSalary() {
		empGrossSalary=empBasicSalary*1.2;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpBasicSalary() {
		return empBasicSalary;
	}
	public double getEmpGrossSalary() {
		return empGrossSalary;
	}
	public String getEmpDept() {
		return empDept;
	}
	@Override
	public boolean equals(Object obj) {
		employee e=(employee)obj;
		if((e.getEmpId()==this.empId)&&(e.getEmpName()==this.empName)) {
			return true;
		}
		return false;
	}
}
