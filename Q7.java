import java.util.Scanner;
class Q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of following subjects");
		System.out.println("=====================================");
		System.out.print("Physics :");
		int phy = sc.nextInt();
		System.out.print("\nChemestry :");
		int che = sc.nextInt();
		System.out.print("\nBiology :");
		int bio = sc.nextInt();
		System.out.print("\nMaths :");
		int math = sc.nextInt();
		System.out.print("\nMechanics :");
		int mech = sc.nextInt();

		int per = ((phy + che + bio + math + mech)/500)*100;
		System.out.println("\nPercentage marks = "+per+"%");
	}
}