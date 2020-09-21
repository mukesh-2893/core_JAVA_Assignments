import java.util.Scanner;
class Q27{
    public static void main(String args[]){
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        int arr[][] = new int[r][];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter columns for "+i+" th row");
            int c = sc.nextInt();
            arr[i] = new int[c];
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter element");
                arr[i][j]=sc.nextInt();
            }
        }

        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println("");
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }
}