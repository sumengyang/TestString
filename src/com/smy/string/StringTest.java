package com.smy.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello world";
		String str2 = "hello world";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		

		String str = "I like";// ---------1--------
		System.out.println(System.identityHashCode(str));
		str = str + "java";// --------2---------
		System.out.println(System.identityHashCode(str));

		String s = new String();
		System.out.println(s);
		String s1 = new String("hello");
		System.out.println(s1);
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String s2 = new String(c);
		System.out.println(s2);
		String s3 = new String(c, 1, 3);
		System.out.println(s3);
	}

}
