class Faculty{
    int facultyId ;
    int salary ;
    
    void input(int facultyId){
        this.facultyId = facultyId;
    }
    void printSalary(){
        System.out.println("Salary is : "+salary);
    }
} 
class FullTimeFaculty extends Faculty{
    int basicSalary;
    int allowance;

    void input(int facultyId ,int basicSalary , int allowance){
        super.input(facultyId);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.salary = basicSalary + allowance;
    }

}
class PartTimeFaculty extends Faculty{
    int workingHours;
    int ratePerHour;
    void input(int facultyId , int workingHours , int ratePerHour){
        super.input(facultyId);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
        this.salary = workingHours * ratePerHour;
    }
}

class Q44{
    public static void main(String[] args){
        FullTimeFaculty ftf = new FullTimeFaculty();
        ftf.input(1,25000,3000);
        ftf.printSalary();

        PartTimeFaculty ptf = new PartTimeFaculty();
        ptf.input(2,1000,200);
        ptf.printSalary();

    }
}