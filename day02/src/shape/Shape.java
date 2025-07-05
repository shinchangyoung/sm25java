package shape;

public abstract class Shape {
    protected   int x;
    protected   int y;

    public Shape(){

    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // 넓이 : 추상메소드로 정의
    public abstract double getArea();
    // 둘레 : 추상메소드로 정의
    public abstract double getCircumference();

}
