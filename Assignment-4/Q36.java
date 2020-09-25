import java.util.*;
class MathOperation{
  
    static int multiply(int a , int b){
        return a*b;
    }
    static float multiply(float a, float b, float c){
        return a*b*c;
    }
    static int multiply(int[] arr){
        int sum = 1;
        for(int i=0; i<arr.length; i++){
            sum = sum * arr[i];
        }
        return sum;
    }
    static double multiply(double a , int b){
        return a*b;
    }
}

class Q36{
    public static void main(String[] args){
        int multiply = MathOperation.multiply(12, 14);
        System.out.println("Method A is : "+multiply);

        float multiply1 = MathOperation.multiply(5.26f,2.17f,7.98f);
        System.out.println("Method B is : "+multiply1);

        int arr[] = {2,6,9,3,8};
        System.out.println("Method C is : "+ MathOperation.multiply(arr));

        double multiply4 = MathOperation.multiply(12.15,40);
        System.out.println("Method D is : "+multiply4);
    }
}