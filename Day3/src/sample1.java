
public class sample1 {
	public static void main(String[] args) {
		sample1 b=new sample1();
		System.out.println("forloop");
		b.forloop(8);
		System.out.println("while loop");
		b.whileloop(9);
		System.out.println("do while loop");
		b.dowhileloop(5);
		System.out.println("switch");
		b.switchcase(2);
		b.switchcase(1);
		System.out.println("if-else conditional statement");
		b.ifelse(20);
		System.out.println();
		System.out.println("Constructor");
		constructor_employee employee1=new constructor_employee();
		employee1.print();
		constructor_employee employee2=new constructor_employee(102,"sai","prasad");
		employee2.print();
	}

	private void ifelse(int i) {
		// TODO Auto-generated method stub
		if(i>20) {
			System.out.println("number greater than 20");
		}
		else if(i==20){
			System.out.println("number greater than 20");
		}
		else {
			System.out.println("number less than 20");
		}
	}

	private void switchcase(int i) {
		// TODO Auto-generated method stub
		switch(i) {
		case 1:
			System.out.println("add");
			break;
		case 2:
			System.out.println("substract");
			break;
		}
		
	}

	private void forloop(int j) {
		// TODO Auto-generated method stub

		for(int i=j;i>0;i--) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

	private void whileloop(int i) {
		// TODO Auto-generated method stub
		while(i>0) {
			System.out.println(i);
			if(i==3) {
				break;
			}
			i--;
		}
		
	}

	private void dowhileloop(int i) {
		// TODO Auto-generated method stub
		do {
			System.out.println(i);
			i--;
		}while(i>0);
	}

}
