class Employee{
    static int empNo;
    int salary;
    static int totalSalary;

    Employee(int salary){
        empNo++;
        this.salary = salary;
        this.totalSalary = totalSalary+salary;
    }

    void display(){
        System.out.println("Total employee is : "+empNo);
        System.out.println("Total Salary is : "+totalSalary);
    }

}
class Q38{
    public static void main(String[] args){
        Employee e1 = new Employee(10000);
        Employee e2 = new Employee(11000);
        Employee e3 = new Employee(12000);
        Employee e4 = new Employee(13000);
        e1.display();

    }
}