import java.util.Scanner;
class Q24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Enter element");
        int num = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                System.out.println("Element present at index "+i);
            }
            else{
                System.out.println("Number not found in array");
                break;
            }
        }
    }
}