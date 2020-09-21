import java.util.Scanner;
class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println("Greatest number is "+a);
        }
        else if(b>a && b>c){
            System.out.println("Greatest number is "+b);
        }
        else{
            System.out.println("Greatest number is "+c);
        }
    }
}