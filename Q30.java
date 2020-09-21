import java.util.Scanner;
class Q30{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        int arr[][] = new int[r][];

        for(int i=0; i<arr.length; i++){
            int count = 0;
            System.out.println("Enter number of cols");
            int c = sc.nextInt();
            arr[i] = new int[c];
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array");
        for(int ar[]:arr){
            for(int a:ar){
                System.out.print(a);
            }
            System.out.println("");
        }
        System.out.println("Sum of diagonal elements");
        int sum=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<=i; j++){
                sum = sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}