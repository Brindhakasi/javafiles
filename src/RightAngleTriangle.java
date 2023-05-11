public class RightAngleTriangle extends Triangle {
    double base;
    double height;

    public RightAngleTriangle(double base, double height) {
        super();

        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        double rightAngleTriangleArea=(base*height)*0.5;
        return rightAngleTriangleArea;

    }

    @Override
    public double calculatePerimeter() {
        double rightAngleTrianglePeri=base+height+ (Math.sqrt(Math.pow(base,2)+Math.pow(height,2)));
        return rightAngleTrianglePeri;
    }
}
