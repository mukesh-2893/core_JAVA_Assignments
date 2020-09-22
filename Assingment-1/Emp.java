import java.util.Scanner;
class Emp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first name : ");
        String name = sc.next();
        
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        
        System.out.println("Enter full name  : ");
        String fname = sc.next();
        sc.next();

        System.out.println("Enter your gender(M/F) : ");
        char gender = sc.next().charAt(0);
        
        System.out.println("Enter value 2/4 : ");
        float value = sc.nextFloat();


        System.out.println(name);
        System.out.println(age);
        System.out.println(fname);
        System.out.println(gender);
        System.out.println(value);
    }
}