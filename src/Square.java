public class Square extends Rectangle{

    public Square(double width) {
        super(width, width);

    }
@Override
    public double calculateArea(){
        double squareArea= width*width;
        return squareArea;


}
@Override
    public double calculatePerimeter(){
        double squarePeri=4*width;
        return squarePeri;
}
}
