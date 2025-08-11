package Date_30_07;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk = new Stack<>();
		stk.push("Jaggu");
		stk.push("Dharamveer");
		stk.push("virat");
		System.out.println(stk);
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		System.out.println(stk);
		System.out.println(stk.search("Jaggu"));
	}

}
