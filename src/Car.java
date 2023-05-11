public class Car extends Vehicle{
    String type;
    boolean highInsurance;
    //String name;

    public Car(String color, String make, int year) {
        super(color, make, year);
        this.type= type;
        this.highInsurance= highInsurance;
        name ="xyz";
    }

    public void drive(){
        type =" SUV";
        make =" Toyota";
        System.out.println("car is running");
        //System.out.println(super.name);

    }
    @Override
    public void accelerate(){
        System.out.println("car is accelerating");
    }


}
