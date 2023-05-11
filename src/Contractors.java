public class Contractors extends FullTime{
    int bonus;

    int extraSalary;


    //public Contractors(int bonus, int extraSalary) {
     //   this.bonus = bonus;
     //   this.extraSalary = extraSalary;
   // }

    @Override
    public double calculateSalary(){
        //double salaryContactor =salary+bonus+ extraSalary;
        return super.calculateSalary()+5000+3500;

    }
}
