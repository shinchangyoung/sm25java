package shape;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
