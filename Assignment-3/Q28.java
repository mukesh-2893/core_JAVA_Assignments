class Q28{
    public static void main(String[] args){
        int a[] = {10,2,3};
        int b[] = {4,1,6};
        int c[] = {7,8,9};
        int arr[][] = new int[3][];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for(int ar[]:arr){
            for(int d:ar){
                System.out.print(d+" ");
            }
        System.out.println("");
        }
        int max=arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[0][0]<arr[i][j])
                {
                    max=arr[i][j];
                }

            }
        }
        System.out.println("Maximum is "+max);

        int min=arr[0][0];
        int temp;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[0][0]>arr[i][j]){
                    temp = arr[0][0];
                    arr[0][0] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }
        System.out.println(arr[0][0]);
    }
}