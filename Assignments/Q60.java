package Assignments;

import java.util.*;

interface StudentFee
{
	int getFee() throws Exception;
}
class Student1 implements StudentFee{
	private int fee;
	public int getFee() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee : ");
		fee=sc.nextInt();
		if(fee<=0 || fee >100000)
		{
			throw new Exception("Invalid fee");
		}
		return fee;
		}
}
public class Q60 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			Student1 fee = new Student1();
			System.out.println("Student fee : "+fee.getFee());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
			
	}

}