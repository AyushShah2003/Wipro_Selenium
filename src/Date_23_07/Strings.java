package Date_23_07;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello world";
		char ch[]= {'r','a','m','a','m'};
		String str2=new String(ch);
		System.out.println(str1+" -- "+str2);
		
		/*
		Methods
		.equals  |  .equalsIgnoreCase
		.concat(String)
		.contains(char)
		.substring(beginIndex,endIndex)
		.replace(old char,new char)
		.comareTo(another string)
		.split(char)
		.replaceAll(regex,string)
		.startsWith(prefix)
		.endsWith(suffix)
		String.join(inbetweenchar,str1,str2)
		*/
		System.out.println(str1.contains("l"));
		System.out.println(str1.substring(2,4));
		System.out.println(str1.replace('h', 'y'));
		System.out.println(str1.isEmpty());
		System.out.println(str1.endsWith("orld"));
		System.out.println(String.join("_",str1,str2));
		System.out.println(str2.compareTo(str1));
		System.out.println(Arrays.toString(str1.split(" ")));
		System.out.println(str1.concat(str2));
//		System.out.println();
		System.out.println("ram".compareTo("pr"));
		
	}

}