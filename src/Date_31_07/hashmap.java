package Date_31_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key value pair, no duplicate keys, no ordering, values can be duplicated
		//multiple null values allowed but only one null key allowed  -- faster
	/*	Map<Integer,String> map = new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.put(4, "Guava");
		map.put(5, null);
		map.put(3, "Papaya");
		map.put(null, null);
		map.put(null, null);
		
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}   */
		
		//key value pair, no duplicate keys, ordering natural or comp, values can be duplicated
		//multiple null values but no null keys allowed, self balancing BST,redblack tree-- slower
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "Apple");
		tmap.put(2, "Banana");
		tmap.put(3, "Orange");
		tmap.put(4, "Guava");
		tmap.put(5, null);
		tmap.put(8, null);
		tmap.put(3, "Papaya");
		System.out.println(tmap.firstKey()+"---"+tmap.lastKey());
		Iterator itr2 = tmap.entrySet().iterator();
		while(itr2.hasNext()) {
			Entry entry = (Entry) itr2.next();
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}

}