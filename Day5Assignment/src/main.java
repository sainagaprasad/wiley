
public class main {
	public static void main(String[] args) {
		employee e[]=new employee[] {new employee(101,"shivam","Developer",40000),new employee(102,"sai","Developer",35000),
				new employee(103,"jaid","API",42000),new employee(104,"deepak","API",45000),
				new employee(102,"sai","Developer",40000)};
		for(employee i:e) {
			i.calculateGrossSalary();
		}
		boolean a=e[1].equals(e[4]);
		System.out.println(a);
		employeesort es=new employeesort();
		es.employeesort(e);
		es.departmentemp(e, "Developer");
		employee z=new employee();
	}
}
