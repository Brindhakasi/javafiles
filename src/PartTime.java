public class PartTime extends Employee{

    int hours;
    int hourlyWage;
    @Override
    public double calculateSalary(){
        double salary=hours*hourlyWage;
        return salary;
    }
}
