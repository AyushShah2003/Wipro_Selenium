package Date_30_07;

import java.util.ArrayList;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ArrayList<String> list = new ArrayList<>();
		list.add("Mayank");
		list.add("Dhruv");
		list.add("Chetan");
		list.add("Nikhil");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.remove(2));
		System.out.println(list.set(1, "Dhruv M"));
		System.out.println(list);     */
		
		/* same like  arraylists
		 * capacity increment
		 difference is they are thread safe - syncronised , arraylist also but we have to do using collections.sync..
		 */
		Vector<Integer> vec = new Vector<>(5);
		vec.add(40);
		vec.add(50);
		vec.add(60);
		vec.add(70);
		vec.add(80);
		vec.remove(2);
		vec.ensureCapacity(10);
		vec.add(10); vec.add(12);
		////System.out.println(vec.getFirst());
		System.out.println(vec);
		//System.out.println(vec.getLast());
	}

}
