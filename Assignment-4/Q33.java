class Student{
    private int empId;
    private String empName;
    void set(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    void show(){
        System.out.println(empId+" "+empName);
    }
}
class Q33{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.set(555, "Mukesh");
        s1.show();
    }
}