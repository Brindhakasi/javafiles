public class Triangle extends AbstractShape{
    int base;
    int height;
    int s1, s2, s3;

    public Triangle(int base, int height, int s1, int s2, int s3) {
        this.base = base;
        this.height = height;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(int base, int height) {
        super();
    }

    public Triangle() {

    }

    @Override
    public double calculateArea() {
        double triangleArea =(base*height)*0.5;
        return triangleArea;

    }

    @Override
    public double calculatePerimeter() {
        double trianglePeri =s1+s2+s3;
        return trianglePeri;


    }
}
