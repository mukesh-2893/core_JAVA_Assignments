import java.util.Scanner;
class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount : ");
        double p = sc.nextDouble();
        System.out.println("Enter principle rate : ");
        double r = sc.nextDouble();
        System.out.println("Enter principle years : ");
        double y = sc.nextDouble();

        double amount = p*(1+r*y);

        System.out.println(amount);
    }
}