import java.util.Scanner;
class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temp in Fahrenheit : ");
        double f = sc.nextDouble();

        double t = 5*(f-32)/9;
        System.out.println(t);
    }
}