
public class main {
	public static void main(String[] args) {
		//string demo
		stringdemo s=new stringdemo();	
		System.out.println();
		
		//garbage collector
		garbagecollector g1=new garbagecollector();
		garbagecollector g2=new garbagecollector();
		g1=null;
		g2=null;
		
		//forcefully invoke garbage collector
		System.gc();System.out.println();System.out.println();
		
		//other method
		garbagecollector.display();System.out.println();System.out.println();
		
		//garbage2
		garbage2.collect();
	}
}
