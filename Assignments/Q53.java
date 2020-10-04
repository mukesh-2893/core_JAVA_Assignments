package Assignments;

public class Q53 {

	public static void main(String[] args) {
		String str = "67, 89, 23, 67, 12, 55, 66";
		
		String[] s = str.split(",");
		int sum = 0;
		
		for(String a : s) {
			int i = Integer.parseInt(a);
			sum = sum+i;
		}
		System.out.println("Sum of integer value : "+sum);
		

	}

}
