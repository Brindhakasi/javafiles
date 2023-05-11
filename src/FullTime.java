public class FullTime extends Employee {
    String perks;
    String position;
    double salary;

//    public FullTime() {
//        super();// it default called the parent class first then allocated memory for all the attributes
//
//    }


    @Override
    public double calculateSalary(){
        return (5000*12*1.5);



    }

}
