package Assignments;

import java.util.Scanner;

abstract class Processor{
	int data;
	abstract void process();
	void showData() {
		System.out.println(data);
	}
}

class Factorial extends Processor{
	int num, fact=1;
	void process(){
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		
	}
	void showData() {
		System.out.println(fact);
	}
}
class Circle extends Processor{
	float radius;
	float area;
	float PI = 3.14f;
	void process() {
		System.out.println("Enter radius of circle : ");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextFloat();
		area = PI*radius*radius;
		sc.close();
		
	}
	void showData() {
		System.out.println(area);
	}
}

public class Q48 {

	public static void main(String[] args) {
		
		
		Processor f = new Factorial();
		f.process();
		f.showData();
		Processor c = new Circle();
		c.process();
		c.showData();

	}

}
