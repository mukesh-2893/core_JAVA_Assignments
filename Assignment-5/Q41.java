class Employee{
    int empNo;
    String empName;
    Employee(){
        System.out.println("no-arg Parameter");
    }
    Employee(int empNo , String empName){
        this();
        this.empNo = empNo;
        this.empName = empName;
    }
    void show(){
        System.out.println("Emp No is : "+empNo + "\nEmp Name : "+empName);
    }
}
class Q41{
    public static void main(String[] args){
        Employee e = new Employee(58,"Mukesh");
        e.show();
    }
}