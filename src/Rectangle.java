public class Rectangle extends AbstractShape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double rectangleArea=width*height;
         return rectangleArea;
    }

    @Override
    public double calculatePerimeter() {
        double rectanglePeri =2*(width+height);
        return rectanglePeri;

    }
}
