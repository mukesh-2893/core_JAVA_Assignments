import java.util.Scanner;
class Q11 {  
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter swapping element1 : ");  
     int x = sc.nextInt();
     System.out.print("Enter swapping element2 : ");  
     int y = sc.nextInt();

     System.out.println("After swapping");  
     x = x + y;  
     y = x - y;  
     x = x - y;  
     System.out.println("value of element1 :" + x);  
     System.out.println("value of element2 :" + y);  
 }  
}   