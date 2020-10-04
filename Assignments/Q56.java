package Assignments;

import java.util.Scanner;

public class Q56 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.nextLine();
		sc.close();
		String s1[]=str.split(" ");  
	    String FinalAns="";  
	    for(String w : s1){  
	        String firstLetter=w.substring(0,1);  
	        String afterfirstLetters=w.substring(1);  
	        FinalAns+=firstLetter.toUpperCase()+afterfirstLetters+" "; 
	    }
	    System.out.println("output is: "+FinalAns);
	}

}