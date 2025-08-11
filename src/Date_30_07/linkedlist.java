package Date_30_07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
	/*	list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.addFirst(5);
		list.addLast(45);
		list.push(null);
		System.out.println(list.peek());;  */
		Queue<Integer> qu = new LinkedList<>();
		qu.add(50);
		qu.add(100);
		qu.add(150);
		qu.add(200);
		qu.remove();
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu);
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addFirst(90);
		dq.addFirst(100);
		dq.addLast(120);
		dq.addLast(140);	
	}

}