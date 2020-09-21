import java.util.Scanner;
class Q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the gender : ");
        String a = sc.next();
        System.out.print("Enter the age : ");
        int b = sc.nextInt();

        if(b>=21){
            System.out.println("Eligible for marriage.");
        }
        else{
            System.out.println("Not eligible for marriage.");
        }
    }
}