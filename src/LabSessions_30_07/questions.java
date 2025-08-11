package LabSessions_30_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class questions {

	public static void find2ndLargest(ArrayList<Integer> list) {
		int first = -1, second = -1;
		for(int el:list) {
			if(el>=first) {
				second = first;
				first = el;
			}
		}
//		System.out.println("largest element is : "+first);
		System.out.println("Second largest element is :"+second);
	}
	
	public static boolean isListEqual(LinkedList<String> list1, LinkedList<String> list2) {
		if(list1.size()!=list2.size()) return false;
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)!=list2.get(i)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program 1
		Set<String> set = new HashSet<>();
		set.add("Mayank");
		set.add("Rahul");
		set.add("Amit");
		set.add("Chetan");
		set.add("Mayank");
		System.out.println(set);
		
		// Program 2 - sort
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		System.out.println("Before sort : "+list);
		Collections.sort(list);
		System.out.println("After sort : "+list);
		
		// Program 3,5 - second largest and also largest
		find2ndLargest(list);
		
		// Program 4
		LinkedList<String> list1 = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Orange");
		
		list2.add("Apple");
		list2.add("Banana");
		list2.add("Orange");
		
		System.out.println("The list elements are equal :"+isListEqual(list1,list2));
		
		
	}

}
