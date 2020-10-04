package Assignments;

import java.util.Scanner;

public class Q55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.nextLine();
		sc.close();
		
		System.out.println("Word count is : "+str.length());
	}

}
