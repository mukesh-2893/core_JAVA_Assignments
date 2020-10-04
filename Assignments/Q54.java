package Assignments;

import java.util.Scanner;

public class Q54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any string : ");
		String str = sc.next();
		sc.close();
		
		StringBuilder s = new StringBuilder(str);
		s.reverse();
		
		System.out.println("reverse string : "+s);

	}

}
