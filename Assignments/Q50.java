package Assignments;

import java.util.Scanner;

class Employee4{
	int EmpId;
	String name;
	float salary;
	public Employee4(int EmpId, String name, float salary) {
		this.EmpId = EmpId;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		
		return "Employee[empId "+EmpId+"Name "+name+"salary "+salary+" ]";
	}
	@Override
	public boolean equals(Object obj) {
		Employee4 t = (Employee4)obj;
		boolean isEqual = this.EmpId == t.EmpId;
		return isEqual;
	}
}
public class Q50 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			Employee4[] e = new Employee4[3];
			
			for(int i=0; i<3; i++) {
				System.out.println("Enter EmpId : ");
				int EmpId = sc.nextInt();
				System.out.println("Enter name : ");
				String name = sc.next();
				System.out.println("Enter salary : ");
				float salary = sc.nextFloat();
				
				Employee4 e1 = new Employee4(EmpId, name, salary);
				e[i] = e1;
			}
			for(Employee4 a : e) {
				System.out.println("Emp details : "+a);
			}
			int count = 0;
			for(int i=0; i<3; i++) {
				for(int j=i+1; j<3; j++) {
					if(e[i].equals(e[j])) {
						System.out.println("Id is already present : you create duplicate id ="+e[i].EmpId);
						count++;
					}
				}
			}
			System.out.println("Total duplicate values = "+count);
			System.out.println("Rentel details : ");
			for(int k=0; k<count; k++) {
				System.out.println("Enter empId : ");
				int EmpId = sc.nextInt();
				System.out.println("Enter name : ");
				String name = sc.next();
				System.out.println("Enter salary : ");
				float salary = sc.nextFloat();
				sc.close();
				
				Employee4 e1 = new Employee4(EmpId, name, salary);
				e[k] = e1;
			}
			for(Employee4 a : e) {
				System.out.println("Emp details : "+a);
			}
		} 
	
}
