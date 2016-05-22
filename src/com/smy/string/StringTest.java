package com.smy.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello world";
		String str2 = "hello world";
		System.out.println(str1 == str2);  //true
		System.out.println(str1.equals(str2));//true
		

		String str = "I like";// ---------1--------
		System.out.println(System.identityHashCode(str));//123
		str = str + "java";// --------2---------
		System.out.println(System.identityHashCode(str));//反正不是123

		String s = new String();
		System.out.println(s); //空行
		String s1 = new String("hello");
		System.out.println(s1);//hello
		char[] c = { 'h', 'e', 'l', 'l', 'o' };
		String s2 = new String(c);
		System.out.println(s2);//hello
		String s3 = new String(c, 1, 3);
		System.out.println(s3);//ell
	}

}
