package Date_30_07;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// no duplicacy, no null value allowed, maintains insertion order, not synchronized
		Set<Integer> set = new TreeSet<>();
	/*	set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(10);
		System.out.println(set);
		set.remove(30);
		System.out.println(set);
		System.out.println(set.size());     */
		
		// no duplicacy, one null value allowed, do not maintains insertion order, not synchronized(can be made), faster than linkedhashmap
	/*	Set<String> hset = new HashSet<>();
		hset.add("Mayank");
		hset.add("Rahul");
		hset.add("Amit");
		hset.add("Chetan");
		hset.add("Prakhar");
		System.out.println(hset);
		hset.remove("Mayank");
		hset.add(null);
		System.out.println(hset);   */
		
		
		// no duplicacy, one null value allowed, maintains insertion order, synchronized, slightly slower than hashmap
		Set<String> lset = new LinkedHashSet<>();
		lset.add("Mayank");
		lset.add("Rahul");
		lset.add("Amit");
		lset.add("Chetan");
		lset.add("Prakhar");
		System.out.println(lset);
		lset.remove("Mayank");
		lset.add(null);
		System.out.println(lset);
	}

}
