package com.smy.string; 

/** 
 * ×Ö·û´®±È½Ï£ºequals()ºÍ==µÄÇø±ð 
 * @author smy
 * 
 */

public class StringInit {  
  
    public static void main(String[] args) {  
          
        String s = "hello world";  
        String s1 = new String("hello world");  
        String s2 = new String("hello world");  
        String s3 = new String("hello");  
        String s4 = "hello world";  
          
        System.out.println(s.equals(s1));  //true
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //false
        System.out.println("------------------");  
        System.out.println(s == s1);  //false
        System.out.println(s == s3);  //false
        System.out.println(s == s4);  //true
    }  
}  
