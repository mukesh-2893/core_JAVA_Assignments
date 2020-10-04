package Assignments;

import java.util.Scanner;

public class Q57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.nextLine();
		sc.close();
		String S[]=str.split(" ");  
	    String reverseWord="";  
	    for(String w : S){  
	        StringBuilder s=new StringBuilder(w);  
	        s.reverse();  
	        reverseWord+=s.toString()+" ";  
	    }  
	    
	    System.out.println("output : "+reverseWord);
	}

}