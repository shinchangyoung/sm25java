package shape;

public class Graph {
    public static void main(String[] args) {

        Shape shape [] = new Shape[3];
        shape [0] = new Circle(20,20,5);
        shape [1] = new Rectangle(30,30,200,300);
        shape [2] = new Triangle(10,10,100,50);


        for(Shape s : shape){
            System.out.println(s);
            System.out.printf(" 넓이 : %f 둘레: %f \n",s.getArea(),s.getCircumference());
        }



    }
}
