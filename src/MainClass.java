import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please give input as Rectangle Triangle, Square, RightAngleTriangle");
        String input=sc.next();

        // abstractShape main
        switch (input){
            case "Rectangle":
                System.out.println("provide width for calculate area and perimeter of rectangle");
                double width= sc.nextDouble();
                System.out.println("provide height for calculate area and perimeter of rectangle");
                double height= sc.nextDouble();


                Rectangle rectangle =new Rectangle(width, height);
                rectangle.calculateArea();
                rectangle.calculatePerimeter();
                System.out.println("the area of rectangle is = "  +rectangle.calculateArea());
                System.out.println("the perimeter of rectangle is = "  +rectangle.calculatePerimeter());
                break;
            case "Triangle":
                Triangle triangle= new Triangle(2,5,10,20,30);
                triangle.calculateArea();
                triangle.calculatePerimeter();
                System.out.println("the area of triangle is = "  +triangle.calculateArea());
                System.out.println("the perimeter of triangle is = "  +triangle.calculatePerimeter());
                break;
            case "Square":

                System.out.println("please provide width to calculate area and perimeter of square");
                double width1=sc.nextDouble();

                Square square =new Square(width1);
                square.calculateArea();
                square.calculatePerimeter();
                System.out.println("The area of square is = " +square.calculateArea());
                System.out.println("The perimeter of square is = " +square.calculatePerimeter());
                break;
            case "RightAngleTriangle":
                System.out.println("please provide base for calculating area and perimeter of rightangletriangle");
                double base = sc.nextDouble();
                System.out.println("please provide height for calculating area and perimeter of rightangletriangle");
                double height1= sc.nextDouble();


                RightAngleTriangle rightAngleTriangle =new RightAngleTriangle(base, height1);
                rightAngleTriangle.calculateArea();
                rightAngleTriangle.calculatePerimeter();
                System.out.println("The area of RightAngleTriangle is = " +rightAngleTriangle.calculateArea());
                System.out.println("The perimeter of RightAngleTriangle is = " +rightAngleTriangle.calculatePerimeter());
                break;

            default:
                System.out.println("try other shape ");

        }







        //robort class main
//        MetaRobo metarobo = new MetaRobo();
//
//        metarobo.hardstop();

        //AbstractRobort ar=new AbstractRobort("chitty");



        //employee class main
//        Employee emp = new Employee();
//        FullTime ft= new FullTime();
//
//        PartTime pt= new PartTime();
//        Contractors ct =new Contractors();
//
//        ft.fullName ="brindha";
//       ft.salary=5000;
//       ft.fullName="brindha";
//
//        System.out.println(ft.fullName + "salary of full-time = "+ft.calculateSalary());
//
//        pt.hourlyWage =15;
//        pt.hours =10;
//        System.out.println("salary of part-time =" +pt.calculateSalary());
//
//        ct.bonus=500;
//        ct.extraSalary=300;
//        System.out.println("salary of contactors =" +ct.calculateSalary());


//        Car c=new Car(" blue", "subaru", 2015);
//        c.accelerate();
//        BMW bmw=new BMW();
//        bmw.accelerate();
//        c.drive();


    }



}
