package Assignment;

public class main {
	public static void main()
	{
		BankAccount obj= new BankAccount();
		
		BankAccount obj1= new BankAccount(1, "prateek", 10000000);
		BankAccount obj2= new BankAccount(2, "Naga" ,1200 ,AccountType.Savings);
		BankAccount obj3= new BankAccount(3 , "mohit" , 0 );
		BankAccount obj4= new BankAccount(4 , "jaid" , 0 ,AccountType.Current);
		BankAccount obj5= new BankAccount(5 , "sagar" , 1500,AccountType.Current );
		
		obj1.withdrawAmount(999.0);
		obj1.getCurrentBalance();
		obj2.withdrawAmount(300);
		obj3.depositAmount(500);
		obj.getCurrentBalance();
		obj5.withdrawAmount(600);
		obj4.getCurrentBalance();	
		
	}
}
