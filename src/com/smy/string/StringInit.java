package com.smy.string; 

/** 
 * 字符串比较：equals()和==的区别 
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
          
        System.out.println(s.equals(s1));;  
        System.out.println(s1.equals(s2));  
        System.out.println(s1.equals(s3));  
        System.out.println("------------------");  
        System.out.println(s == s1);  
        System.out.println(s == s3);  
        System.out.println(s == s4);  
    }  
}  