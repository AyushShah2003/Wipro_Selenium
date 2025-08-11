package Date_31_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	int roll;
	String name;
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	@Override
	public int compareTo(Student s) {
//		return this.roll - s.roll;
		return this.name.compareTo(s.name);
	}
	public String toString() {
		return roll+"_"+name;
	}
}
public class comparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.roll - o2.roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student(5,"Sohan"));
		list.add(new Student(2,"Amit"));
		list.add(new Student(4,"Balram"));
		list.add(new Student(1,"Mayank"));
		list.add(new Student(3,"Ravi"));
		Collections.sort(list);
		System.out.println("After comparable :"+list);
		Collections.sort(list, new comparator());
		System.out.println("After custom comparator :"+list);
	}

}
