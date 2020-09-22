import java.util.Scanner;
class Q19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        for(int i=12; i<=num; i=i+10)
        {
            System.out.println(i);
        }
    }
}