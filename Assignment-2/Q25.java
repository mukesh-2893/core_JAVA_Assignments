import java.util.Scanner;
class Q25{
    public static void main(String[] args){
        int sumEven = 0, sumOdd = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [] {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                sumEven=sumEven+arr[i];
            }
            else
            {
                sumOdd=sumOdd+arr[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);        
    }
}