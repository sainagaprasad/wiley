
public class wrapper {
	Integer i1=new Integer(290);
	Integer i2=new Integer("30");
	//Boxing : conversion of primitives into wrappers
	int x=10;
	Integer value=new Integer(x);
	//Unboxing : conversion of wrappers into primitives
	int so=value.intValue();
	
	
	public void print() {
		System.out.println(i1+""+i2);
		System.out.println(i1.compareTo(i2));
	}


	public void checkValue(Integer i) {
		// TODO Auto-generated method stub
		
	}
}
/*
 * int->Integer
 * float->Float
 * char->Character
 * double->Double
 * long->Long
 * short->Short
 */
/*
 * which predefined classes are final in java
 */