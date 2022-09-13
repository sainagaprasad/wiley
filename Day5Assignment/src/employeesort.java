
public class employeesort {
	public void employeesort(employee[] e) {
		for(int i=0;i<e.length;i++) {
			for(int j=i+1;j<e.length;j++) {
				if(e[i].getEmpBasicSalary()>e[j].getEmpBasicSalary()) {
					employee y=e[i];
					e[i]=e[j];
					e[j]=y;
				}
			}
		}
		System.out.println("Sorting completed");
		for(employee i:e) {
			System.out.println("empid"+i.getEmpId() +"\nempName"+i.getEmpName()+"\nempDept"+i.getEmpDept()+"\nempGrossSalary"+i.getEmpGrossSalary());
		}
		System.out.println();
	}
	public void departmentemp(employee e[],String dept) {
		System.out.println("employees with department "+dept+" are:");
		for(employee i:e) {
			if(i.getEmpDept()==dept) {
				System.out.println("empid"+i.getEmpId()+"\nempName"+i.getEmpName()+"\nempDept"+i.getEmpDept()+"\nempGrossSalary"+i.getEmpGrossSalary());
			}
		}
	}
}
