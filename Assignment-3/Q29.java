import java.util.Scanner;
class Q29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
        int arr[][]=new int[r][];
        for(int i=0; i<arr.length; i++){
            int count = 0;
            System.out.println("Enter number of cols");
            int c = sc.nextInt();
            arr[i]=new int[c];

            for(int j=0; j<arr[i].length; j++)
            {
               arr[i][j] = sc.nextInt();
            }
            
        }
        System.out.println("");
        for(int i=0; i<arr.length; i++){
            int counter=0;
            for(int j=0; j<arr[i].length; j++){
                
                if(arr[i][j]!=0){
                    counter++;
                }
                
            }
            System.out.println("Elements present at " + i + "th row is "+counter);
        }
    }
}