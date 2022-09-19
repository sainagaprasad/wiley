
public class stringdemo {
	public stringdemo() {
		String s1="nothing";
		System.out.println(s1);
		s1="something";
		System.out.println(s1);
		String s2=new String("java");//creating a new object using new keyword
		String s3="java";
		String s4=new String("java");
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		s2.compareTo(s4);
		StringBuffer s=new StringBuffer("sai");
		int a=s.toString().length();
	}
}
/*
 * in jvm memory there is a component which is referred as "string pool" a memory inside heap memory
 * all the unique string as occupied in this pool
 * if new objects similar to existing one , the new memory will not get initiated, but reference points to existing memory
 */
/*
 * String buffer and String builder
 * mutable versions of strings
 * not first class objects
 */