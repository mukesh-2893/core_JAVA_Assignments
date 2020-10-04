package Assignments;

import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		String []str = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter week day index : ");
			int no = sc.nextInt();
			sc.close();
			System.out.println("Day is "+str[no]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter valid index number.");
			System.out.println(e);
		}

	}

}
