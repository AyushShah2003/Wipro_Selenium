package LabSessions_31_07;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeObj> list = new ArrayList<>();
		list.add(new EmployeeObj("Mayank",50000, 2000));
		list.add(new EmployeeObj("Amit",25000,2000));
		list.add(new EmployeeObj("Vaibhav",30000,5000));
		list.add(new EmployeeObj("Hemant",45000,6000));
		list.add(new EmployeeObj("Love",35000,1000));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
