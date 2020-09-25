import java.util.Scanner;
class Circle{
    private int radius;
    private double area;
    void set(int radius){
        this.radius = radius;
    }
    void calculateArea(){
        double PI = 3.14;
        this.area = PI*radius*radius;
    }
    void show(){
        System.out.println("Area of circle is "+area);
    }
}
class Q34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        int radius = sc.nextInt();
        Circle c = new Circle();
        c.set(radius);
        c.show();
    }
}