import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius : ");
		int radius = sc.nextInt();

		double area = 2*PI*radius;
		double circumference = PI*radius*radius;

		System.out.println("Area of circle is "+area+"\nCircumference of circle is "+circumference);
	}
}