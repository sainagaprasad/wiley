
public class array {
	int[] arr=new int[9];
	int[] arr1=new int[] {18,38,4,46,281};
	employee e1[]=new employee[] {new employee(102,"sai"),new employee(103,"rupesh")};
	public void print(){
		//normal for loop
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		//enhanced for loop
		for(int i:arr1) {
			System.out.println(i);
		}
	}
}
/*
 * arrays will always ahev default values
 * created in hesp memory
 * datatype[] arrayname = new datatype[size of array];
 * never print the array directly as it print the array memory location instead of its elements
 * similar to datatype objects can also be created by objects
 */