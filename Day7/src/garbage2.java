
public class garbage2 {
	static void collect(){
		long total=Runtime.getRuntime().freeMemory();
		System.out.println("current free memory :"+total);
		//allocate the meory so that it is been used by program
		int arr[]=new int[1000];
		arr[0]=1;
		if(arr[0]==3) {
			return;
		}
		long total2=Runtime.getRuntime().freeMemory();
		System.out.println("free memory at gc :"+total2);
		//collect garbage
		System.gc();
		long total3=Runtime.getRuntime().freeMemory();
		System.out.println("free memory after gc:"+total3);
		
	}
}
