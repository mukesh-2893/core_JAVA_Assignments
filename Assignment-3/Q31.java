class Student{
    private int stdId;
    private String stdName;
    
    void set(int id,String name)
    {
        stdId = id;
        stdName = name;
    }
    void show()
    {
        System.out.println(stdId+" "+stdName);
    }
}
class Q31{
    public static void main(String args[])
    {
        Student s = new Student();
        s.set(101,"Mukesh Patil");
        s.show();
    }
}