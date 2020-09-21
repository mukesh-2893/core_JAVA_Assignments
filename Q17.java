import java.util.Scanner;
class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num, reverse=0;
        num = sc.nextInt();
        while(num != 0){
            int number = num%10;
            reverse = reverse*10+number;
            num = num/10;
        }
        System.out.println("Reverse number is "+num);
    }
}