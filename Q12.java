import java.util.Scanner;
class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        int basic;
        double DA, HRA, GS;
        basic = sc.nextInt();
        if(basic>=10000){
            DA = basic*0.98;
            GS = basic + DA + 2000;
            System.out.println("Gross salary is "+GS);
        }
        else{
            DA = basic*0.9;
            HRA = basic*0.1;
            GS = basic + DA + HRA;
            System.out.println("Gross salary is "+GS);            
        }

    }
}