import java.util.*;
import java.lang.*;
import java.io.*;

/**
 * print the count of camel case character in the string.
 * https://practice.geeksforgeeks.org/problems/find-the-camel/0
 */
class CountCamelCase
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int ip = sc.nextInt();
	    for(int i = 0; i < ip; i++){
	        String str = sc.next();
	        int count = 0;
	        for(char c: str.toCharArray()){
	            if(c >= 65 && c <= 90)
	                count++;
	        }
	        System.out.println(count);
	    }
	 }
}