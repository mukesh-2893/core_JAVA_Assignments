package Assignments;

import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		System.out.println("Enter String : ");
		String s = sc.next();
		s = s.toLowerCase();
		int count = 0;
		
		for(int i=0; i<(s.length()); i++) {
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
		System.out.println("Vowels count : "+count);

	}

}
