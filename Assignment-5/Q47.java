import java.util.*;
class Person{
   Person(){
       this(45);
       System.out.println("no-arg Person ");
   }
    Person(int i){
       System.out.println("parameterized arg Person ");
   }
}
class Employee extends Person{
    Employee(){
        this(12);
        System.out.println("no agr Employee ");
    }
    Employee(int i){
        System.out.println("parameterized agr Employee ");
    }
}


class Q47{
    public static void main(String[] args){
        Employee e1 = new Employee(1);
    }
}