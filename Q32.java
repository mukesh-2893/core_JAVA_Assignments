class Student{
    private int stdId;
    private String stdName;
    public static int counter=0;

    Student(int id,String name){
        stdId = id;
        stdName = name;
        counter++;
    }
}
class Q32{
    public static void main(String[] args){
        Student s1 = new Student(1,"Mukesh");
        Student s2 = new Student(2,"Sudhanshu");
        Student s3 = new Student(3,"Chetana");
        Student s4 = new Student(4,"Mayuri");
        Student s5 = new Student(5,"Sudarshan");

        System.out.println("Total objects count "+Student.counter);
    }
}