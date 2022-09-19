
public class garbagecollector {
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void display() {
		// TODO Auto-generated method stub
		String s3="something";
		s3=null;
		System.gc();
	}
}
