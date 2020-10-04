package Assignments;

import java.util.Scanner;

interface Taxable{
	float salesTax = 7f;
	float incomeTax = 10.5f;
	abstract void calcTax();
}

class Employee implements Taxable{
	int EmpId;
	String name;
	float salary;
	public Employee(int EmpId, String name, float salary) {
		this.EmpId = EmpId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public void calcTax() {
		float empIncomeTax = salary*incomeTax/100;
        System.out.println("Income tax of employee is : "+empIncomeTax);
	}
}

class Product implements Taxable{
	int pid;
	float price;
	int quantity;
	public Product(int pid, float price, int quantity) {
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public void calcTax() {
		double productSaleTax = price*quantity*salesTax/100;
        System.out.println("Sale tax of Product is : "+productSaleTax);
		
	}
}
public class Q49 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int empId = sc.nextInt();
		System.out.println("Enter employee name : ");
		String name = sc.next();
		System.out.println("Enter salary : ");
		float salary = sc.nextFloat();
		
		Employee e = new Employee(empId, name, salary);
		e.calcTax();
		
		System.out.println("Enter product Id : ");
		int pid = sc.nextInt();
		System.out.println("Enter product price : ");
		float price = sc.nextFloat();
		System.out.println("Enter quantities : ");
		int quantity = sc.nextInt();
		sc.close();
		
		Product p = new Product(pid, price, quantity);
		p.calcTax();
	}

}
