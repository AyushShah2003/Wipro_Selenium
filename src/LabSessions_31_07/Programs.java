package LabSessions_31_07;

public class Programs {
	
	public static void getStringFormat(String str) {
		StringBuilder res = new StringBuilder();
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			} else {
				res.append(count);
				res.append(str.charAt(i-1));
				count = 1;
			}
		}
		res.append(count);
		res.append(str.charAt(str.length()-1));
		System.out.println(res.toString());
	}
	
	public static void getSecondLargest(int arr[]) {
		int f = -1, s = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=f) {
				s = f;
				f = arr[i];
			}
		}
		System.out.println("Second Largest element is : "+s);;
	}
	
	public static void firstNonRepeatingChar(String str) {
		int freq[] = new int[26];
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)-'a']++;
		}
		char ch = '.';
		for(int i=0;i<str.length();i++) {
			if(freq[str.charAt(i)-'a']==1) {
				ch = str.charAt(i);
				break;
			}
		}
		if(ch=='.') System.out.println("All characters are repeating...");
		else System.out.println("First non repeating char is :"+ch);
	}
	
	public static void printNum(int cur) {
		if(cur == 101) {
			return;
		}
		System.out.print(cur+" ");
		printNum(cur+1);
	}
	
	public static void reverse(int num) {
		int rev = 0;
		while(num>0) {
			rev = rev*10 + num%10;
			num /= 10;
		}
		System.out.println("The reversed number is : "+rev);
	}

	public static void main(String[] args) {
		// Program 1
		String str = "aabbbccccd";
		getStringFormat(str);
		// Program 2
		int arr[] = {10,50,15,55,30,20,45};
		getSecondLargest(arr);
		// Program 3
		String str2 = "abcdabcdefdk";
		firstNonRepeatingChar(str2);
		// Program 4
		printNum(1);
		System.out.println();
		// Program 5
		int num = 1234;
		reverse(num);
	}

}
