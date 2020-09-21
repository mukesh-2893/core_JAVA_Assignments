import java.util.Scanner;
class qq{
    // static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter name");
            String a = sc.next();
            sc.next();
    
            System.out.println("Enter char");
            char c = sc.next().charAt(0);
    
            System.out.println("Enter age");
            int age = sc.nextInt();
    
            System.out.println("Enter name");
            String b = sc.next();
    
    System.out.println(a+" "+c+" " +b);
    
        }
    }
}