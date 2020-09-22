import java.util.Scanner;
class Q21{
    public static void main(String args[]){
        int sum = 0, average = 0;
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0; i<10; i++)
        {   
            System.out.println("Enter array element at index "+i);
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++)
        {
            sum=sum+arr[i];
            average = sum/10;
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
    }
}