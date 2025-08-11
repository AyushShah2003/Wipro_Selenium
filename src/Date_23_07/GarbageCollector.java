package Date_23_07;

public class GarbageCollector {
	//null gc
	//refrencing other gc
	//isolating scope gc
	
	//it will be called when run gc
	public void finalize() {
		System.out.println("Finalize method called befor garbage collected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector obj = new GarbageCollector();
		obj = null; //make object eligible for gc
			
		GarbageCollector obj2 = obj; // refrencing
		
		{
		    Object o = new Object();  // goes out of scope
		}
		
		System.gc(); // suggesting jvm to run garbage collection
	}

}