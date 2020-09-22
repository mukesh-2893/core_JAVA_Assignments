import java.util.Scanner;
class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int days, year, months, day;
        System.out.print("Enter the number of days:");
        days = sc.nextInt();
        year = days / 365;
        days = days % 365;
        System.out.println("No. of years:"+year);
        months = days / 30;
        days = days % 30;
        System.out.println("No. of Months:"+months);
        day = days;

        System.out.println("No. of days:"+day);
    }
}